package febrero;

import java.io.*;

public class Martes4 {
	
	
	
	//Gestión de Errores y Excepciones
	
	public static int numero ( String s ) {
		
		int n = 0;
		
		try {
		
			n = Integer.parseInt(s);
			
		} catch ( NumberFormatException nfe ) {
			
			n = 0;
			throw nfe;
		}
		
		return n + 1;
	}
	
	public static char leer() throws IOException {
		
		int c = 0;
		
		System.out.print("escribe un carácter: ");
		
		try{
		
			c = System.in.read();
		
		} catch( IOException ioe ) {
			
			System.out.println ( ioe );
			throw ioe;
		}
		
		return (char)c;
	}

	public static void main(String[] args) throws IOException {
		
		/*String s = "2";
		
		try {
			System.out.println(Martes4.numero(s));
			System.out.println(Martes4.leer());
		}catch ( NumberFormatException nfe ) {
			
			System.out.println(s + " Número no válido.");
		}catch ( IOException ioe ) {
			
			System.out.println(ioe);
		}*/
		
		//
		
		String str1 = "12";
		String str2 = "0";
		String resp;
		int numerador, denominador, cociente;
		
		numerador = Integer.parseInt(str1);
		denominador = Integer.parseInt(str2);
		
		try {			

			cociente = numerador / denominador;
			resp = String.valueOf(cociente);
		
		} catch ( NumberFormatException nfe ) {
			
			resp = "Valores no válidos";
			
		} catch ( ArithmeticException ae ) {
			
			resp = "División por 0";
		}
		
		System.out.println ( resp );
				

	}

}
