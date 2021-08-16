package interfaces;

public class Clase2 implements Interface {

	@Override
	public void metodo() {
		System.out.println("Otro metodo");
	}
	
	@Override
	public void metodoPorDefecto() {
		System.out.println("Quito el por defecto");
	}

}
