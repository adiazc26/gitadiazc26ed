package diciembre;

import java.util.Scanner;
//import java.io.*;
//import java.util.*;


public class Jueves12 {

	// Contar el n�mero de elementos positivos, negativos y ceros que hay en una
	// serie le�da desde la consola.

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//int dim=20;
		int dim = 0;

		//System.out.println(�Leer los n�meros desde el teclado y guardarlos en un array: �);
		System.out.println("Introduce cuantos n�meros quieres guardar en el array: ");
		
		dim = teclado.nextInt();

		//int[]numeros = new int[20];
		int[] numeros = new int[dim];
		int pos = 0, neg = 0, cer = 0;

		//Cambiado el signo y quitado el -1
		for (int i = 0; i < numeros.length; ++i) {
			//Arreglado la historia de los corchetes, el do no har�a falta.
			System.out.print("N�mero " + (i + 1) + ":");
			numeros[i] = teclado.nextInt();
		}

		//Cambiadas las condiciones de los for y el signo del neg.
		for (int i = 0; i < numeros.length; ++i) {
			if (numeros[i] > 0) {
				++pos;
			}
		}
		
		for (int i = 0; i < numeros.length; ++i) {
			if (numeros[i] < 0) {
				++neg;
			}
		}
		
		for (int i = 0; i < numeros.length; ++i) {
			if (numeros[i] == 0) {
				++cer;
			}
		}
		
		System.out.println("N�meros positivos: " + pos);
		System.out.println("N�meros negativos: " + neg);
		System.out.println("N�mero de ceros: " + cer);

		teclado.close();

	}

}
