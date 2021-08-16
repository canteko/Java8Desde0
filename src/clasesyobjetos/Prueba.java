/**
 * 
 */
package clasesyobjetos;

/**
 * @author Francisco
 *
 */
public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		imprimirMensajes("Imprimeme esto", "Y esto", "Y esto también bebé");

	}

	
	public static void imprimirMensajes(final String... mensajes) {
		for(String mensaje : mensajes) {
			System.out.println(mensaje);
		}
	}
}
