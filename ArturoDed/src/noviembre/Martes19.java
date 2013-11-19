package noviembre;

import octubre.Jueves31;

public class Martes19 {
/*
 * Depurador, ponemos puntos de ruptura donde queramos parar la ejecución y damos al "Debug".
 * Para ejecutar a partir de ese punto, F5 se mete en la función (explora el método), y F6, no, en este caso F6.
 * 
 * Dado un número entre 1 y 12 escribir el nombre el mes:
 * Creo el vector nombres de mes
 * obtengo el número
 * imprimo el nombre del mes que coincide el número dado con su índice.
 * meses={"ene","feb","mar","abr","may","jun","jul","ago","sep","oct","nov","dic"}
 * escribir meses(numero) 
 */
	public static void main(String[] args) {
		//Declaraciones de las variables, relleno con uno para darle posición cero, y que enero coincida con 1.
		String[]meses = {"nul","ene","feb","mar","abr","may","jun","jul","ago","sep","oct","nov","dic"};
		int[]dias={0,31,28,30,30,31,30,31,31,30,31,30,31};
		int mes = 0;
		String nombre = "";
		nombre = "abr";
		//Generamos el mes entre 1 y 12
		//mes = Jueves31.random(1, 12);
		//System.out.println("El número de mes " + mes + " es " + meses[mes] + ".");
		//Buscar el nombre en el vector meses
		for (int i = 1; i < meses.length; ++i){
			if(nombre.equalsIgnoreCase(meses[i]) == true){
				System.out.println("El mes " + nombre + " tiene " + dias[i] + " días.");
				break;
			}
		}
	}

}
