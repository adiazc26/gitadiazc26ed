package noviembre;

import octubre.Jueves31;

public class Jueves7b {
/*
 * Generar tres números enteros entre 1 y 5 distintos entre sí.
 * generar a
 * repetir
 * generar b
 * hasta que b sea distinto de a
 * repetir
 * generar c
 * hasta que c sea distinto de a y de b
 */
	public static void main(String[] args) {
		// Declarar las variables
		int a = 0;
		int b = 0;
		int c = 0;
		final int base = 1;
		final int rango = 5;
		// Implementar el código
		a = Jueves31.random(base, rango);
		do{
			b = Jueves31.random(base, rango);
		}while(b == a);
		
		do{
			System.out.println("a: " + a + " b: " + b + " c: " + c);
			c = Jueves31.random(base, rango);
			System.out.println("a: " + a + " b: " + b + " c: " + c);
		}while(c == a || c == b);
		
		//Imprimir los números para ver su valor
		//System.out.println("a: " + a + " b: " + b + " c: " + c);
	}
}
