package maquina;

public class ContenedorDistribuidor {
	
	//Atributos
	
	private Item[] items;
	private int indice;
	
	//Constructor

	public ContenedorDistribuidor() {
		
		this.items = new Item[10];
		this.indice = 0;
	}
	
	//Accesadores	

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	//Servicios
	
	public boolean estaVacio() {
		
		boolean rsp = false;
		if(this.indice == 0) {
			rsp = true;
		}
		return rsp;
	}
	
	public void addItem( Item item ) {
		
		this.items[this.indice++] = item; //primero asigna y después incrementa índice.
	}
	
	public boolean siItemEsDispensable( Item item ) {
		
		if(!this.estaVacio() && item.equals(this.items[0]))
			return true;
		else
			return false;
	}
	
	public String obtenerNombreItemDispensable() { //obtiene el nombre del item que ocupa la posición 0.
		
		if(!this.estaVacio())
			return this.items[0].getNombre();
		else
			return "Empty";		
	}
	
	public double obtenerPrecioItemDispensable() {
		
		if(!this.estaVacio())
			return this.items[0].getPrecio();
		else
			return 0.0;	
	}
	
	public void despacharItem() {
	//activar el circuito de dispensación del item
		System.out.println(this.obtenerNombreItemDispensable() + " ha sido dispensado");
	}
	
	public void distribuir( Item item ) {
		this.despacharItem();
		for(int i=0; i < this.items.length-1; ++i) {
			this.items[i] = this.items[i+1];
		}
		this.indice--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
