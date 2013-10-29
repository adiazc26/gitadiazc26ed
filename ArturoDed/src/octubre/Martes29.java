package octubre;

public class Martes29 {

	public static void main(String[] args) {
		// Operadores boolenaos: operan sobre expresiones lógicas.
		// no es obligatorio escribir el boolean
		System.out.print((2 * 3 == 5));
		boolean resultado = 2 * 3 ==5;
		System.out.print("\t"+resultado);
		
		if (resultado == true) {
			System.out.print("\t"+"Son iguales");
		}else{
			System.out.println("\t"+"No son iguales");
		}
		System.out.print((2 * 3 == 6));
		boolean resultado2 = 2 * 3 ==6;
		System.out.print("\t"+resultado2);
		
		if (resultado2 == true) {
			System.out.println("\t"+"Son iguales");
		}else{
			System.out.println("\t"+"No son iguales");
		}
		//Operadores específicos de valores lógicos
		//No (!) es un operador monario
		//Y (&&) es un operador binario. Cuando las dos son verdaderas el resultado es true, en cualquier otro caso, false.
		if(3 < 2 && 2 < 4){
			System.out.println("Cierto");
		}else{
			System.out.println("False");
		}
		//O (||) es un operador binario. Cuando las dos son falsas el resultado es false, en cualquier otro caso, true.
		if(3 < 2 || 2 < 4){
			System.out.println("Cierto");
		}else{
			System.out.println("False");
		}
		//Dados dos números enteros escribir el mayor de los dos.
		//Declarmos las variables.
		int a = 0;
		int b = 0;
		//Asignar los valores
		a = (int) (Math.random()*10+1);
		b = (int) (Math.random()*10+1);
		//Ver cual es el mayor
		if (a>b){
			System.out.println("El mayor es: "+a);
		}else{
		//o son iguales o b es el mayor, con lo cual se imprime a:
			System.out.println("El mayor es: "+b);
		}
		System.out.println("a es " + a + " y b es "+b);
		int c = 0;
		int d = 0;
		//Asignar los valores
		c = (int) (Math.random()*10+1);
		d = (int) (Math.random()*10+1);
		if (c>d){
			System.out.println("El mayor es: "+c);
		}else if(d>c){
			System.out.println("El mayor es: "+d);
		}else{
			System.out.println("Son iguales: "+c);
		}
		System.out.println("c es " + c + " y d es "+d);
	}

}
