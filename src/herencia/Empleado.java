/**
 * 
 */
package herencia;

/**
 * @author Francisco
 *
 */
public class Empleado extends Trabajador {
	
	private double sueldo;
	private double impuestos;
	
	private final int PAGAS = 14;

	/**
	 * @param nombre
	 * @param puesto
	 * @param direccion
	 * @param telefono
	 * @param nSS
	 * @param sueldo
	 * @param impuestos
	 */
	public Empleado(String nombre, String puesto, String direccion, String telefono, String nSS, double sueldo,
			double impuestos) {
		super(nombre, puesto, direccion, telefono, nSS);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @return the impuestos
	 */
	public double getImpuestos() {
		return impuestos;
	}

	/**
	 * @return the pAGAS
	 */
	public int getPAGAS() {
		return PAGAS;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @param impuestos the impuestos to set
	 */
	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	
	public double calcularPaga() {
		return (sueldo - impuestos) / PAGAS;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", PAGAS=" + PAGAS + ", getNombre()="
				+ getNombre() + ", getPuesto()=" + getPuesto() + ", getDireccion()=" + getDireccion()
				+ ", getTelefono()=" + getTelefono() + ", getnSS()=" + getnSS() + "]";
	}
	
}
