/**
 * 
 */
package excepciones;

/**
 * @author Francisco
 *
 */
public class SituacionExcepcional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String name;
//		System.out.println(name);
//
//		String name2 = null;
//		System.out.println(name2);
//		System.out.println(name2.length());
		
		try {			
			int a = 2;
			int b = 0;
			System.out.println(a/b);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		} finally {
			System.out.println("Termino el try catch");
		}
		
		System.out.println("Hola");
		
		String[] array = {"Hola", "Adios", null, "Prueba1"};
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(array[i].toLowerCase());
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Mensaje final");

	}

}
