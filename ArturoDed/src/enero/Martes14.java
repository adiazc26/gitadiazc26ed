package enero;

import java.util.Scanner;

public class Martes14 {

	//Crear una funci�n que calcule el mayor divisor de dos n�meros dados
	public static int mcd(int a, int b){
		int divisor = 0;
		//Buscamos el menor de los dos n�meros
		if(a<b){
			divisor = a;
		}else{
			divisor = b;
		}
		//Buscamos el divisor mayor
		while(a%divisor!=0||b%divisor!=0){//Mientras no sea divisible por a o por b
			--divisor;//Buscamos el siguiente divisor
		}
		return divisor;
	}
	//Crear una funci�n que calcule el m�nimo com�m multiplo de dos n�meros dados
		public static int mcm(int a, int b){
			int multiplo = 0;
			//Buscamos el menor de los dos n�meros
			if(a>b){
				multiplo = a;
			}else{
				multiplo = b;
			}
			//Buscamos el divisor mayor
			while(multiplo%a!=0||multiplo%b!=0){
				++multiplo;
			}
			return multiplo;
		}
	public static void main(String[] args) {
		//Leer un n�mero entero positivo mayor de 0 desde el teclado y calcular su m�ximo com�n divisor
		Scanner teclado = new Scanner(System.in);
		//declaramos las variables de los n�meros
		int a = 0;
		int b = 0;
		//Leemos los valores desde la consola
		do{
			System.out.print("Escribe el n�mero entero positivo: ");
			a = teclado.nextInt();
		}while(a<0);
		do{
			System.out.print("Escribe el n�mero entero positivo: ");
			b = teclado.nextInt();
		}while(b<0);
		//Escribimos el maximo comun divisor
		System.out.println("El m�ximo com�n divisor de " +a+ " y " +b+ " es: " + Martes14.mcd(a, b));
		System.out.println("El m�nimo com�n multiplo de " +a+ " y " +b+ " es: " + Martes14.mcm(a, b));
		teclado.close();
	}

}
