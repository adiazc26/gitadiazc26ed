package diciembre;

import java.util.Scanner;

public class Jueves5 {

		public static void main(String[] args) {
			Scanner teclado;
			teclado = new Scanner(System.in);
			
			int numAlum=0;
			double media=0,acumula=0;
			
			
			//Leer número de alumnos
			do{
				System.out.println("Número de alumnos de la clase: ");
				numAlum = teclado.nextInt();
			}while(numAlum<=0);
			double[]notas = new double [numAlum];
			
			//System.out.println(Arrays.toString(notas));
			
			//notas de cada alumno
			for(int i=0;i<notas.length;++i){
				System.out.println("Alumno " + (i+1) + " nota final: ");
				notas[i]=teclado.nextDouble();
			}
			
			//System.out.println(Arrays.toString(notas));
			
			//nota media
			for(int i=0;i<(numAlum);++i){
				
				acumula = acumula + notas[i];
			}
			media=acumula/notas.length;
			System.out.println("Nota media del curso: " + media);
			
			//superiores a la media
			System.out.println("Listado de las notas superiores a la media: ");
			for(int i=0;i<(numAlum);++i){
			if(notas[i]>media){
				System.out.println("Alumno numero " + (i+1) + " con nota final de: " + notas [i]);
			}
			}
			
			//maxima
			System.out.print("Nota máxima de los alumnos: ");
			double maxima = 0;
			for(int i=0;i<(numAlum);++i){
			if(notas[i]>maxima){
				maxima = notas[i];
			}
			}
			System.out.print(maxima);
			
			
teclado.close();
	}

}
