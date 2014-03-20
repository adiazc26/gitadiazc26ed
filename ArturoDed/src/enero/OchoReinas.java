package enero;

public class OchoReinas {
	/*Algoritmo:
	 * 
	 * ensayar(reina)
	 * begin
	 * buscar la primera posicion de la reina en la fila
	 * 		mientras no sea el fin y haya una posicion para poner la reina hacer
	 * 			si la posicion elegida es valida entonces
	 * 				anotar la posicion
	 * 				si he colocado la ultima reina entonces
	 * 					anotar que he terminado o que es el fin
	 * 					imprimir el resultado
	 * 				si no 
	 * 					ensayar (la siguiente reina)
	 * 					si no es el fin entonces
	 * 						eliminar la anotacion de esta reina
	 * 					finsi
	 * 				finsi
	 * 				finsi
	 * 				buscar la siguiente posicion de la reina en la fila
	 * 		fin mientras
	 * end
	 * 
	 */
	
	private static int[]reinas = new int[8]; //columnas donde están las reinas
	private static boolean diagonalD[] = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	private static boolean diagonalI[] = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	private static boolean columnas[] ={false,false,false,false,false,false,false,false};
	private static boolean fin = false;
	
	public static void main(String[] args) {
		

	}

}
