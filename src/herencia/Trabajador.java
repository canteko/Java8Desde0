package herencia;

public class Trabajador {

	private String nombre;
	private String puesto;
	private String direccion;
	private String telefono;
	private String nSS; // Numero seguridad social
	
	private static final double SALARIO_BASE = 30000.0;
	
	/**
	 * 
	 * @param nombre
	 * @param puesto
	 * @param direccion
	 * @param telefono
	 * @param nSS
	 */
	public Trabajador(String nombre, String puesto, String direccion, String telefono, String nSS) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nSS = nSS;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @return the nSS
	 */
	public String getnSS() {
		return nSS;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @param nSS the nSS to set
	 */
	public void setnSS(String nSS) {
		this.nSS = nSS;
	}
	
	public double calcularPaga() {
		return this.SALARIO_BASE;
	}
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", direccion=" + direccion + ", telefono="
				+ telefono + ", nSS=" + nSS + "]";
	}
}
