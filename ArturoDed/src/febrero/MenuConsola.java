package febrero;
/*
 * Creación del Menu del Dispositivo Contador
 * Deben conocer todas las opciones que se necesitan
 * Deben conocer el Prompt
 * Deben conocer la opción elegida por el usuario
 */

public class MenuConsola {
	//que conozco como MenuConsola
	protected String[] items;
	protected String prompt;
	protected int indice;
	protected int opcion;	
	//Constructores
	public MenuConsola() {
		this.items = new String[10];
		this.prompt ="";
		this.indice = 0;
		this.opcion = 0;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
