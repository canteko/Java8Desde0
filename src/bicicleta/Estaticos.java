package bicicleta;

public class Estaticos {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bicicleta b1 = new Bicicleta(21, 27, 0);
		Bicicleta b2 = new Bicicleta(24, 21, 1);

		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(Bicicleta.getNumeroDeBicicletas());
	}
}
