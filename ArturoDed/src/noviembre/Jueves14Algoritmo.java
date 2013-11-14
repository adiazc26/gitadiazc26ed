package noviembre;
/*
 * ALGORITMO: SUMAR 10 NUMEROS ENTEROS. CALCULAR LA MEDIA ARITMETICA Y ESCRIBIR LOS MAYORES DE LA MEDIA.
 * generar 10 números y guardarlos en un vector
 * sumo los 10 números numeros
 * para i desde 0 hasta 9 hacer
 * a sumo incrementarla en numeros [i]
 * finpara
 * divido la suma entre el numero de numeros 
 * calculo la media
 * si el numero guardado es mayor que la media lo imprimo
 */
import octubre.Jueves31;

public class Jueves14Algoritmo {

	public static void main(String[] args) {
		int [] numeros = new int[10];
		int suma = 0;
		int media = 0;
		
		for (int i = 0; i < numeros.length; ++i){
			System.out.print((numeros[i] = numeros[i] = Jueves31.random(1, 10)) + "\t");
			}
			System.out.println();
			
		for (int i = 0; i < numeros.length; ++i){
			suma += numeros [i];
		}
		
		media = suma / numeros.length;
		System.out.println("La media es: " + media);
		
		System.out.print("Los mayores que la media son: \t");
		
		for (int i = 0; i < numeros.length; ++i){
			if (numeros[i] > media ){
			System.out.print(numeros[i] + "\t");
			}
		}

	}

}
