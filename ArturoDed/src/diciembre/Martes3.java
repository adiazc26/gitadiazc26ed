package diciembre;

public class Martes3 {
/*
 * Manejo de listas en paralelo:
 * Dada la puntuación de una serie de concursantes imprimir la lista ordenada de mayor a menos.
 * nombres: array de 5 nombres.
 * puntos: array de 5 numeros enteros.
 * Para pasadas desde 1 hasta 5 hacer
 * 	Para indice 0 hasta 5 - pasadas hacer
 *  	si puntos[indice]<puntos[indice+1] entonces
 *  		cambiamos puntos
 *  		cambiamos nombres
 *  	finsi
 *  finpara
 * finpara
 */
	
	// Creamos un registro
	private class Registro{
		//Atributos
		private String nombre;
		private int puntos;
		//Constructores
		public Registro(){
			
		}
		public Registro(String nombre, int puntos){
			this.nombre=nombre;
			this.puntos=puntos;
		}
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int [] puntos = {4,7,3,9,5};
		String [] nombres = {"Alberto","Ana", "Luis", "Eva", "Pepe"};
		/*Registro[]lista =new Registro[5]{
				(new Registro("Alberto", 4)),
				(new Registro("Ana", 7)),
				(new Registro("Luis", 3)),
				(new Registro("Eva", 9)),
				(new Registro("Pepe", 5)
		};*/
			
		int punto = 0;
		String nombre = "";
		//Proceso de Ordenación
		for(int pasada = 1; pasada < puntos.length; ++pasada){
			for(int i=0; i < puntos.length-pasada; i++){
				if(puntos[i]<puntos[i+1]){
					punto=puntos[i];
					puntos[i]=puntos[i+1];
					puntos[i+1]=punto;
					nombre=nombres[i];
					nombres[i]=nombres[i+1];
					nombres[i+1]=nombre;
				}
			}
		}
		// Imprimir resultados
		for(int i=0; i<puntos.length; ++i){
			System.out.println(nombres[i]+"\t"+puntos[i]);
		}
		

	}

}
