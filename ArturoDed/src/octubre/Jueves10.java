package octubre;
//Calcular la media de dos n�meros dados
//import java.io.*; //ahora no se est� usando, si se usa, quitar los par�ntesis
public class Jueves10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaro las variables
		int numero1 = 0;
		int numero2 = 0;
		int media = 0;
		numero1 = (int)(Math.random() * 100);
		numero2 = (int)(Math.random() * 10);
		//calcular la media
		media = (numero1+numero2)/2;
		System.out.println("Numero1: "+ numero1+" Numero2: "+ numero2 + " Media: "+media);
	}

}
