package maquina;

//si el usuario mete una moneda de un euro y el producto

public class Monedero {
	
	//Atributos ¿Qué conozco?
	
	private double cantidad; //es la cantidad que introduce el usuario
	private final double MONEDA = 0.20;
	
	//Constructores

	public Monedero() {

		this.cantidad = 0.0;
	}
	
	public Monedero( double cantidad) {

		this.setCantidad(cantidad);
	}
	
	//Accesadores

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		
		long valor;
		valor = Math.round(cantidad * 100);
		
		this.cantidad = (double)valor/100;
	}
	
	//Utilidades
	
	public void display() {
		
		System.out.println(this.getCantidad());
	}
	
	public String toString() {
		
		return String.format("%.2f €", this.getCantidad());
	}
	
	//Servicios
	
	public void ponerCash() {
		
		this.setCantidad(this.getCantidad() + this.MONEDA);
	}
	
	public void returnCash() {
		
		this.setCantidad(0.0); //se supone que el usuario recupera el cambio
	}
	
	public void hacerCambio( double cantidad ) {  
		
		this.setCantidad(this.getCantidad() - cantidad);
	}
	
	public boolean siHaySuficienteCash ( double cantidad ) {
		
		return (this.getCantidad() >= cantidad) ? true : false;
	}	
	

	public static void main(String[] args) {

		//Probamos la clase
		
		Monedero monedero = new Monedero();
		
		while(!monedero.siHaySuficienteCash(1.00)) {
			
			System.out.println("Necesito más cash");
			monedero.ponerCash();
			System.out.println(monedero);
		}

	}

}
