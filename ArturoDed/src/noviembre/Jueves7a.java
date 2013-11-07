package noviembre;

public class Jueves7a {
/* 	Las iteraciones o bucles (repeticiones)
 * 	Repetición de un fragmento de código desde 0 hasta infinitas veces.
 * 	Esta estructura está condicionadapor una expresión lógica y esta expresión
 * puede estar determinada (sé cuantas veces se ejecuta) o ser indeterminada (no sé las veces).
 * 
 * 	Escribir un mensaje de saludo un número finito de veces (10).
 * 		veces = 10
 * 		mientras no haya terminado de escribir los mensajes (mientras veces sea mayor que 0) hacer 
 * 			escribir mensaje de saludo
 * 			contar que ya he escrito un mensaje más (decremento en 1 el valor de veces)
 * 		finmientras
 */

	public static void main(String[] args) {
		// declaramos las variables que utilizamos
		//int veces = 10;
		//implementación
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
