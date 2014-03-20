package enero;

import java.util.Scanner;

// Factorial de un número dado
// !n = n*(n-1)*(n-2)*...2*1
// Utilizar dos métodos, uno iterativo y otro recursivo
public class Martes21 {
	
	//Método iterativo
	public static int factorialIterativo(int n){
	    int sol=1;
	    int i;
	    if (n==0){
	    	sol=1;
	    }
	    else{
	    	for(i=1;i<=n;i++){
	    		sol=sol*i;
	    	}
	    }	        
	 return sol;
	}
	
	//Método recursivo
	public static int factorialRecursivo(int n){
	    if (n==0){
	    	return 1;
	    }else{
	    	return n*(factorialRecursivo(n-1));
	    }
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de cual quieres calcular su factorial: ");
		int n = teclado.nextInt();
		System.out.println("Resultado con método iterativo: "+factorialIterativo(n));
		System.out.println("Resultado con método recursivo: "+factorialRecursivo(n));
		
		teclado.close();
	}

}
