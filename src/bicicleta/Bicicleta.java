package bicicleta;

public class Bicicleta {

	private int id;
	private int numMarchas;
	private int diametroRueda;
	private int velocidad;
	
	// Variable estatica
	private static int numeroDeBicicletas = 0;

	public Bicicleta(int numMarchas, int diametroRueda, int velocidad) {
		this.numMarchas = numMarchas;
		this.diametroRueda = diametroRueda;
		this.velocidad = velocidad;
		this.id = ++numeroDeBicicletas;
	}

	/**
	 * @return the numMarchas
	 */
	public int getNumMarchas() {
		return numMarchas;
	}

	/**
	 * @return the diametroRueda
	 */
	public int getDiametroRueda() {
		return diametroRueda;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the numeroDeBicicleras
	 */
	public static int getNumeroDeBicicletas() {
		return numeroDeBicicletas;
	}

	/**
	 * @param numMarchas the numMarchas to set
	 */
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	/**
	 * @param diametroRueda the diametroRueda to set
	 */
	public void setDiametroRueda(int diametroRueda) {
		this.diametroRueda = diametroRueda;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param numeroDeBicicleras the numeroDeBicicleras to set
	 */
	public static void setNumeroDeBicicletas(int numeroDeBicicleras) {
		Bicicleta.numeroDeBicicletas = numeroDeBicicleras;
	}

	@Override
	public String toString() {
		return "Bicicleta [id=" + id + ", numMarchas=" + numMarchas + ", diametroRueda=" + diametroRueda
				+ ", velocidad=" + velocidad + "]";
	}
	
}
