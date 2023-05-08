import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BiblioParking {

	public static void main(String[] args) {

		String rutaApp = System.getProperty("user.dir");
		String rutaFichero01 = rutaApp + "\\discos.txt";
		String rutaFichero02 = rutaApp + "\\libros.txt";
		String rutaFichero03 = rutaApp + "\\peliculas.txt";
		String rutaFichero04 = rutaApp + "\\coches.txt";
		String rutaFichero05 = rutaApp + "\\plazas.txt";

		 ArrayList<Alquilable> Alquilables =new ArrayList<Alquilable>(); //Creamos un array list que alberga todos productos alquilables. A diferencia del arraylist anterior, este ha de ser de "Alquilables" ya que no todos los "articulos" dependen de la clase producto

		
		try { //Leemos los datos que hay en cada uno de los 5 ficheros
			FileReader lector01 = new FileReader(rutaFichero01);
			BufferedReader bfr01 = new BufferedReader(lector01);
			String registro01 = bfr01.readLine();
			FileReader lector02 = new FileReader(rutaFichero02);
			BufferedReader bfr02 = new BufferedReader(lector02);
			String registro02 = bfr02.readLine();
			FileReader lector03 = new FileReader(rutaFichero03);
			BufferedReader bfr03 = new BufferedReader(lector03);
			String registro03 = bfr03.readLine();
			FileReader lector04 = new FileReader(rutaFichero04);
			BufferedReader bfr04 = new BufferedReader(lector04);
			String registro04 = bfr04.readLine();
			FileReader lector05 = new FileReader(rutaFichero05);
			BufferedReader bfr05 = new BufferedReader(lector05);
			String registro05 = bfr05.readLine();
		
			while (registro01 != null) { 
				String datos01[] = registro01.split(",");//Separando por las comas, guardamos lo que está escrito en el fichero como string
				producto p1 = new DVDMusica(datos01[0], datos01[1], Integer.parseInt(datos01[2]), datos01[3]); //A cada dato del string le corresponde un atributo de la clase producto
				if(datos01[4].equals("true")) { //Para el 5º dato del string, que corresponde con el dato si está o no alquilado, si el string es true significa que está alquilado
					p1.setAlquilado(true);//por lo que llamamos al set y lo actualizamos a true
				}
				
				Alquilables.add(p1); //añadimos el producto al array de productos alquilables
				registro01 = bfr01.readLine(); //leemos la siguiente linea y repetimos
			}
			//HACEMOS LO MISMO, CON LOS DEMÁS FICHEROS.
		 while (registro02 != null) {
				String datos02[] = registro02.split(",");
				producto p2 = new libro(datos02[0], datos02[1], datos02[2], Integer.parseInt(datos02[3]));
				if(datos02[4].equals("true")) {
					p2.setAlquilado(true);
				}
				Alquilables.add(p2);
				registro02 = bfr02.readLine();
			}
			while (registro03 != null) {
				String datos03[] = registro03.split(",");
				producto p3 = new pelicula(datos03[0], datos03[1], Integer.parseInt(datos03[2]), datos03[3], datos03[4]);
				if(datos03[5].equals("true")) {
					p3.setAlquilado(true);
				}
				Alquilables.add(p3);		
				registro03 = bfr03.readLine();
			}
			
			while (registro04 != null) {
				String datos04[] = registro04.split(",");
				vehiculo v1 = new vehiculo(datos04[0], datos04[1], datos04[2], Boolean.parseBoolean(datos04[3]), LocalDate.parse(datos04[4]),LocalDate.parse(datos04[5]));
				if(datos04[3].equals("true")) {
					v1.setAlquilado(true);
				}
				Alquilables.add(v1);		
				registro04 = bfr04.readLine();
			}
			
			while (registro05 != null) {
				String datos05[] = registro05.split(",");
				plazasParking pp1 = new plazasParking(datos05[0], Integer.parseInt(datos05[1]), Boolean.parseBoolean(datos05[2]), LocalTime.parse(datos05[3]),LocalTime.parse(datos05[4]));
				if(datos05[2].equals("true")) {
					pp1.setAlquilada(true);
				}
				Alquilables.add(pp1);		
				registro05 = bfr05.readLine();
			}
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error acceso al fichero");
		}
		
		int opcion; //Hacemos el manú con las opciones
		boolean salir = false;
		do {
			
			System.out.println();
			System.out.println("Escoja una de las opciones, por favor:");
			System.out.println("1.Alquilar un libro.");
			System.out.println("2.Alquilar una pelicula.");
			System.out.println("3.Alquilar un DVD de música.");
			System.out.println("4.Devolver un producto.");
			System.out.println("5.Ver todos los productos disponibles.");
			System.out.println("6.Alquilar un vehículo.");
			System.out.println("7.Devolver un vehículo.");
			System.out.println("8.Alquilar una plaza de aparcamiento.");
			System.out.println("9.Guardar información en Ficheros.");
			System.out.println("10.SALIR");

			Scanner lector = new Scanner(System.in);
			System.out.print("Introduce número de la opción deseada: ");
			opcion = lector.nextInt();

				switch (opcion) {
		case 1: 
			System.out.println("Titulos de libros disponibles para alquiler:"); 
			
			for(Alquilable pr: Alquilables) { //Recorremos el arraylist con un for each, para poder así direccionar al producto que queremos, en este caso los libros.
				if(pr instanceof libro) {
					libro libro=(libro)pr;
					if(libro.isAlquilado()==false) { //Si la funcio isAlquilado es falsa
						System.out.println(libro.codigo+" "+libro.titulo);//imprime todos los títulos disponibles
					}
				}
			}
			
			String cod;
			Scanner lector01 = new Scanner(System.in);
			System.out.print("Introduce el código del libro que se desee alquilar: ");
			cod = lector01.nextLine();
			
			for(Alquilable pro: Alquilables) {
				if(pro instanceof libro) { //Recorremos el arraylist
					libro l=(libro)pro;
					if(l.getCodigo().equals(cod)) { //Si el código introducido por el usuario coindice con el del libro disponible
						l.alquilar();//llamamos a la funcion y lo alquilamos
						System.out.println("Libro alquilado con éxito");
						System.out.println(l.toString());
						System.out.println("La devolución se tiene que realizar en 10 dias.");
						System.out.println("La fecha de hoy es: " +LocalDate.now());
						System.out.println("La fecha de devolución sera: "+LocalDate.now().plusDays(10));
					}
				}
				
			}
			
			break;
		case 2: //HACEMOS LO MISMO PARA LAS PELICULAS
            System.out.println("Titulos de peliculas disponibles para alquiler:"); 
			
			for(Alquilable pr: Alquilables) {
				if(pr instanceof pelicula) {
					pelicula peli=(pelicula)pr;
					if(peli.isAlquilado()==false) {
						System.out.println(peli.codigo+" "+peli.titulo);
					}
				}
			}
			
			String cod02;
			Scanner lector02 = new Scanner(System.in);
			System.out.print("Introduce el código de la película que se desee alquilar: ");
			cod = lector02.nextLine();
			
			for(Alquilable pro: Alquilables) {
				if(pro instanceof pelicula) {
					pelicula p=(pelicula)pro;
					if(p.getCodigo().equals(cod)) {
						p.alquilar();
						System.out.println("Pelicula alquilada con éxito");
						System.out.println(p.toString());
						System.out.println("La devolución se tiene que realizar en 5 dias.");
						System.out.println("La fecha de hoy es: " +LocalDate.now());
						System.out.println("La fecha de devolución sera: "+LocalDate.now().plusDays(5));
					}
				}
				
			}
			
			break;
			
		case 3: //HACEMOS LO MISMO PARA LOS MUSICALES
			 System.out.println("Titulos de DVD's Musicales disponibles para alquiler:"); 
				
				for(Alquilable pr: Alquilables) {
					if(pr instanceof DVDMusica) {
						DVDMusica musica=(DVDMusica)pr;
						if(musica.isAlquilado()==false) {
							System.out.println(musica.codigo+" "+musica.titulo);
						}
					}
				}
				
				String cod03;
				Scanner lector03 = new Scanner(System.in);
				System.out.print("Introduce el código del DVD Musical que se desee alquilar: ");
				cod = lector03.nextLine();
				
				for(Alquilable pro: Alquilables) {
					if(pro instanceof DVDMusica) {
						DVDMusica cd=(DVDMusica)pro;
						if(cd.getCodigo().equals(cod)) {
							cd.alquilar();
							System.out.println("Pelicula alquilada con éxito");
							System.out.println(cd.toString());
							System.out.println("La devolución se tiene que realizar en 3 dias.");
							System.out.println("La fecha de hoy es: " +LocalDate.now());
							System.out.println("La fecha de devolución sera: "+LocalDate.now().plusDays(3));
						}
					}
					
				}
				
				break;
		case 4: 
		    System.out.println("Productos alquilados pendientes de devolución:");
			for(Alquilable pr: Alquilables) {
				if(pr instanceof producto) {
					producto producto=(producto)pr;
				if(producto.isAlquilado()==true) {//En el for each, si los productos alquilables están alquilados,
					System.out.println(producto.codigo+" "+producto.titulo);//improme codigo y título
				}
			}
			}
			
			String cod05;
			Scanner lector05 = new Scanner(System.in);
			System.out.print("Introduce el código del producto que se desee devolver: ");
			cod05 = lector05.nextLine();
			
			for(Alquilable producto: Alquilables) {
				if(producto instanceof producto) {
					producto pro=(producto)producto;
				if(pro.codigo.equals(cod05)) { //Si el código introducido coincide con el del producto
					pro.devolver(); //llamamos a la funcion que devuelve el producto
					System.out.println(pro.toString());
					System.out.println("El producto se ha devuelto exitosamente.");
				}
			}
			}
			break;
		case 5:
			System.out.println("Todos los productos disponibles para alquilar son los siguientes.");
			for(Alquilable pr:Alquilables) {
				if(pr instanceof producto) {
					producto pt=(producto)pr;
				if(pt.isAlquilado()==false) {
					System.out.println(pt.toString());
				}
			}
			}
			break;
			
		case 6:
			
                System.out.println("Vehículos disponibles para alquiler:"); 
			
			for(Alquilable pr: Alquilables) { //Recorremos el arraylist con un for each, para poder así direccionar al producto que queremos, en este caso los coches.
				if(pr instanceof vehiculo) {
					vehiculo coche=(vehiculo)pr;
					if(coche.isAlquilado()==false) { //Si la funcio isAlquilado es falsa
						System.out.println(coche.matricula+" "+coche.marca);//imprime todos las matriculas y marcas disponibles
					}
				}
			}
			
			String matricula;
			Scanner lector06 = new Scanner(System.in);
			System.out.print("Introduce la matrícula del coche que se desee alquilar: ");
			matricula = lector06.nextLine();
			
			for(Alquilable pro: Alquilables) {
				if(pro instanceof vehiculo) { //Recorremos el arraylist
					vehiculo coche=(vehiculo)pro;
					if(coche.getMatricula().equals(matricula)) { //Si la matricula introducida por el usuario coindice con el del coche disponible
						coche.alquilar();//llamamos a la funcion y lo alquilamos
						System.out.println("Vehículo alquilado con éxito");
						System.out.println("La devolución se tiene que realizar en 20 dias.");
						System.out.println("La fecha de hoy es: " +LocalDate.now());
						System.out.println("La fecha de devolución sera: "+LocalDate.now().plusDays(20));
					}
				}
				
			}
			
			break;
			
		case 7:
			System.out.println("Vehículos pendientes de devolución" ); //de la misma forma, recooremos el arraylist alquilable 
			for( Alquilable al: Alquilables) {
				if(al instanceof vehiculo) { //direccionamos a los productos que están en la clase vehiculo
					vehiculo coche=(vehiculo)al;
					if(coche.alquilado==true) { //si está alquilado
						System.out.println(coche.matricula+" "+coche.marca); //imprimematrícula y marca
					}
				}
			}
			
			String matricula1;
			Scanner lector07 = new Scanner(System.in);
			System.out.print("Introduce la matrícula del coche que se desee devolver: ");
			matricula1 = lector07.nextLine();
			
			for(Alquilable al:Alquilables) {
				if(al instanceof vehiculo) {
					vehiculo coche=(vehiculo)al;
					if(coche.getMatricula().equals(matricula1)) { //si  la matricula  introducida coincide con la de un coche que está alquilado
						coche.devolver(); //llamamos a la función y devuelve el coche
						System.out.println("El vehículo se ha devuelto exitosamente");
						
					}
					
					
				}
			}
			break;
			
		case 8:
			
			
            System.out.println("Plazas disponibles para alquilar:"); 
		
		for(Alquilable pr: Alquilables) { //Recorremos el arraylist con un for each, para poder así direccionar al producto que queremos, en este caso los plazas.
			if(pr instanceof plazasParking) {
				plazasParking plaza=(plazasParking)pr;
				if(plaza.isAlquilada()==false) { //Si la funcio isAlquilado es falsa
					System.out.println(plaza.codigo+"correspondiente a la plaza nº: "+plaza.numeroPlaza);//imprime todos los códicos de plazas y su correspondiente número
				}
			}
		}
		
		String numero;
		Scanner lector10 = new Scanner(System.in);
		System.out.print("Introduce el codigo de la plaza que desee alquilar: ");
		numero = lector10.nextLine();
		
		for(Alquilable pro: Alquilables) {
			if(pro instanceof plazasParking) { //Recorremos el arraylist
				plazasParking plaza=(plazasParking)pro;
				if(plaza.getCodigo().equals(numero)) { //Si el código introducido por el usuario coindice con el de la plaza disponible
					plaza.alquilar();//llamamos a la funcion y lo alquilamos
					System.out.println("Plaza alquilada con éxito");
					System.out.println("La devolución se tiene que realizar en 5 horas.");
					System.out.println("La fecha de hoy es: " +LocalTime.now());
					System.out.println("La fecha de devolución sera: "+LocalTime.now().plusHours(5));
				}
			}
			
		}
		
		break;	
			
		case 9:
			
					try {
						FileWriter escritorLibro =new FileWriter(rutaFichero02);
						BufferedWriter bfwLibro =new BufferedWriter(escritorLibro);
						
						for(Alquilable pro: Alquilables) {
							if(pro instanceof libro) { //For each para listar lo libros
								libro libro= (libro)pro;
								if(libro.isAlquilado()==true) {	//si está alquilado guarda en fichero de la siguiente forma, añadiendo día de alquiler y el día de la devolucion
									
								bfwLibro.write(libro.toStringFichero()+","+LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+","+LocalDate.now().plusDays(10).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
								bfwLibro.newLine();
							}	
								else if(libro.isAlquilado()==false) { //Si el libro está disponible donde deberían ir las fechas las guarda con un 0
								bfwLibro.write(libro.toStringFichero()+","+"0"+","+"0");
								bfwLibro.newLine();
							}
								
							}	
								
						}
						
						bfwLibro.close();
						escritorLibro.close();
						
						///////REPETIMOS EL PROCESO PARA PELIS , CD'S MUSICALES, VEHÍCULOS Y PLAZAS////////
						
						FileWriter escritorPelicula =new FileWriter(rutaFichero03);
						BufferedWriter bfwPelicula =new BufferedWriter(escritorPelicula);
						
						for(Alquilable pro: Alquilables) {
							if(pro instanceof pelicula) {
								pelicula peli= (pelicula)pro;
								if(peli.isAlquilado()==true) {
								bfwPelicula.write(peli.toStringFichero()+","+LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+","+LocalDate.now().plusDays(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))); 
								bfwPelicula.newLine();
							}else if(peli.isAlquilado()==false) {
								bfwPelicula.write(peli.toStringFichero()+","+"0"+","+"0"); 
								bfwPelicula.newLine();
							}
								
							}
								
						}
						
						bfwPelicula.close();
						escritorPelicula.close();
						
						FileWriter escritorMusic =new FileWriter(rutaFichero01);
						BufferedWriter bfwMusic =new BufferedWriter(escritorMusic);
						
						for(Alquilable pro: Alquilables) {
							if(pro instanceof DVDMusica) {
								DVDMusica musi= (DVDMusica)pro;
								if(musi.isAlquilado()==true) {
								bfwMusic.write(musi.toStringFichero()+","+LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+","+LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))); 
								bfwMusic.newLine();	
							}else if(musi.isAlquilado()==false) {
								bfwMusic.write(musi.toStringFichero()+","+"0"+","+"0"); 
								bfwMusic.newLine();	
							}
								
							}	
						}
						bfwMusic.close();
						escritorMusic.close();
						
						
						
							FileWriter escritorCoche =new FileWriter(rutaFichero04);
							BufferedWriter bfwCoche =new BufferedWriter(escritorCoche);
							
							for(Alquilable pro: Alquilables) {
								if(pro instanceof vehiculo) { 
									vehiculo coche= (vehiculo)pro;
									if(coche.isAlquilado()==true) {	
										
									bfwCoche.write(coche.toStringFichero());
									bfwCoche.newLine();
								}	
									else if(coche.isAlquilado()==false) { 
									bfwCoche.write(coche.toStringFichero());
									bfwCoche.newLine();
								}
									
								}	
									
							}
							
							bfwCoche.close();
							escritorCoche.close();
							
							
							
								FileWriter escritorPlaza =new FileWriter(rutaFichero05);
								BufferedWriter bfwPlaza =new BufferedWriter(escritorPlaza);
								
								for(Alquilable pro: Alquilables) {
									if(pro instanceof plazasParking) { 
										plazasParking plaza= (plazasParking)pro;
										if(plaza.isAlquilada()==true) {	
											
										bfwPlaza.write(plaza.toStringFichero());
										bfwPlaza.newLine();
									}	
										else if(plaza.isAlquilada()==false) { 
										bfwPlaza.write(plaza.toStringFichero());
										bfwPlaza.newLine();
									}
										
									}	
										
								}
								
								bfwPlaza.close();
								escritorPlaza.close();
									
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
		case 10:
			salir = true;
			break;
		default:
			System.out.println("Pulse 10 para salir");
			
		}//Fin del switch
	

	} while (!salir);

}



	}


