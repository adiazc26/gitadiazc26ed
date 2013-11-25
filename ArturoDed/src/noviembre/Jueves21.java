package noviembre;

import java.io.*;

public class Jueves21 {
	
	//Declara la constante EOF con valor "-1"
	private final static int EOF = -1;
	
	//Declaramos el m�todo para leer una l�nea
	public static String read(){
		//Declaraciones (dentro del m�todo)
		String linea = "";
		int car = 0;
		
		//Leer caracteres de la entrada o consola hasta final de entrada (Ctrl-Z) o final de l�nea(Intro)
		try{ //para capturar el error de entrada/salida (In/Out)
			while ((car = System.in.read()) != Jueves21.EOF) { //Lee un car�cter y lo guarda en "car" (el c�digo ASCII del car�cter)
			
				if( car == 10 || car == 13 ) {//10 y 13 en Windows representan un INTRO (final de l�nea). (en Linux utiliza s�lo uno)
			
					break; //Final de l�nea
				}
			
				linea += (char)car; //lo mete pero como car�cter, no como integer (por eso ponemos (char) delante)
				//se van metiendo caracteres y los va acumulando en "linea" de foma que se forma una palabra, frase...
			}
		
		//Vaciar el buffer de entrada (si no lo hacemos para la siguiente quedan restos)
		System.in.skip(System.in.available());
		
		} catch( IOException e ) {
			
			System.out.println(e);
			
		}
		return linea;
	}
	
	/*
	 * Calcular la fecha del d�a despu�s
	 * leer dd mm aa
	 * transformar la fecha dd, mm, aa en da, aa (da = d�a del a�o --> cada a�o tiene 365 o 366 d�as)
	 * sumamos todos los d�as de los meses anteriores al de la fecha (mm)
	 * sumamos los d�as del mes
	 * ya tengo el d�a del a�o (da)
	 */
	
	private final static int[][]calendario = {	//vector de dos dimensiones (dos �ndices ---> fila, columna)
	
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //a�os normales (el 0 es el valor de relleno)
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //a�os bisiestos
	
	};

	public static void main(String[] args) {

		//Declaraci�n de variables
		/*String mensaje = "";
		System.out.println("Escriba una l�nea: ");
		
		mensaje = Jueves21.read();
		
		System.out.println("L�nea: " + mensaje);*/
		
		//Declaraci�n de variables
		int dd = 0;
		int mm = 0;
		int aa = 0;
		int da = 0;
		int bi = 0; //0 para a�os normales, 1 para a�os bisiestos.
		String entrada = ""; //para guardar la entrada del teclado.
		
		//Leer la fecha
		System.out.print("Escribe el d�a dd: ");
		entrada = Jueves21.read(); //esto es una cadena
		dd = Integer.parseInt(entrada); //aqu� pasamos la cadena a entero
		
		System.out.print("Escribe el mes mm: ");
		entrada = Jueves21.read(); //esto es una cadena
		mm = Integer.parseInt(entrada); //aqu� pasamos la cadena a entero
		
		System.out.print("Escribe el a�o aa: ");
		entrada = Jueves21.read(); //esto es una cadena
		aa = Integer.parseInt(entrada); //aqu� pasamos la cadena a entero
		
		//System.out.println( dd + "/" + mm + "/" + aa); //si queremos comprobar la fecha le�da.
		
		//Calcular si el a�o es bisiesto
		if( aa % 4 == 0 && aa % 100 != 0 || aa % 400 == 0 ) {
			
			bi = 1; //a�o bisiesto
		}
		
		//System.out.println("Es bisiesto " + bi); //si queremos comprobar que funciona lo del bisiesto.
		
		//Calcular el d�a del a�o
		for( int m = 1; m < mm; ++m ) {  
			
			da += Jueves21.calendario[bi][m];
		}
		
		da += dd;
		System.out.println("D�a del a�o: " + da);
		

	}

}
