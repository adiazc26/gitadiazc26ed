package maquina;

import java.util.Scanner;

public class Cash {
	//Atributos
	private int amount;//valor introducido por el usuario
	private int[]valor ={5,10,20,50,100};//valor en centimos de las monedas
	private int[]monedas;//Numero de monedas almacenadas en la máquina
	private int total;//valor almacenado en la máquina, total que tiene almacenado incluso lo que meta el usuario
	private int[]aux;//monedas que se utilizan en el cambio

	public Cash() {
		this.amount=0;
		this.monedas = new int [this.valor.length];//tamaño en función de las monedas
		this.total=0;
		this.aux = new int [this.valor.length];//tamaño en funcion de las monedas
	}
	//Accesadores
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int[] getValor() {
		return valor;
	}
	public void setValor(int[] valor) {
		this.valor = valor;
	}
	public int[] getMonedas() {
		return monedas;
	}
	public void setMonedas(int[] monedas) {
		this.monedas = monedas;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int[] getAux() {
		return aux;
	}
	public void setAux(int[] aux) {
		this.aux = aux;
	}
	//Servicios
	public  boolean siHayMonedas(int cambio, int indice, int total){
		for(int i=this.monedas[indice]; i>=0 && cambio <= total; i--){
			if(i*this.valor[indice] > cambio){//si el valor de las monedas es mayor que el cambio no me sirve 
											  // y entonces le digo que continue
				continue;
			}
			this.aux[indice]=i;//anotamos las monedas de este tipo que vamos a devolver
			if (i*this.valor[indice]==cambio){//si es el cambio justo he terminado
				return true;	
			}
			if (indice > 0){//si todavía quedan más monedas
				if(this.siHayMonedas(cambio-(i*this.valor[indice]), indice-1,
						total-(this.monedas[indice]*this.valor[indice]))){
					return true;
				}
			}
			this.aux[indice]=0;
		}
		return false;
	}
	
	public boolean siHayCambio(int cambio){
		this.iniAux();
		return this.siHayMonedas(cambio, this.valor.length-1, this.total);
	}
	private void iniAux(){
		for(int i=0; i<this.aux.length;++i){
			this.aux[i]=0;
		}
	}
	public void addCash(int coin){
		switch(coin){
		case 5:   this.amount+= coin; this.total+=coin; this.monedas[0]++;break;
		case 10:  this.amount+= coin; this.total+=coin; this.monedas[1]++;break;
		case 20:  this.amount+= coin; this.total+=coin; this.monedas[2]++;break;
		case 50:  this.amount+= coin; this.total+=coin; this.monedas[3]++;break;
		case 100: this.amount+= coin; this.total+=coin; this.monedas[4]++;break;
		}
	}
	public boolean siHaySuficienteDinero(int precio){
		if(this.amount >= precio){
			return true;
		}
		return false;
	}
	//Método para mostar las monedas devueltas
	private void displayAux(){
		for (int i=0; i < this.aux.length;i++){
			if (this.aux[i] > 0){
				System.out.println("Monedas de " + this.valor[i] + " : " + this.aux[i]);
			}
		}
	}
	//Método hacer cambio
	public void hacerCambio(int precio){//cambio es el valor del producto
		this.amount -=precio;//restamos el valor del producto
	}
	
	//Método retornar el dinero que el usuario tiene en la máquina
	public void returnCash(){
		this.iniAux();
		if(this.siHayMonedas(this.amount, this.valor.length-1, this.total)){
			for(int i=0; i<this.aux.length;i++){
				this.monedas[i] -= this.aux[i];//quitamos las monedas que vamos a devolver
			}
			this.total -= this.amount;//actualizo el total de monedas que he devuelto
			this.amount=0;//cantidad de dinero que me queda para compras
		}
		this.displayAux();//mostrar las monedas que devuelve la máquina
	}
	
	public static void main(String[] args) {
		Cash cash = new Cash();
		int[]monedas={2,2,4,4,4};
		cash.setMonedas(monedas);
		
		System.out.println("Monedas que tiene la maquina actualmente (5, 10, 20, 50, 100 cts).");
		for(int i=0;i<monedas.length;i++){
			System.out.print(monedas[i]+",");
		}
		
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		
		int elegido = 0;
		int precio = 0;
		
		System.out.println("¿Que producto quieres?"
				+ "\n1. Refresco: 100cts."
				+ "\n2. Zumo: 80cts."
				+ "\n3. Agua: 50cts."
				+ "\n4. Café: 60cts.");
		elegido = teclado.nextInt();
		switch (elegido) {
		case 1:
			System.out.println("Debe introducir 100 cts.");
			precio = 100;
			break;
		case 2:
			System.out.println("Debe introducir 80 cts.");
			precio = 80;
			break;	
		case 3:
			System.out.println("Debe introducir 50 cts.");
			precio = 50;
			break;
		case 4:
			System.out.println("Debe introducir 60 cts.");
			precio = 60;
			break;
		default:
			
			break;
		}
		
		int cantidad = 0;
		int total = 0;
		
			System.out.println("¿Cuantas monedas introduce de 100 cts.?");
			cantidad = teclado.nextInt();
			cash.addCash(cantidad*100);
			total = cantidad*100;
			System.out.println("Lleva acumulado " + total + "cts.");
			
			if(total<precio){
				System.out.println("¿Cuantas monedas introduce de 50 cts.?");
				cantidad = teclado.nextInt();
				cash.addCash(cantidad*50);
				total = total + cantidad*50;
				System.out.println("Lleva acumulado " + total + "cts.");
			}
		
			if(total<precio){
			System.out.println("¿Cuantas monedas introduce de 20 cts.?");
			cantidad = teclado.nextInt();
			cash.addCash(cantidad*20);
			total = total + cantidad*20;
			System.out.println("Lleva acumulado " + total + "cts.");
			}
			
			if(total<precio){
			System.out.println("¿Cuantas monedas introduce de 10 cts.?");
			cantidad = teclado.nextInt();
			cash.addCash(cantidad*10);
			total = total + cantidad*10;
			System.out.println("Lleva acumulado " + total + "cts.");
			}
			
			if(total<precio){
			System.out.println("¿Cuantas monedas introduce de 5 cts.?");
			cantidad = teclado.nextInt();
			cash.addCash(cantidad*5);
			total = total + cantidad*5;
			System.out.println("Lleva acumulado " + total + "cts.");
			}
		
		
		System.out.println("Monedas que tiene la maquina actualmente (5, 10, 20, 50, 100 cts).");
		for(int i=0;i<monedas.length;i++){
			System.out.print(monedas[i]+",");
		}
		
		if(cash.siHaySuficienteDinero(precio) && cash.siHayCambio(total-precio)){
			cash.hacerCambio(precio);
		}
		
		teclado.close();
		
		/*	//Primer usuario
		 * System.out.println("Primer usuario");
		cash.addCash(50);
		cash.addCash(20);
		cash.addCash(10);
		cash.addCash(10);
		if(cash.siHaySuficienteDinero(80) && cash.siHayCambio(10)){
			cash.hacerCambio(80);
		}
		cash.returnCash();
		//Segundo usuario
		System.out.println("Segundo usuario");
		cash.addCash(100);
		if(cash.siHaySuficienteDinero(80) && cash.siHayCambio(20)){
			cash.hacerCambio(80);
		}
		cash.returnCash();
		//Tercer usuario
		System.out.println("Tercer usuario");
		cash.addCash(100);
		if(cash.siHaySuficienteDinero(50) && cash.siHayCambio(50)){
			cash.hacerCambio(50);
		}
		cash.returnCash();
		 */
	

	}

}
