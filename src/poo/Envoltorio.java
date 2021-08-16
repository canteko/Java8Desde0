package poo;

public class Envoltorio {
    public static void main(String[] args) {
        // Podemos procesar una cadena de caracteres
    	// para obtener un valor int
    	int x = Integer.parseInt("12345");
    	System.out.println(x);
    	
    	// Podemos obtener el maximo entre dos enteros
    	System.out.println(Integer.max(123, 345));
    	
    	// Podemos obtener la representacion binaria, hexadecial u octal de un entero
    	System.out.println(Integer.toBinaryString(123));
    	System.out.println(Integer.toHexString(123));
    	System.out.println(Integer.toOctalString(123));
    	
    	// Podemos obtener instancias de cualquier tipo con los metodos valueOf
    	Long l = Long.valueOf("123123123123123123");
    	Double d = Double.valueOf("123123123123123123");
    	System.out.println(l);
    	System.out.println(d);
    	
    	// Podemos comprobar si un caracter es letra o numero
    	char c = 'c';
    	System.out.println(Character.isAlphabetic(c));
    	System.out.println(Character.isDigit(c));
    	
    	// Podemos realizar operaciones logicas
    	System.out.println(Boolean.logicalXor(true, true));
    	
    }
}
