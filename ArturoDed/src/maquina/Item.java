package maquina;

public class Item {
	
	//Atributos
	private String nombre;
	private double precio;
	private Monedero monedero;
	private ContenedorDistribuidor contenedor;
	

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(String nombre, double precio) {

		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Accesadores	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Monedero getMonedero() {
		return monedero;
	}

	public void setMonedero(Monedero monedero) {
		this.monedero = monedero;
	}	
	
	public ContenedorDistribuidor getContenedor() {
		return contenedor;
	}

	public void setContenedor(ContenedorDistribuidor contenedor) {
		this.contenedor = contenedor;
	}
	
	
	//Servicios

	public void display() {
		System.out.println(this.nombre+"\t"+this.precio);
	}
	
	public boolean vender() {
		boolean rsp = false;
		if(this.monedero.siHaySuficienteCash(this.precio) &&
				this.contenedor.siItemEsDispensable(this)) {
			
			this.monedero.hacerCambio(this.precio);
			this.contenedor.distribuir(this);
			rsp = true;
		}
		
		return rsp;		
	}
	
	public void llenarContenedor(String nombre, double precio, Monedero cash, ContenedorDistribuidor contenedor) {
		
		Item item = new Item(nombre, precio);
		item.setContenedor(contenedor);
		item.setMonedero(cash);
		contenedor.addItem(item);
		
	}

	public static void main(String[] args) {

		Monedero cash = new Monedero(1);
		//Item bote = new Item("Coca-Cola", 0.80);		
		//bote.setMonedero(cash);		
		//System.out.println("Vender Coca-Cola " + bote.vender());
		
		ContenedorDistribuidor contenedor = new ContenedorDistribuidor();
		Item bote = new Item();
		bote.llenarContenedor("Coca-Cola", 0.80, cash, contenedor);
		bote.llenarContenedor("Pepsi-Cola", 0.60, cash, contenedor);
		
		while(!contenedor.estaVacio() && contenedor.getItems()[0].vender()) {
			
		}
		
		

	}

}
