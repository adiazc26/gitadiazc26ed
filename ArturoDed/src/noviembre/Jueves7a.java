package noviembre;

public class Jueves7a {
/* 	Las iteraciones o bucles (repeticiones)
 * 	Repetici�n de un fragmento de c�digo desde 0 hasta infinitas veces.
 * 	Esta estructura est� condicionadapor una expresi�n l�gica y esta expresi�n
 * puede estar determinada (s� cuantas veces se ejecuta) o ser indeterminada (no s� las veces).
 * 
 * 	Escribir un mensaje de saludo un n�mero finito de veces (10).
 * 		veces = 10
 * 		mientras no haya terminado de escribir los mensajes (mientras veces sea mayor que 0) hacer 
 * 			escribir mensaje de saludo
 * 			contar que ya he escrito un mensaje m�s (decremento en 1 el valor de veces)
 * 		finmientras
 */

	public static void main(String[] args) {
		// declaramos las variables que utilizamos
		//int veces = 10;
		//implementaci�n
		/*while(veces-- > 0){
			System.out.println("Hola, Mundo");
			//veces = veces - 1;
			//veces--;
			//--veces;
		}*/
		//for (veces = 0 ; veces < 10 ; ++veces){
		/*for (int i = 0 ; i < 10 ; ++i){
			System.out.println("Hola, Mundo");
		}
		*/
		/*int i = 0;
		i = 0;
		while (i < 10){
			System.out.println("Hola, Mundo");
			++i;
		}
		*/
		//No es muy ortodoxo el siguiente, pero funciona, el de "Seguimos, adelante", sale intercaladamente.
		int i = 0;
		while (true){
			System.out.println("Hola, Mundo");
			++i;
			if(i == 10) {
				break;
			}
			System.out.println("Seguimos, adelante");
		}
	}
}
