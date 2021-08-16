/**
 * 
 */
package tratardatos;

/**
 * @author Francisco
 *
 */
public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Concatenar
		String nombre1 = "Mi nombre es " + "Pepe";
		String nombre2 = "Mi nombre es ".concat("Pepe");
		System.out.println(nombre1);
		System.out.println(nombre2);
		
		// Mayusculas minusculas
		System.out.println(nombre2);
		System.out.println(nombre2.toLowerCase());		
		System.out.println(nombre2.toUpperCase());
		
		// String format
		String nombre = "Pepe";
		String apellidos = "Álvarez";
		String frase = "Hola, soy %s %s, y me gusta que me llamen pa comer y pa cobrar";
		System.out.println(String.format(frase, nombre, apellidos));
		System.out.printf(frase, nombre, apellidos);
		
		// Comparación
		String a = "a", b = "A";
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		// Contains
		String a2 = "Me cago en todo", b2 = "todo";
		System.out.println(a2.contains(b2));
	}

}
