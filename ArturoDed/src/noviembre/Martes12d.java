package noviembre;

import octubre.Jueves31;

public class Martes12d {

	public static void main(String[] args) {
		int n = 0;
		int suma = 0;
		for (;(n = Jueves31.random(0, 10)) != 0;){
			System.out.print(n + "\t");
			suma += n;
		}
		System.out.println("\nLa suma  de la serie de números es: " + suma);
	}

}
