package noviembre;
/*Sumar una serie de números enteros positivos hasta que el número generado sea el 0.
 * Para generar los números se utiliza la utilidad Jueves31.random().
 * Como salida, imprimir la suma.
 * 
 * mientras el numero no sea 0 hacer,
 * losumo
 * finmientras 
 */

import octubre.Jueves31;

public class Martes12c {

	public static void main(String[] args) {
		//declarar las variables
				int n = 0;
				int suma = 0; //sin numeros leidos la suma es 0
				//Implementamos el algoritmo
				while ((n = Jueves31.random(0, 10)) != 0){
					System.out.print(n + "\t");
					suma += n;
				}
			System.out.println("\nLa suma  de la serie de números es: " + suma);

	}

}
