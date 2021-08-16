package herencia;

public class Super {

	public static void main(String[] args) {
//		ClaseBase cb = new ClaseBase();
//		ClaseDerivada cd = new ClaseDerivada();
		ClaseBase cb = new ClaseBase("Hola");
		ClaseDerivada cd = new ClaseDerivada("Dew");

		cb.imprimir();
		cd.imprimir();
		
	}

}
