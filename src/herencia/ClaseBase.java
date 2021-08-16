package herencia;

public class ClaseBase {
	
	private String mensaje;
	
	public ClaseBase() {
		this.mensaje = "Mensaje por defecto";
	}
	
	public ClaseBase(String mensaje) {
		this.mensaje = mensaje;
	}

	public void imprimir() {
		System.out.println(this.mensaje);
	}
	
}
