/**
 * 
 */
package modificadores;

import paquetec.C;

/**
 * @author Francisco
 *
 */
public class Modificadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		A a = new A(); // A no es accesible, aunque esté en un subpaquete
		
		B b = new B();
		System.out.println(b.b); // Esto no es recomendable
		System.out.println(b.getB());
		
		C c = new C();
//		System.out.println(c.c); // Esto va a petar
		System.out.println(c.getC());

	}

}
