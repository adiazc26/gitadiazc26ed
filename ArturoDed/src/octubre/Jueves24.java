package octubre;

public class Jueves24 {
	//cambios de prueba
	//lo que ponga aqui, será valido para toda la clase Jueves24, y si esta fuera del static, hay que indicarlo
	public static int variable;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Operadores
		// Operadores aritméticos numéricos: realizan operaciones con variables o valores de tipo aritmético.
		// El resultado es un valor de tipo numérico.
		// Siempre de tipo más alto en la escal: int, long y double.
		// Los operadores aritméticos son: 	binarios (dos operandos para actuar): +, -, *, /, %(resto en divisiones enteras).
		//									monarios (un operando): - (cambio de signo), ++ (incrementa en 1), -- (decrementa en 1),
		//															+= (incrementa en el valor que se pone a la derecha y lo guardo en el de la izquierda),
		//															-= (decrementa en el valor que se pone a la derecha y lo guardo en el de la izquierda),
		//															*= (multiplica por el valor que se pone a la derecha y lo guardo en el de la izquierda),
		//															/= (divido en el valor que se pone a la derecha y lo guardo en el de la izquierda),
		//															%= (incrementa en el valor que se pone a la derecha y lo guardo en el de la izquierda),
		// La potencia, raiz, etc, son métodos de una clase de utilidades
		
		int a = 0;
		int b = 0;
		int c = 0;
		double d = 0.0;
		double e = 0.0;
		int f = 0;
		a = 3;
		b = (2 * 5) + (3 / 2);
		c = b / a;
		// ese int convierte la parte decimal a entero, fuerza la conversión de un tipo en otro, llamado cast de tipos
		// La clase Math contiene métodos aritméticos para uso general
		d = (int)Math.sqrt(a);
		e = a % b;
		// Long es valor entero largo (aun que deja almacenar el mismo tamaño que int, pero long en ciertos compiladores tiene más tamaño)
		long l = 0;
		// Short es un entero pequeño, hasta 10000
		short s = 0;
		
		s = 10000; // int corto
		// Precedencias de los operadores aritméticos:
		// El primero que se ejecuta es el *, /, % y luego +, -
		f = 2 * 5 / 6;
		
		// Operadores lógicos: producen un resultado booleano o lógico (true, false).
		//		>, >=, <, <=, ==, != (distintos).
		// Las cadenas no se comparan con estos operadores.
		String mensaje = "Hola, mundo";
		String mensaje2 = "Hola, mundo";
		int  g = mensaje.compareTo("Hola, mundo"); //lo que devuelve el resultado de la resta de los caracteres en asci, sirve para saber si está ordenado
		boolean  h = mensaje2.equals("Hola, mundo"); //devuelve si son iguales
		
		boolean i;
		i = c == a;
		boolean  j;
		j = c != a;
		
		System.out.println("a: "+ a +" b: " + b + " b / a = " +  c + " d = " + d + " e = " + e + " f = " + f + " g = " + g + " h = " + h + " i = " + i + " j = " + j);
		
		{
			int z = 0; //así solo existe z dentro de estas llaves
			a = z;
		}
		Jueves24.variable = 1;
	}

}
