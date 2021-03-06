package enero;

//M�todos Recursivos o Recursividad

import java.util.*;

public class Jueves16 {
	
	//Leer una serie de n�meros enteros hasta introducir el 0.
	//Imprimir los n�meros leidos en orden inverso a como se han introducido.
	
	public static void inversa ( Scanner teclado ) {
		
		int n = 0;
		System.out.print("Escribe un n�mero [ 0 para finalizar ]: ");
		n = teclado.nextInt();
		
		if ( n != 0 ) {
			
			Jueves16.inversa( teclado );
			System.out.println( n ); //�ltimo en entrar, primero en salir.
		}
	}
	
	//M�todo que simula el juego de "Las torres de Hanoi"
	
	public static void mover ( int discos, int origen, int destino ) {
		
		int auxiliar = 6 - origen - destino; //valor de la torre auxiliar
		
		if ( discos == 1 ) {
			
			System.out.println( "Mover disco de la Torre " + origen + " a la Torre " + destino );
		
		} else {
			
			Jueves16.mover(discos - 1, origen, auxiliar);
			Jueves16.mover(1, origen, destino);
			Jueves16.mover(discos - 1, auxiliar, destino);
		}
	}

	public static void main(String[] args) {
		
		//----Utilizar para el m�todo "inversa"------
		//Scanner teclado = new Scanner(System.in);
		//Jueves16.inversa(teclado);
		
		//----Utilizar para el m�todo "mover"-----
		int discos = 10;
		int origen = 1;
		int destino = 2;
		Jueves16.mover(discos, origen, destino);

	}

}