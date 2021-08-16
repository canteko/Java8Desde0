package interfaces;

public interface Interface {
	public void metodo();
	
	default public void metodoPorDefecto() {
		System.out.println("Por defecto");
	}
	
	static public void metodoEstatico() {
		System.out.println("Estatico");
	}
}
