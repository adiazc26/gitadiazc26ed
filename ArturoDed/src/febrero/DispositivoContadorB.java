package febrero;

/*
 * Define las caracteristicas de un dispositivo que cuenta de uno en uno
 * hacia arriba y hacia abajo
 * Partiendo siempre de un valor inicial
 * Los objetos de esta clase deben poder incrementar su valor, decrementar
 * su valor e inicializarse el valor indicado
 * 
 * Mostrar el valor del contador en base binaria, octal y Hexadecimal también
 */

public class DispositivoContadorB {
	
	//¿Qué conozco como objeto dispositivo contador?
	//Atributos de la clase
	
	private int valor; //Valor contado por el dispositivo
	private int valorInicial; //Valor para resetearse
	
	//Constructores
	public DispositivoContadorB(){
		this.valor = 0;
		this.valorInicial = 0;
	}
	
	public DispositivoContadorB( int valor, int valorInicial ) {
		this.valor = valor;
		this.valorInicial = valorInicial;
	}
	
	//Accesadores	
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	//¿Qué puedo hacer por los demás?
	//Servicios de la clase
	
	public void incrementar(){
		this.valor++;
	}
	
	public void decrementar(){
		this.valor--;
	}
	
	public void resetear(){
		this.valor = this.valorInicial;
	}
	
	//Métodos auxiliares
	
	public String toString(){
		
		return"" + this.valor;
	}
	
	//Método para calcular el valor almacenado en la base indicada
	
	public String enBase( int base ) {
		String salida = "";
		int n = this.valor;
		int resto = 0;
		while ( n > 0 ) {
			
			resto = n % base;
			switch ( resto ) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9: salida = resto + salida;
					break;
			case 10:
				salida = "A" + salida;
				break;
			case 11:
				salida = "B" + salida;
				break;
			case 12:
				salida = "C" + salida;
				break;
			case 13:
				salida = "D" + salida;
				break;
			case 14:
				salida = "E" + salida;
				break;
			case 15:
				salida = "D" + salida;
				break;
			}
			
			n /= base;
			
		}
		
		return salida;
	}
	
	//Igualdad entre objetos (yo defino a qué me refiero con que son iguales)
	
	public boolean clon (DispositivoContadorB dis) {
		
		boolean resp = false;
		
		if (this.valor == dis.getValor() && this.valorInicial == dis.getValorInicial())
			resp = true;
		
		return resp;
	}
	
	public boolean igual (DispositivoContadorB dis) {
		
		boolean resp = false;
		
		if (this.valor == dis.getValor())
			resp = true;
		
		return resp;
	}
	
	public boolean menor (DispositivoContadorB dis) {
		
		boolean resp = false;
		
		if (this.valor < dis.getValor())
			resp = true;
		
		return resp;
	}

	public static void main ( String[] args) {
		
		//Crear un objeto del tipo DispositivoContador
		
		DispositivoContadorB contador = new DispositivoContadorB(10,0);
		DispositivoContadorB a = new DispositivoContadorB(10,0);
		
		/*contador.incrementar();
		contador.incrementar();
		System.out.println("Valor de contador: " + contador); //se llama implícitamente al método toString()
		
		contador.decrementar();
		System.out.println("Valor de contador: " + contador); //se llama implícitamente al método toString()
		contador.resetear();
		System.out.println("Valor de contador: " + contador); //se llama implícitamente al método toString()
		
		DispositivoContador[] contadores = new DispositivoContador[10];
		for ( int i = 0; i < contadores.length; ++i ) {
			
			//contadores[i] = new DispositivoContador();
			contadores[i] = contador;
			
		}
		
		contadores[0].incrementar();*/
		//System.out.println(contador.enBase(2));
		//System.out.println(contador.enBase(16));
		
		System.out.println("¿Es menor? " + a.menor(contador));	
		
	}

}