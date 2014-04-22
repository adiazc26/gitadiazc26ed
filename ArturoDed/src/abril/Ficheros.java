package abril;
import java.io.*;

public class Ficheros {
	
	// Atributos
	private File file; // Es la estructura que maneja el sistema operativo
	private RandomAccessFile raf; // Flujo de datos del archivo
	private int reg; // Registro de datos
		

	public Ficheros() {
		// TODO Auto-generated constructor stub
	}
	
	public Ficheros(String file){ // File es el nombre del archivo en el sistema operativo
		try{
			this.file = new File(file);
			this.raf = new RandomAccessFile(this.file, "rw");
		}catch(IOException e){
			System.out.println(e);
			System.exit(0);
		}
		
	}
	
	public Ficheros(String file, String modo){ // File es el nombre del archivo en el sistema operativo
		try{
			this.file = new File(file);
			this.raf = new RandomAccessFile(this.file, modo);
		}catch(IOException e){
			System.out.println(e);
			System.exit(0);
		}
		
	}

	public static void main(String[] args) throws IOException{
		/*
		 * 	// Crear y procesar un archivo de datos numéricos enteros
		RandomAccessFile raf = new RandomAccessFile("datos.dat","rw");
		int reg; // registro de nuestro archivo
		// Añadir registros, mando el puntero al final del archivo
		// Posicionamiento al final del archivo
		// raf.seek(raf.length()); // Estoy al final del archivo
		
		for(reg = 21; reg <= 30; ++reg){
			raf.writeInt(reg);
		}

		// Leer el archivo de datos numericos creado anteriormente
		// Posicionamos el puntero al principio
		raf.seek(0);
		
		for(int i=0; i<20;++i){
			reg = raf.readInt();
			System.out.println(reg);
		}
		 */
		
		Ficheros mifichero = new Ficheros("numeros.dat");
		
	}

}
