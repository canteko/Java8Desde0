/**
 * 
 */
package herencia;

/**
 * @author Francisco
 *
 */
public class Polimorfismo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Trabajador trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "", "");
		Empleado empleado = new Empleado("Larry Ellison", "Presidente", "Redwood", "", "", 100000.0, 1000.0);
		Consultor consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);
		
		System.out.println(trabajador);
		System.out.println(empleado);
		System.out.println(consultor);
		
		saludar(trabajador);
		conocerSueldo(trabajador);
		saludar(empleado);
		conocerSueldo(empleado);
		saludar(consultor);
		conocerSueldo(consultor);
	}
	
	public static void saludar(Trabajador t) {
		System.out.println("Hola, querido amigo " + t.getNombre());
	}
	
	public static void conocerSueldo(Trabajador t) {
		System.out.printf("El trabajador %s cobra %.2f euros\n", t.getNombre(), t.calcularPaga());
	}

}
