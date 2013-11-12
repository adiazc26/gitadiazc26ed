package noviembre;

import octubre.Jueves31;

public class Martes12a {
/* Sumar una serie de números enteros positivos hasta que el número generado sea el 0.
 * Para generar los números se utiliza la utilidad Jueves31.random().
 * Como salida, imprimir la suma.
 * 
 * ALGORITMO:
 * Generar un numero, 
 * mientras no sea 0 hacer
 * lo sumo
 * generar un numero
 * finmientras  
*/
	public static void main(String[] args) {
		//declarar las variables
		int n = 0;
		int suma = 0; //sin numeros leidos la suma es 0
		//Implementamos el algoritmo
		n = Jueves31.random(0, 10); //así se generan del 0 al 9.
		System.out.print(n + "\t");
		while (n != 0){
			suma = suma + n; //contraido seria: suma += n
			n = Jueves31.random(0, 10);
			System.out.print(n + "\t");
		}
	System.out.println("\n\nLa suma  de la serie de números es: " + suma);
	}

}
