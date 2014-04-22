package maquina;

public class CashViejo {
	//Atributos
	private int amount; //Dinero que mete el usuario
	private int[]valor = {5,10,20,50,100};//Valor en centimos de las monedas
	private int[]monedas; //monedas que tiene almacenadas
	private int total; //valor almacenado en la maquina
	private int[]aux; //monedas que se utilizan en el cambio

	public CashViejo() {
		// Constructor
		this.amount = 0;
		this.monedas = new int[this.valor.length];//tamaño en funcion de las monedas
		this.total = 0;
		this.aux = new int[this.valor.length]; //temaño en funcion de las monedas
	}

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
	public boolean siHayMonedas (int cambio, int indice, int total){
		for(int i = this.monedas[indice];i>=0 && cambio <= total; i--){
			if(i*this.valor[indice]>cambio){//si el valor de las monedas es mayor que el cambio, no me sirve, y le digo que continue
				continue;
			}
			this.aux[indice]=1;//anotamos las monedas de este tipo que vamos a devolver
			if(i*this.valor[indice]==cambio){//si es el cambio justo he terminado
				return true;
			}
			if(indice>0){//si todavia quedan mas monedas
				if(this.siHayMonedas(cambio-(i*this.valor[indice]), indice-1, total-(i*this.valor[indice]))){
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
		switch (coin) {
		case 5:
			this.amount += coin;
			this.total += coin;
			this.monedas[0]++;
			break;
		
		case 10:
			this.amount += coin;
			this.total += coin;
			this.monedas[1]++;
			break;
		
		case 20:
			this.amount += coin;
			this.total += coin;
			this.monedas[2]++;
			break;
		
		case 50:
			this.amount += coin;
			this.total += coin;
			this.monedas[3]++;
			break;
			
		case 100:
			this.amount += coin;
			this.total += coin;
			this.monedas[4]++;
			break;
			
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		CashViejo cash = new CashViejo();
		int[]monedas={0,0,4,1,1};
		cash.setMonedas(monedas);
		cash.setTotal(230);
		System.out.println(cash.siHayCambio(80));

	}

}
