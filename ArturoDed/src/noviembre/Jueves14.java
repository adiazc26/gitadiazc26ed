package noviembre;

import octubre.Jueves31;

/*
 * Estructuras de datos:
 * Pueden ser estáticas o dinámicas.
 *	Las estáticas: no cambian su tamaño durante la ejecución del programa (desde la creacción hasta su destrucción).
 *	Las dinámicas: cambian su tamaño durante la ejecución del programa.
 * 		Estructura de datos estática conocida como "array": necesito conocer su tamaño, por eso es una estructura estática, y el tipo
 * de dato que guarda. 
 *
 */

public class Jueves14 {

	public static void main(String[] args) {
		//int numero = 0;  //esta variable es atómica, porque solo puede guardar un valor
		
		// Estructura de datos estática "array"
		// Declarar un array de numeros enteros
		// Lo primero, que guardo: int
		// Lo segundo, que guardo mas de un valor: []
		// Lo tercero, la incializo: new int [10], 10 son los valores que quiero guardar.
		int [] numeros = new int[10];
		// Lleno ese vector con números. Para referrir a cada elemento del vector, 
		// numeros [aqui pongo la posicion, primera el 0 y ultima dimension -1, en este caso, 9]
		// Procesamos el "array"
		// numeros [0] = Jueves31.random(1, 10); //la posicion del 0, ya está asignada. Pero para no ir uno a uno.
		for (int i = 0; i < numeros.length; ++i){
		numeros[i] = Jueves31.random(1, 10);
		System.out.print(numeros[i] + "\t");
		}
		System.out.println();
		//TODO EN UNO
		System.out.println("Todo en uno");		
		for (int i = 0; i < numeros.length; ++i){
			System.out.print((numeros[i] = numeros[i] = Jueves31.random(1, 10)) + "\t");
			}
			System.out.println();
		//Procesar el Array del ultimo al primero con todo en uno
		System.out.println("Array procesado de ultimo al primero todo en uno");		
		for (int i = numeros.length-1; i >= 0; --i){
		System.out.print((numeros[i] = numeros[i] = Jueves31.random(1, 10)) + "\t");
			}
			System.out.println();
		//Procesar el Array del ultimo al primero sin todo en uno
		System.out.println("Array procesado de ultimo al primero todo en uno");		
		for (int i = numeros.length-1; i >= 0; --i){
		numeros[i] = Jueves31.random(1, 10);
		System.out.print(numeros[i] + "\t");
			}
			System.out.println("\n");
		//ALGORITMO CON "EJERCICIO" EN JUEVES14ALGORITMO.JAVA
	}
}
