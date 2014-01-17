package enero;

public class Jueves9 {
	
	//Atributos
	
	public static int[][] calendario = {
		
		{0,31,28,31,30,31,30,31,31,30,31,30,31},  //a�os normales
		{0,31,29,31,30,31,30,31,31,30,31,30,31}   //a�os bisiestos
		
	};
	
	//M�todos de clase
	
	public static int esBisiesto( int a�o ) {
		
		int esBisiesto = 0;
		
		if( a�o % 4 == 0 && a�o % 100 != 0 || a�o % 400 == 0 ) {
			
			esBisiesto = 1;
		}
		
		return esBisiesto;
	}
	
	public static int diaA�o( int dia, int mes, int a�o ) {
		
		int diaA�o = 0;
		int bisiesto = Jueves9.esBisiesto( a�o );
		for ( int i = 1; i < mes; ++i ) {
			
			diaA�o += Jueves9.calendario[bisiesto][i];
		}
		
		diaA�o += dia;
		return diaA�o;
	}
	
	public static int exchange( int dia ) {
		
		++dia;
		System.out.println( dia );
		return dia;
	}
	
	public static void exchange( int[] fecha ) {
		
		fecha[0] += 1;
		fecha[1] += 1;
		fecha[2] += 1;
	}
	
	public static void diaMes ( int diaA�o, int[] diaMesA�o, int a�o ) {
		
		int bisiesto = Jueves9.esBisiesto(a�o);
		int mes = 1;
		while( mes <= 12 && Jueves9.calendario[bisiesto][mes] < diaA�o ) {
						
			diaA�o -= Jueves9.calendario[bisiesto][mes];
			++mes;
		}
		
		if ( mes == 13 ) {
			
			diaMesA�o[0] = diaA�o;
			diaMesA�o[1] = 1;
			diaMesA�o[2] = a�o + 1;
			
 		} else {
 			
			diaMesA�o[0] = diaA�o;
			diaMesA�o[1] = mes;
			diaMesA�o[2] = a�o;
 		}
	}
	
//	public static int[] diaMes ( int diaA�o, int a�o ) {
		
		
		
//	}

	public static void main(String[] args) {
		
		int dia = 31;
		int mes = 12;
		int a�o = 2014;
		
		int[] fecha = {31,12,2012};
		int diaA�o = 0;
		
//		System.out.println("D�a del a�o de 31/12/2012 ---> " + Jueves9.diaA�o(dia, mes, a�o));
		
//		dia = Jueves9.exchange(dia);
//		System.out.println(dia);
		
//		Jueves9.exchange(fecha);
		
		diaA�o = Jueves9.diaA�o(dia, mes, a�o);
		diaA�o += 10;
		
		Jueves9.diaMes(diaA�o, fecha, a�o);
		
		
		System.out.println( fecha[0] + " / " + fecha[1] + " / " + fecha[2] );
	}

}