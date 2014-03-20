package febrero;

public class OchoReinas {
	
	//Algoritmo
	/*
	 * ensayar(reina)
	 * 	begin
	 * 	buscar la primera posición de la reina en la fila
	 * 		mientras no sea el fin y haya una columna para poner la reina, hacer
	 * 			si la posición elegida es válida entonces
	 * 				anotar la posición
	 * 				si he colocado la última reina entonces
	 * 					anotar que he terminado o que es el fin
	 * 					imprimir el resultado
	 * 				si no
	 * 					ensayar(la siguiente reina)
	 * 					si no es el fin entonces
	 * 						eliminar la anotación de esta reina
	 * 					fin si
	 * 				fin si
	 * 			fin si
	 * 			buscar la siguiente columna de la reina en la fila	
	 * 		finMientras
	 * 	end
	 */
	
	//VARIABLES DE CLASE
	
	private static int[] reinas = new int[8];//columnas donde están las reinas
	
	private static boolean[] diagonalDerecha={false, false, false, false, false, 
											  false, false, false, false, false,
											  false, false, false, false, false };
	
	private static boolean[] diagonalIzquierda={false, false, false, false, false, 
		  										false, false, false, false, false,
		  										false, false, false, false, false };
	
	private static boolean[] columnas = {false, false, false, false, false, false, false, false };
	
	private static boolean fin = false;
	
	//METODOS AUXILIARES PARA REALIZACION DE LAS OCHO REINAS
	
	//Validar la posición elegida
	
	public static boolean valida(int fil, int col) {
		
		boolean res = false;
		
		int d = col - fil + OchoReinas.reinas.length - 1;
		int i = col + fil;
		
		if ( OchoReinas.columnas[col] == false && OchoReinas.diagonalDerecha[d] == false
			 && OchoReinas.diagonalIzquierda[i] == false ) {
				 
				 res = true;
			 }
		
		return res;
	}
	
	public static void anotar( int fil, int col ) {
		
		int d = col - fil + OchoReinas.reinas.length - 1;
		int i = col + fil;
		
		OchoReinas.columnas[col] = true;
		OchoReinas.diagonalDerecha[d] = true;
		OchoReinas.diagonalIzquierda[i] = true;
		OchoReinas.reinas[fil] = col;
		
	}
	
	public static void desanotar( int fil, int col ) {
		
		int d = col - fil + OchoReinas.reinas.length - 1;
		int i = col + fil;
		
		OchoReinas.columnas[col] = false;
		OchoReinas.diagonalDerecha[d] = false;
		OchoReinas.diagonalIzquierda[i] = false;		
		
	}
	
	public static void ponerReina( int reina ) {
		
		int col = 0; //empezamos por la primera columna
		
		while (OchoReinas.fin == false && col < OchoReinas.reinas.length) {
			
			if ( OchoReinas.valida(reina, col) == true ) {
				
				OchoReinas.anotar(reina, col);
				
				if ( reina == OchoReinas.reinas.length - 1 ) {
					
					OchoReinas.fin = true;
					for ( int i = 0; i < OchoReinas.reinas.length; ++i ) {
						
						System.out.println("Reina " + (i+1) + " Columna " + (OchoReinas.reinas[i]+1));
					}
				}
				
				else {
					
					OchoReinas.ponerReina(reina + 1);
					if ( OchoReinas.fin == false ) {
						
						OchoReinas.desanotar(reina, col);
					}
				}
			}
			
			++col;
		}
	}
	

	public static void main(String[] args) {

		

	}

}