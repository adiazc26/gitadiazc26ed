package maquina;

public class MonederoManolo {
	
	//Atributos
	
	private double cantidad; //cantidad introducida por el usuario.
	private double[]valor = {0.05,0.10,0.20,0.50,1.00}; //tipos de valores.
	private int[] monedas; //número de monedas de cada tipo.
	private int[] aux;
	
	//Constructores

	public MonederoManolo() {
		this.cantidad = 0.0;
		this.monedas = new int[this.valor.length];
		aux = new int[this.valor.length];
	}
	
	public MonederoManolo(int[] monedas) {
		this.cantidad = 0.0;
		this.monedas = new int[this.valor.length];
		for(int i=0; i < this.monedas.length; ++i) {
			this.monedas[i] = monedas[i];
		}
		aux = new int[this.valor.length];
	}
	
	//Accesadores

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double[] getValor() {
		return valor;
	}

	public void setValor(double[] valor) {
		this.valor = valor;
	}

	public int[] getMonedas() {
		return monedas;
	}

	public void setMonedas(int[] monedas) {
		this.monedas = monedas;
	}
	
	//Utilidades
	
	public static double round(double valor, int decimales) {
		
		long divisor = 1;
		long x = 0;
		for(int i=0; i < decimales; ++i) {
			divisor *= 10;
		}
		
		x = Math.round(valor*divisor);
		valor = (double)x/divisor;
		return valor;
	}
	
	//Servicios
	
	public void addCoin(int valor) { //Poner la moneda el tipo o valor
		
		switch(valor){
		case 5: this.cantidad += 0.05; this.monedas[0]++; break;
		case 10: this.cantidad += 0.10; this.monedas[1]++; break;
		case 20: this.cantidad += 0.20; this.monedas[2]++; break;		
		case 50: this.cantidad += 0.50; this.monedas[3]++; break;
		case 100: this.cantidad += 1.00; this.monedas[4]++; break;
		
		}
		
	}
	
	public boolean siHayCambio ( double cambio ) {
		
		boolean rsp = false;
		//Copiamos todos los datos de monedas en aux
		for(int i=0; i < this.monedas.length; ++i) {
			this.aux[i] = this.monedas[i];
		}
		
		//Buscamos si hay un cambio con las monedas
		for(int i = this.valor.length - 1; i >= 0; --i) {
			while(aux[i]>0 && cambio > 0 && this.valor[i] <= cambio) {
				cambio -= this.valor[i];
				cambio = MonederoSupremo.round(cambio, 2);
				aux[i]--;
			}
		}
		
		if ( cambio == 0 ) {
			
			rsp = true;
		}
		
		return rsp;		
		
	}
	
	public void displayAux(){
		
		for(int i=0; i < this.monedas.length; ++i ) {
			System.out.println("Monedas de " + this.valor[i] + " : " + this.aux[i]);
		}
	}
  
	public static void main(String[] args) {
		
		System.out.println(MonederoManolo.round(23.123456, 2));
		int[]monedas = {0,0,4,1,1};
		MonederoManolo monedero = new MonederoManolo(monedas);
		System.out.println(monedero.siHayCambio(0.60));
		monedero.displayAux();

	}

}
