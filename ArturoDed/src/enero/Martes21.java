package enero;

import java.util.Scanner;

// Factorial de un n�mero dado
// !n = n*(n-1)*(n-2)*...2*1
// Utilizar dos m�todos, uno iterativo y otro recursivo
public class Martes21 {
	
	//M�todo iterativo
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
	
	//M�todo recursivo
	public static int factorialRecursivo(int n){
	    if (n==0){
	    	return 1;
	    }else{
	    	return n*(factorialRecursivo(n-1));
	    }
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero de cual quieres calcular su factorial: ");
		int n = teclado.nextInt();
		System.out.println("Resultado con m�todo iterativo: "+factorialIterativo(n));
		System.out.println("Resultado con m�todo recursivo: "+factorialRecursivo(n));
		
		teclado.close();
	}

}
