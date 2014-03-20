package maquina;
	
	/*
	 * FECHA LIMITE ANTES DE LAS VACACIONES
	 * 
	 * Crear una matriz con los tipos de moneda (posición 0 las de 5 cts., posición 1 las de 10 cts.,
	 * ... ... posición 4 las de 1 euro).
	 * 
	 * ESPECIFICACIONES
	 * 
	 * La clase MonederoSupremo controla 5 tipos de monedas:
	 * 
	 * 5, 10, 20, 50, 100 cts.
	 * 
	 * Los servicios son:
	 * - añadir moneda
	 * - si hay suficiente dinero
	 * - si puedo devolver el cambio (porque lo haya)
	 * - hacer el cambio (restar el dinero de lo que él mete)
	 * - retornar dinero (cuando pides que te devuelvan el dinero)
	 */

	public class MonederoSupremo {

	private double cantidad;
	private double[]valor = {0.05,0.10,0.20,0.50,1.00};
	private int[]monedas;
	
	//Constructor
	public MonederoSupremo() {
		this.cantidad = 0.0;
		this.monedas = new int[this.valor.length];
	}
	
	//Constructor
		public MonederoSupremo(int[]monedas) {
			this.cantidad = 0.0;
			this.monedas = new int[this.valor.length];
			for (int i=0; i< this.monedas.length; i++){
				this.monedas[i] = monedas[i]; 
			}
		}

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
	public static double round(double valor, int decimales){
		long divisor = 1;
		long x = 0;
		for(int i=0; i < decimales; ++i){
			divisor*=10;
		}
		x = Math.round(valor*divisor);
		valor = (double)x/divisor;
		return valor;
	}
	
	//Servicios
	//Añadir moneda
	public void addCoin(int valor){//Poner la meneda, el tipo o valor
		switch (valor) {
		case 5:
			this.cantidad+=0.05;
			this.monedas[0]++;
			break;
		case 10:
			this.cantidad+=0.10;
			this.monedas[1]++;
			break;
		case 20:
			this.cantidad+=0.20;
			this.monedas[2]++;
			break;
		case 50:
			this.cantidad+=0.50;
			this.monedas[3]++;
			break;
		case 100:
			this.cantidad+=1.00;
			this.monedas[4]++;
			break;

		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(MonederoSupremo.round(23.123456, 4));
		int[]monedas={10,10,10,10,10};
		MonederoSupremo monedero = new MonederoSupremo(monedas);

	}

}
	

