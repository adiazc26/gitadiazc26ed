package diciembre;

import java.util.Scanner;
//import java.io.*;
//import java.util.*;


public class Jueves12 {

	// Contar el número de elementos positivos, negativos y ceros que hay en una
	// serie leída desde la consola.

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//int dim=20;
		int dim = 0;

		//System.out.println(“Leer los números desde el teclado y guardarlos en un array: ”);
		System.out.println("Introduce cuantos números quieres guardar en el array: ");
		
		dim = teclado.nextInt();

		//int[]numeros = new int[20];
		int[] numeros = new int[dim];
		int pos = 0, neg = 0, cer = 0;

		//Cambiado el signo y quitado el -1
		for (int i = 0; i < numeros.length; ++i) {
			//Arreglado la historia de los corchetes, el do no haría falta.
			System.out.print("Número " + (i + 1) + ":");
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
		
		System.out.println("Números positivos: " + pos);
		System.out.println("Números negativos: " + neg);
		System.out.println("Número de ceros: " + cer);

		teclado.close();

	}

}
