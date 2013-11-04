package octubre;

public class Jueves31 {
// Dados tres números enteros escribir el mayor y el menor de ellos.
	// Algoritmo del problema
	// Obtener los tres números: a, b y c, diferentes
	// si a es mayor o igual que b y c entonces 
	// escribir el mayor es a 
	// si no, si b es mayor o igual que c entonces
	// escribir el mayor es b
	// si no,
	// escribir el mayor es c, 
	// si no hay un mayor unico
	// escribir no tengo ni idea
	// hasta aqui es solucion parcial, la total seria tambien teniendo el menor
	// a = 10; b = 4; c = 1, si puede haber iguales no funciona bien el algoritmo
	public static int random(int base, int rango){
		int sol = 0;
		sol = (int)(Math.random()* rango + base);
		return sol;
	}
	public static void main(String[] args) {
		// Primero la declariacón de objetos o variables que aparecen en el programa
		int a = 0;
		int b = 0;
		int c = 0;
		// final int es variable, que no puede cambiar de valor, la ponemos con mayúscula para identificarlas
		/*
		final int BASE = 0;
		final int RANGO = 2;
		 Genero los números
		a = (int)(Math.random() * RANGO + BASE);
		b = (int)(Math.random() * RANGO + BASE);
		c = (int)(Math.random() * RANGO + BASE);
		*/
		a = Jueves31.random(1, 3);
		b = Jueves31.random(1, 3);
		c = Jueves31.random(1, 3);
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		// Buscar el número mayor
		
		if( a >= b && a >= c){
			System.out.println("El mayor es: " + a);
		}else if(b >= c){
			System.out.println("El mayor es: " + b);
		}else if{
			System.out.println("El mayor es: " + c);
		}
		/*for(int i =0; i < 10; ++i){
			System.out.println(Jueves31.random(1, 10));
		}*/
	}

}
