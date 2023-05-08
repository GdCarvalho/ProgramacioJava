import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		

		

			String rutaApp = System.getProperty("user.dir");
			String rutaFichero01 = rutaApp + "\\discos.txt";
			String rutaFichero02 = rutaApp + "\\libros.txt";
			String rutaFichero03 = rutaApp + "\\peliculas.txt";

			 ArrayList<producto> Alquilables =new ArrayList<producto>(); //Creamos un array list que alberga productos

			
			try { //Leemos los datos que hay en cada uno de los 3 ficheros
				FileReader lector01 = new FileReader(rutaFichero01);
				BufferedReader bfr01 = new BufferedReader(lector01);
				String registro01 = bfr01.readLine();
				FileReader lector02 = new FileReader(rutaFichero02);
				BufferedReader bfr02 = new BufferedReader(lector02);
				String registro02 = bfr02.readLine();
				FileReader lector03 = new FileReader(rutaFichero03);
				BufferedReader bfr03 = new BufferedReader(lector03);
				String registro03 = bfr03.readLine();
			
				while (registro01 != null) { 
					String datos01[] = registro01.split(",");//Separando por las comes, guardamos lo que está escrito en el fichero como string
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
				System.out.println("6.Guardar información en Ficheros.");
				System.out.println("7.SALIR");

				Scanner lector = new Scanner(System.in);
				System.out.print("Introduce número de la opción deseada: ");
				opcion = lector.nextInt();

					switch (opcion) {
			case 1: 
				System.out.println("Titulos de libros disponibles para alquiler:"); 
				
				for(producto pr: Alquilables) { //Recorremos el arraylist con un for each, para poder así direccionar al producto que queremos, en este caso los libros.
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
				
				for(producto pro: Alquilables) {
					if(pro instanceof libro) { //Recorremos el arraylist
						libro l=(libro)pro;
						if(l.getCodigo().equals(cod)) { //Si el código introducido por el usuario coindice con el del libro disponible
							l.alquilar();//llamamos a la funcion y lo alquilamos
							System.out.println("Libro alquilado con éxito");
							System.out.println("La devolución se tiene que realizar en 10 dias.");
							System.out.println("La fecha de hoy es: " +LocalDate.now());
							System.out.println("La fecha de devolución sera: "+LocalDate.now().plusDays(10));
						}
					}
					
				}
				
				break;
			case 2: //HACEMOS LO MISMO PARA LAS PELICULAS
                System.out.println("Titulos de peliculas disponibles para alquiler:"); 
				
				for(producto pr: Alquilables) {
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
				
				for(producto pro: Alquilables) {
					if(pro instanceof pelicula) {
						pelicula p=(pelicula)pro;
						if(p.getCodigo().equals(cod)) {
							p.alquilar();
							System.out.println("Pelicula alquilada con éxito");
							System.out.println("La devolución se tiene que realizar en 5 dias.");
							System.out.println("La fecha de hoy es: " +LocalDate.now());
							System.out.println("La fecha de devolución sera: "+LocalDate.now().plusDays(5));
						}
					}
					
				}
				
				break;
				
			case 3: //HACEMOS LO MISMO PARA LOS MUSICALES
				 System.out.println("Titulos de DVD's Musicales disponibles para alquiler:"); 
					
					for(producto pr: Alquilables) {
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
					
					for(producto pro: Alquilables) {
						if(pro instanceof DVDMusica) {
							DVDMusica cd=(DVDMusica)pro;
							if(cd.getCodigo().equals(cod)) {
								cd.alquilar();
								System.out.println("Pelicula alquilada con éxito");
								System.out.println("La devolución se tiene que realizar en 3 dias.");
								System.out.println("La fecha de hoy es: " +LocalDate.now());
								System.out.println("La fecha de devolución sera: "+LocalDate.now().plusDays(3));
							}
						}
						
					}
					
					break;
			case 4: 
			    System.out.println("Productos alquilados pendientes de devolución:");
				for(producto pr: Alquilables) {
					if(pr.isAlquilado()==true) {//En el for each, si los productos alquilables están alquilados,
						System.out.println(pr.codigo+" "+pr.titulo);//imprime codigo y título
					}
				}
				
				String cod05;
				Scanner lector05 = new Scanner(System.in);
				System.out.print("Introduce el código del producto que se desee devolver: ");
				cod05 = lector05.nextLine();
				
				for(producto producto: Alquilables) {
					if(producto.codigo.equals(cod05)) { //Si el código introducido coincide con el del producto
						producto.devolver(); //llamamos a la funcion que devuelve el producto
						System.out.println(producto.toString());
						System.out.println("El producto se ha devuelto exitosamente.");
					}
				}
				break;
			case 5:
				System.out.println("Todos los productos disponibles para alquilar son los siguientes.");
				for(producto pr:Alquilables) {
					if(pr.isAlquilado()==false) {
						System.out.println(pr.toString());
					}
				}
				break;
			case 6:
				
						try {
							FileWriter escritorLibro =new FileWriter(rutaFichero02);
							BufferedWriter bfwLibro =new BufferedWriter(escritorLibro);
							
							for(producto pro: Alquilables) {
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
							//REPETIMOS EL PROCESO PARA PELIS Y CD'S MUSICALES
							FileWriter escritorPelicula =new FileWriter(rutaFichero03);
							BufferedWriter bfwPelicula =new BufferedWriter(escritorPelicula);
							
							for(producto pro: Alquilables) {
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
							
							for(producto pro: Alquilables) {
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
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
			case 7:
				salir = true;
				break;
			default:
				System.out.println("Pulse 7 para salir");
				
			}//Fin del switch
		

		} while (!salir);

	}

}
