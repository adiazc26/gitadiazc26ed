package diciembre;

public class Martes10 {

	/*
	 * Muestra los numeros primos que hay del 1 al 100. Mientras no haya
	 * terminado con el rango de numeros, hacer si el numero es primo entonces
	 * escribir numero finsi finmientras
	 */

	public static boolean primo(int numero) {
		boolean respuesta = true;
		int divisor = numero - 1;
		if (numero == 1) {
			respuesta = true;
		} else {

			while (numero % divisor != 0) {
				--divisor;
			}
			if (divisor == 1) {
				respuesta = true;
			} else {
				respuesta = false;
			}
		}
		return respuesta;
	}

	public static void main(String[] args) {
		
		System.out.println("Los números primos desde 1 al 100: ");
		
		int numero;

		for(numero = 1; numero <= 100; ++numero){
			if(Martes10.primo(numero)==true){
				System.out.print(numero + "\t");
			}
		}
		System.out.println("\nAhora los 100 primeros números: ");
		int primos = 100;
		numero = 0;
		while (primos>0){
			if(Martes10.primo(numero)==true){
				System.out.print(numero+"\t");
				--primos;
			}
			++numero;
		}
	}

}
