/**
*Clase que sirve como gestor de cartas
*Objetivo: Ejercitarse en​​ el​​ almacenamiento​ y​ recuperación​ de​ objetos persistentes​ mediante​​ el​​ uso​​ del​​ concepto​ de​ ​ serialización​ a la​ vez​ que​ ​refuerza​ ​sus​ ​conocimientos acerca​ ​del​ ​manejo​ ​de​ ​excepciones.
*@author Mauricio Chávez Olea
*@version 08122017
*@see Carta.class
**/

import java.util.Scanner;
import java.io.*;

public class GestorDeCartas{
	private static String nombre;
	private static String correo;
	private static String opcionRepetir;
	private static int opcion;
	private static Scanner in = new Scanner(System.in);
	private static Scanner num = new Scanner(System.in);
	private static boolean repetir = false;

	//METODOS

	/**
	*Método estático que da la bienvenida al programa
	**/
	private static void bienvenida(){
		System.out.print("\nBienvenido\nIngresa tu nombre: ");
		nombre = in.nextLine();
		System.out.print("\n" + nombre + ", ingresa tu correo electronico: ");
		correo = in.nextLine();
		System.out.println("\n");
	}

	/**
	*Método estático que despliega el menu y lee una opcion
	**/
	private static void desplegarMenu(){
		System.out.println("Elija una opcion:");
		System.out.println("\n1. Escribir carta");
		System.out.println("2. Leer carta");
		System.out.println("\nEscriba cualquier otra cosa para salir:");
		try{
			opcion = num.nextInt();
		}catch(java.util.InputMismatchException e){}
	}

	/**
	*Método estático que escribe una carta con los datos proporcionados por el usuario en un archivo con un nombre proporcionado por el usuario
	**/
	private static void escribirCarta(){

		String nombreDestinatario;
		String correoDestinatario;
		String textoCarta;
		String nombreArchivo;
		ObjectOutputStream escritor = null;

		System.out.print("Escribe el nombre del destinatario: ");
		nombreDestinatario = in.nextLine();
		System.out.print("\nEscribe su correo: ");
		correoDestinatario = in.nextLine();
		System.out.println("\nEscribe el texto de la carta:");
		textoCarta = in.nextLine();
		System.out.println("Ingresa un nombre para tu archivo: ");
		nombreArchivo = in.nextLine();

		nombreArchivo = nombreArchivo.trim() + ".txt";

		try{
			escritor = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
			escritor.writeObject(new Carta(nombre,correo,nombreDestinatario,correoDestinatario,textoCarta));
		}catch(NotSerializableException e){
			System.out.println("Error en la grabacion. Objeto no serializable");
		}catch(IOException e){
			System.out.println("Error en la grabacion: " + e);
		}finally{
			if(escritor!=null){
				System.out.println("Cerrando el archivo " + nombreArchivo);
				try{
					escritor.close();
				}catch(IOException e){}
			}else{
				System.out.println("No hay ningún archivo abierto");
			}
		}
	}

	/**
	*Método estático que lee la carta contenida en el nombre de archivo proporcionado por el usuario
	**/
	private static void leerCarta(){
		ObjectInputStream lector = null;
		String nombreArchivo;

		System.out.println("Escribe el nombre del archivo donde se guardo la carta que desea visualizar:");
		nombreArchivo = in.nextLine();
		nombreArchivo = nombreArchivo.trim() + ".txt";

		try{
			lector = new ObjectInputStream(new FileInputStream(nombreArchivo));
			Carta obj;
			do{
				obj = (Carta) lector.readObject();
				System.out.println("\n" + obj.toString() + "\n");
			}while(obj!=null);
		}catch(EOFException e){
			System.out.println("Fin de la lectura del archivo");
		}catch(ClassNotFoundException e){
			System.out.println("El objeto recuperado no es de la clase Carta");
		}catch(FileNotFoundException e){
			System.out.println("El archivo " + nombreArchivo + " no existe");
		}catch(IOException e){
			System.out.println("Error " + e);
		}finally{
			if(lector!=null){
				System.out.println("Cerrando el archivo " + nombreArchivo);
				try{
					lector.close();
				}catch(IOException e){}
			}else{
				System.out.println("No hay archivo abierto");
			}
		}
	}

	/**
	*Método estático que cierra el programa
	**/
	private static void terminarPrograma(){
		System.out.println("Hasta luego");
		System.exit(0);
	}

	/**
	*Método estático pregunta si se quiere repetir el menu y sus respectivas opciones
	**/
	private static void repeticion(){
		System.out.println("\n¿Desea escribir o leer otra carta?");
		System.out.println("Ingrese 1 para desplegar el menu, o ingrese otra cosa en caso contrario");
		opcionRepetir = in.nextLine();
		if(opcionRepetir.equals("1"))
			repetir=true;
		else repetir=false;
	}

	//MAIN

	/**
	*Método main que ejecuta el programa para gestionar cartas
	*@param args -- Argumentos del main. En este programa no se ocupan los argumentos.
	**/
	public static void main(String[] args){
		GestorDeCartas.bienvenida();
		do{
			GestorDeCartas.desplegarMenu();
			switch(opcion){
				case 1:
				GestorDeCartas.escribirCarta();
				break;

				case 2:
				GestorDeCartas.leerCarta();
				break;

				default:
				GestorDeCartas.terminarPrograma();
				break;
			}
		GestorDeCartas.repeticion();
		}while(repetir);
		System.out.println("\nHasta luego");
	}

}