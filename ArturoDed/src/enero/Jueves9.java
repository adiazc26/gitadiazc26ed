package enero;

public class Jueves9 {
	
	//Atributos
	
	public static int[][] calendario = {
		
		{0,31,28,31,30,31,30,31,31,30,31,30,31},  //años normales
		{0,31,29,31,30,31,30,31,31,30,31,30,31}   //años bisiestos
		
	};
	
	//Métodos de clase
	
	public static int esBisiesto( int año ) {
		
		int esBisiesto = 0;
		
		if( año % 4 == 0 && año % 100 != 0 || año % 400 == 0 ) {
			
			esBisiesto = 1;
		}
		
		return esBisiesto;
	}
	
	public static int diaAño( int dia, int mes, int año ) {
		
		int diaAño = 0;
		int bisiesto = Jueves9.esBisiesto( año );
		for ( int i = 1; i < mes; ++i ) {
			
			diaAño += Jueves9.calendario[bisiesto][i];
		}
		
		diaAño += dia;
		return diaAño;
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
	
	public static void diaMes ( int diaAño, int[] diaMesAño, int año ) {
		
		int bisiesto = Jueves9.esBisiesto(año);
		int mes = 1;
		while( mes <= 12 && Jueves9.calendario[bisiesto][mes] < diaAño ) {
						
			diaAño -= Jueves9.calendario[bisiesto][mes];
			++mes;
		}
		
		if ( mes == 13 ) {
			
			diaMesAño[0] = diaAño;
			diaMesAño[1] = 1;
			diaMesAño[2] = año + 1;
			
 		} else {
 			
			diaMesAño[0] = diaAño;
			diaMesAño[1] = mes;
			diaMesAño[2] = año;
 		}
	}
	
//	public static int[] diaMes ( int diaAño, int año ) {
		
		
		
//	}

	public static void main(String[] args) {
		
		int dia = 31;
		int mes = 12;
		int año = 2014;
		
		int[] fecha = {31,12,2012};
		int diaAño = 0;
		
//		System.out.println("Día del año de 31/12/2012 ---> " + Jueves9.diaAño(dia, mes, año));
		
//		dia = Jueves9.exchange(dia);
//		System.out.println(dia);
		
//		Jueves9.exchange(fecha);
		
		diaAño = Jueves9.diaAño(dia, mes, año);
		diaAño += 10;
		
		Jueves9.diaMes(diaAño, fecha, año);
		
		
		System.out.println( fecha[0] + " / " + fecha[1] + " / " + fecha[2] );
	}

}