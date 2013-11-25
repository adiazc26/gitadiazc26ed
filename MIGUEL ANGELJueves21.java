package noviembre;

import java.io.*;

public class Jueves21 {
	
	//Declara la constante EOF con valor "-1"
	private final static int EOF = -1;
	
	//Declaramos el método para leer una línea
	public static String read(){
		//Declaraciones (dentro del método)
		String linea = "";
		int car = 0;
		
		//Leer caracteres de la entrada o consola hasta final de entrada (Ctrl-Z) o final de línea(Intro)
		try{ //para capturar el error de entrada/salida (In/Out)
			while ((car = System.in.read()) != Jueves21.EOF) { //Lee un carácter y lo guarda en "car" (el código ASCII del carácter)
			
				if( car == 10 || car == 13 ) {//10 y 13 en Windows representan un INTRO (final de línea). (en Linux utiliza sólo uno)
			
					break; //Final de línea
				}
			
				linea += (char)car; //lo mete pero como carácter, no como integer (por eso ponemos (char) delante)
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
	 * Calcular la fecha del día después
	 * leer dd mm aa
	 * transformar la fecha dd, mm, aa en da, aa (da = día del año --> cada año tiene 365 o 366 días)
	 * sumamos todos los días de los meses anteriores al de la fecha (mm)
	 * sumamos los días del mes
	 * ya tengo el día del año (da)
	 */
	
	private final static int[][]calendario = {	//vector de dos dimensiones (dos índices ---> fila, columna)
	
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //años normales (el 0 es el valor de relleno)
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //años bisiestos
	
	};

	public static void main(String[] args) {

		//Declaración de variables
		/*String mensaje = "";
		System.out.println("Escriba una línea: ");
		
		mensaje = Jueves21.read();
		
		System.out.println("Línea: " + mensaje);*/
		
		//Declaración de variables
		int dd = 0;
		int mm = 0;
		int aa = 0;
		int da = 0;
		int bi = 0; //0 para años normales, 1 para años bisiestos.
		String entrada = ""; //para guardar la entrada del teclado.
		
		//Leer la fecha
		System.out.print("Escribe el día dd: ");
		entrada = Jueves21.read(); //esto es una cadena
		dd = Integer.parseInt(entrada); //aquí pasamos la cadena a entero
		
		System.out.print("Escribe el mes mm: ");
		entrada = Jueves21.read(); //esto es una cadena
		mm = Integer.parseInt(entrada); //aquí pasamos la cadena a entero
		
		System.out.print("Escribe el año aa: ");
		entrada = Jueves21.read(); //esto es una cadena
		aa = Integer.parseInt(entrada); //aquí pasamos la cadena a entero
		
		//System.out.println( dd + "/" + mm + "/" + aa); //si queremos comprobar la fecha leída.
		
		//Calcular si el año es bisiesto
		if( aa % 4 == 0 && aa % 100 != 0 || aa % 400 == 0 ) {
			
			bi = 1; //año bisiesto
		}
		
		//System.out.println("Es bisiesto " + bi); //si queremos comprobar que funciona lo del bisiesto.
		
		//Calcular el día del año
		for( int m = 1; m < mm; ++m ) {  
			
			da += Jueves21.calendario[bi][m];
		}
		
		da += dd;
		System.out.println("Día del año: " + da);
		

	}

}
