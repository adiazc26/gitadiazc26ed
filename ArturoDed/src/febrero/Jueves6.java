package febrero;

import java.util.Scanner;

public class Jueves6 {
	
	/*public static int operacion ( int a, int b ) {
		
		int res = 0;
		res = a / b;
		return res;
	}
	
	//EL ERROR O LA EXCEPCION LO VA A GESTIONAR EL METODO OPERACION
	
	public static int operacion ( int a, int b ) {
	
	int res = 0;
	
	try{
		
		res = a / b;
	
	} catch ( ArithmeticException ae ) {
		
		System.out.println("Error: división por cero!!!!!");
		res = 0;
		
	}
	
	return res;
	}*/
	
	//LA GESTION DE LOS ERRORES LA REALIZA QUIEN LLAMA
	
	/*public static int operacion ( int a, int b ) throws ArithmeticException {
		
		int res = 0;
		res = a / b;
		return res;
	}*/

	/*public static void main(String[] args) {
		
		int a = 2, b = 0;
				
		do {
			
			try {
				
				System.out.println("Resultado: " + Jueves6.operacion(a, b));
				break;
				
			
			} catch ( ArithmeticException ae ) {
				
				System.out.println("Error: división por cero!!!");
				b = 1;
				
			}
		
		} while( true );*/
	
	//GESTION DE DISTINTAS EXCEPCIONES
	
	public static int operacion ( String a, String b ) throws ArithmeticException, NumberFormatException,
																IndexOutOfBoundsException {
		
		int res = 0;
		int na, nb;
		
		int[] v = {0,1,2};
		v[3] = 5;
		
		na = Integer.parseInt(a); //posible excepción en el formato del número.
		nb = Integer.parseInt(b); //posible excepción en el formato del número.
		
		res = na / nb; //posible excepción de división por cero.
		return res;
	}
	
	/*public static void main(String[] args) {
		
		//AQUI MANOLO HA USADO "BREAK" Y NO ME PARECE APROPIADO. ES MEJOR USAR UN BOOLEAN PARA
		//LA SALIDA DEL BUCLE.
	
		int a = 0, b = 0;
		boolean continuar = true;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el numerador: ");
		a = teclado.nextInt();
				
		do {			
			
			System.out.print("Introduzca el denominador: ");
			b = teclado.nextInt();
			continuar = false;
			
			try {
				
				System.out.println("Resultado: " + Jueves6.operacion(a, b));				
			
			} catch ( ArithmeticException ae ) {
				
				System.out.println("Error: división por cero!!!");
				continuar = true;				
			}
		
		} while( continuar );

	}*/
	
	//MAIN CON VARIAS EXCEPCIONES
	
	public static void main(String[] args) {
		
		String a, b;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe dividendo: ");		
		a = teclado.nextLine();
		
		System.out.print("Escribe divisor: ");		
		b = teclado.nextLine();
		
		try {
			
			System.out.println("Cociente = " + operacion(a,b));
		
		} catch ( NumberFormatException nfe ) {
			
			System.out.println(nfe);
		
		} catch ( ArithmeticException ae ) {
			
			System.out.println(ae);
		
		} catch ( IndexOutOfBoundsException index ) {
			
			System.out.println(index);
		
		} finally {
			
			System.out.println("Finally se ejecuta siempre. Final del programa.");
			teclado.close();
		}
		
		
	}

}
