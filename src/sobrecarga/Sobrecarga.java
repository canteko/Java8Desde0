/**
 * 
 */
package sobrecarga;

/**
 * @author Francisco
 *
 */
public class Sobrecarga {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Artista artista = new Artista();

		artista.dibuja("Hola");
		artista.dibuja(7);
		artista.dibuja(7, 8.3f);
		
		Persona p1 = new Persona();
		Persona p2 = new Persona("Pepe", "Pérez");
		Persona p3 = new Persona("Alejandro", "Ruiz", 23);
		Persona p4 = new Persona("Miguel", "Gámez", 25, 180, 75f);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
