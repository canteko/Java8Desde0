package clasesyobjetos;

import java.util.Arrays;

public class Rectangulo {
	private Punto[] puntos;
	
	/**
	 * @return the puntos
	 */
	public Punto[] getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(Punto[] puntos) {
		this.puntos = puntos;
	}

	// Constructor
	public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
		puntos = new Punto[]{punto1, punto2, punto3, punto4};
	}

	@Override
	public String toString() {
		return "Rectangulo [puntos=" + Arrays.toString(puntos) + "]";
	}
}
