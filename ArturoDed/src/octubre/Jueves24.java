package octubre;

public class Jueves24 {
	//cambios de prueba
	//lo que ponga aqui, ser� valido para toda la clase Jueves24, y si esta fuera del static, hay que indicarlo
	public static int variable;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Operadores
		// Operadores aritm�ticos num�ricos: realizan operaciones con variables o valores de tipo aritm�tico.
		// El resultado es un valor de tipo num�rico.
		// Siempre de tipo m�s alto en la escal: int, long y double.
		// Los operadores aritm�ticos son: 	binarios (dos operandos para actuar): +, -, *, /, %(resto en divisiones enteras).
		//									monarios (un operando): - (cambio de signo), ++ (incrementa en 1), -- (decrementa en 1),
		//															+= (incrementa en el valor que se pone a la derecha y lo guardo en el de la izquierda),
		//															-= (decrementa en el valor que se pone a la derecha y lo guardo en el de la izquierda),
		//															*= (multiplica por el valor que se pone a la derecha y lo guardo en el de la izquierda),
		//															/= (divido en el valor que se pone a la derecha y lo guardo en el de la izquierda),
		//															%= (incrementa en el valor que se pone a la derecha y lo guardo en el de la izquierda),
		// La potencia, raiz, etc, son m�todos de una clase de utilidades
		
		int a = 0;
		int b = 0;
		int c = 0;
		double d = 0.0;
		double e = 0.0;
		int f = 0;
		a = 3;
		b = (2 * 5) + (3 / 2);
		c = b / a;
		// ese int convierte la parte decimal a entero, fuerza la conversi�n de un tipo en otro, llamado cast de tipos
		// La clase Math contiene m�todos aritm�ticos para uso general
		d = (int)Math.sqrt(a);
		e = a % b;
		// Long es valor entero largo (aun que deja almacenar el mismo tama�o que int, pero long en ciertos compiladores tiene m�s tama�o)
		long l = 0;
		// Short es un entero peque�o, hasta 10000
		short s = 0;
		
		s = 10000; // int corto
		// Precedencias de los operadores aritm�ticos:
		// El primero que se ejecuta es el *, /, % y luego +, -
		f = 2 * 5 / 6;
		
		// Operadores l�gicos: producen un resultado booleano o l�gico (true, false).
		//		>, >=, <, <=, ==, != (distintos).
		// Las cadenas no se comparan con estos operadores.
		String mensaje = "Hola, mundo";
		String mensaje2 = "Hola, mundo";
		int  g = mensaje.compareTo("Hola, mundo"); //lo que devuelve el resultado de la resta de los caracteres en asci, sirve para saber si est� ordenado
		boolean  h = mensaje2.equals("Hola, mundo"); //devuelve si son iguales
		
		boolean i;
		i = c == a;
		boolean  j;
		j = c != a;
		
		System.out.println("a: "+ a +" b: " + b + " b / a = " +  c + " d = " + d + " e = " + e + " f = " + f + " g = " + g + " h = " + h + " i = " + i + " j = " + j);
		
		{
			int z = 0; //as� solo existe z dentro de estas llaves
			a = z;
		}
		Jueves24.variable = 1;
	}

}
