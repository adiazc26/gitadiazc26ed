package noviembre;

import octubre.Jueves31;

public class Martes12b {
 /*Sumar una serie de n�meros enteros positivos hasta que el n�mero generado sea el 0.
 * Para generar los n�meros se utiliza la utilidad Jueves31.random().
 * Como salida, imprimir la suma. 
 * 
 * hacer
 * generar un numero
 * si no es 0 entonces
 * lo sumo
 * finsi
 * mientras no sea 0
 * imprimir la suma
 */

	public static void main(String[] args) {
		int n = 0;
		int suma = 0;
		do{
			n = Jueves31.random(0, 10);
			System.out.print(n + "\t");
			if(n != 0){
				suma += n;
			}
		}while(n != 0);
		System.out.println("\n\nLa suma  de la serie de n�meros es: " + suma);
	}
}
