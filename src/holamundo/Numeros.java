/**
 * 
 */
package holamundo;

/**
 * @author Francisco
 *
 */
public class Numeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Enteros
		byte byteVal = 100; // 8 bits
		short shortVal = 1000; // 16 bits
		int intVal = 1232; // 32 bits
		long longVal = 0L; // 64 bits
		
		// Reales
		float floatVal = 0.0f; // 32 bits
		double doubleVal = 0.0d; // 64 bits
		
		// Operadores numericos
		final int x = 7;
		final int y = 5;
		int z;
		
		// Suma
		z = x + y;
		System.out.println("Suma: " + x + "+" + y);
		System.out.println(z);
		
		// Resta
		z = x - y;
		System.out.println("Resta: " + x + "-" + y);
		System.out.println(z);
		
		// Multiplicacion
		z = x * y;
		System.out.println("Multiplicacion: " + x + "*" + y);
		System.out.println(z);
		
		// Division
		z = x / y;
		System.out.println("Division: " + x + "/" + y);
		System.out.println(z);
		
		// Modulo
		z = x % y;
		System.out.println("Modulo: " + x + "%" + y);
		System.out.println(z);
		
		// Incremento
		z = x;
		z++;
		System.out.println("Incremento: " + x + "++");
		System.out.println(z);
	}

}
