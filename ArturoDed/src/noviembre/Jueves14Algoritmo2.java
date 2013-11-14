package noviembre;

import octubre.Jueves31;
/*
 * Imprimir los números generados, de menor a mayor
 * ordenar el vector numeros de menor a mayor
 */
public class Jueves14Algoritmo2 {

	public static void main(String[] args) {
		int [] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; ++i){
			System.out.print((numeros[i] = Jueves31.random(1, 10)) + "\t");
			}
			System.out.println();
	//Ordenar los numeros de menor a mayor
	int aux = 0;
		for (int pasadas = 1; pasadas < numeros.length; ++pasadas){//repetir la comparacion de vecinos
			for (int i = 0; i < numeros.length - 1; ++i){//compara los vecinos
				if(numeros[i] > numeros[i+1]){//si estan desordenados los ordena
					aux = numeros [i];
					numeros [i] = numeros [i+1];
					numeros[i+1] = aux;
				}
			}//fin del for del nucleo
		}
		System.out.println("Ordenados de menor a mayor");
		//Imprimir el resultado
		for (int i = 0; i < numeros.length; ++i){
			System.out.print(numeros[i] + "\t");
			}
			System.out.println();
	}

}
