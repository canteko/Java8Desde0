/**
 * 
 */
package herencia;

/**
 * @author Francisco
 *
 */
public class Consultor extends Trabajador {

	private int horas;
	private double tarifa;
	/**
	 * @param nombre
	 * @param puesto
	 * @param direccion
	 * @param telefono
	 * @param nSS
	 * @param horas
	 * @param tarifa
	 */
	public Consultor(String nombre, String puesto, String direccion, String telefono, String nSS, int horas,
			double tarifa) {
		super(nombre, puesto, direccion, telefono, nSS);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}
	/**
	 * @return the tarifa
	 */
	public double getTarifa() {
		return tarifa;
	}
	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + ", getNombre()=" + getNombre() + ", getPuesto()="
				+ getPuesto() + ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono()
				+ ", getnSS()=" + getnSS() + "]";
	}
	
	public double calcularPaga() {
		return tarifa * horas;
	}
	
}
