package herencia;

public class ClaseDerivada extends ClaseBase {

	public ClaseDerivada() {
		super("Desde la clase derivada");
	}
	
	public ClaseDerivada(String mensaje) {
		super(mensaje);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Imprimo desde la clase derivada");
	}
}
