//primero siempre se genera sólo el package
//con control+shift de la izquierda + f autogeneraba el formato
package contador;

//aqui se ponen las importaciones, por ejemplo la siguiente
import java.io.*;

public class ContadorDevice {
	/* lo primero que ponemos es el estado de los objetos, es decir, los
	atributos, pueden ser privados, protegidos o publicos, nosotros los
	declaramos siempre privados para que esten encapsulados, lo nombres de
	atributos siempre empiezan en minuscula, la clase en mayúscula*/
	private int valorActual;
	//hay que indicar el valor de inicio
	private int valorInicial;

	/*si acabo con los atributos, luego van los constructores, siempre
	 publicos, siempre escrito igual que la clase y seguido de parentesis
	 (Java no tiene destructores). El this da valores*/
	public ContadorDevice() {
		this.valorActual = 0;
		this.valorInicial = 0;
	}

	public ContadorDevice(int valorActual) {
		this.valorActual = valorActual;
		this.valorInicial = 0;
	}
	public ContadorDevice(int valorActual, int valorInicial) {
		this.valorActual = valorActual;
		this.valorInicial = valorInicial;
	}
	//Accesadores, elementos para acceder a los atributos, lo genera solo, el Source, Generate Getters and Setters
	public int getValorActual() {
		return valorActual;
	}

	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}

	public int getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}
	/*despues de los constructores van los accesedores
	servicios, métodos que me permiten hacer algo, los métodos empiezan en minuscula*/
	public String toString(){
		String mensaje = "";
		mensaje += this.valorActual;
		return mensaje;
	}
	public void incrementar(){
		this.valorActual = this.valorActual +1;
			}
	public void decrementar(){
		this.valorActual = this.valorActual -1;
	}
	public void resetear (){
		this.valorActual = this.valorInicial;
	}
	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		Construimos, instanciamos, el objeto de nuestra clase*/ 
		ContadorDevice contador = new ContadorDevice(5,2);
		contador.setValorActual(5);
		//mostramos el valor del contador
		contador.incrementar();
		contador.incrementar();
		System.out.println(contador.getValorActual());
		contador.decrementar();
		System.out.println(contador);
		contador.resetear();
		System.out.println(contador);
	}

}
