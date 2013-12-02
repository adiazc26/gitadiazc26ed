package noviembre;

public class Jueves28 {
	/*
	 * Tenemos una tabla con los gastos de personal por día de la semana.
	 * Luis Luisa Maria Jose
	 * 10	5		7 	8
	 * 6	6		7	10
	 * 5	4		3	6
	 * 7	7		8	9
	 * 4	3		2	1
	 * El objetivo del programa es calcular gastos:
	 * Gastos totales de personal
	 * Gastos de cada uno de los empleados
	 * ¿Quien es el que mas gasta y quien el que menos?
	 * Gastos ocasionados por dia
	 * gastos : tabla[5][4], dias de la semana, empleados
	 * para cada dia de la semana hacer
	 * 	para cada empleado hacer
	 * 		acumular el gasto ocasionado por empleado y dia
	 * 	finpara
	 * finpara
	 * Escribir el gasto acumulado
	 * Para cada empleado hacer
	 * 	para cada dia hacer
	 * 		acumular el gasto ocasionado por el empleado y dia
	 * 	finpara
	 * Escribo el gasto de este empleado
	 * guardar en gasto_empleado
	 * inicializar contar de gasto
	 * finpara 
	 * gastoso el primero
	 * para cada empleado hacer
	 * comparar gastos si es mayor que el anterior anotarlo
	 * finpara
	 * 
	 */
		// Atributos de clase
	private static final int[][] gastos = {
		{10,5,7,8},
		{6,6,7,10},
		{5,4,3,6},
		{7,7,8,9},
		{4,3,2,1}
	};
	public static void main(String[] args) {
		// Calcular gasto total
		// variables
		int total = 0;
		// Calcular el gasto
		for(int d=0; d < Jueves28.gastos.length; ++d){
			for(int e=0; e < Jueves28.gastos[e].length; ++e){
				total += Jueves28.gastos[d][e]; //procesamos por filas y columnas
			}
		}
		System.out.println("Gastos totales: " + total);
		/*OTRA MANERA DE CALCULAR LO MISMO
		 * total = 0;
		for(int e=0; e < Jueves28.gastos[e].length; ++e ){
			for(int d=0; d < Jueves28.gastos.length; ++d){
				total += Jueves28.gastos[d][e];
			}
		}
		System.out.println("Gastos totales: " + total);
		*/
		// Calcular gastos por cada uno de los empleados:
		int gastoe = 0;
		int maximo = 0;
		int minimo = 0;
		int maxempleado = 0;
		int minempleado = 0;
		
		for(int e = 0; e < Jueves28.gastos[e].length ; ++e){
			for(int d = 0; d < Jueves28.gastos.length; ++d){
				gastoe += Jueves28.gastos[d][e];
			}
			if (e == 0 || gastoe>maximo){
				maximo = gastoe;
				maxempleado = e;
			}
			if (e == 0 || gastoe<minimo){
				minimo = gastoe;
				minempleado = e;
			}
			System.out.println("Empleado N " + (e+1) + "\tGasto: " + gastoe);
			gastoe = 0;
		}
		System.out.println("El que más gasta es: " + (maxempleado+1));
		System.out.println("El que menos gasta es: " + (minempleado+1));
		//Calcular gastos por día y que día se gasta más
		int dianegro = 0;
		int diablanco = 0;
		int gastodia = 0;
		int maxdia = 0;
		int mindia = 0;
		for(int d = 0; d < Jueves28.gastos.length; ++d){
			for (int e = 0; e < Jueves28.gastos[e].length; ++e){
				gastodia += Jueves28.gastos[d][e];
			}
			if (d == 0 || gastodia>maxdia){
				maxdia = gastodia;
				dianegro = d;
			}
			if (d == 0 || gastodia<mindia){
				mindia = gastodia;
				diablanco = d;
			}
			System.out.println("Día N " + (d+1) + "\tGasto: " + gastodia);
			gastodia = 0;
		}
		System.out.println("El dia que más gasta es: " + (dianegro+1));
		System.out.println("El dia que menos gasta es: " + (diablanco+1));
			}

}
