package tratardatos;

import java.util.Random;

public class ArrayObjetos {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] nombres = {"Francisco", "Javi", "Alberto", "Rafael", "Tomás", "Alejandro", "David"};
		String[] apellidos = {"Sáenz", "Lago", "Cruz", "Moya", "Romero", "Arévalo", "García"};
		Persona[] personas = new Persona[5];
		
		for(int i = 0; i < personas.length; i++) {
			String nombre = nombres[random(personas.length)];
			String apellido = apellidos[random(personas.length)];
			
			personas[i] = new Persona();
			personas[i].setNombre(nombre);
			personas[i].setApellidos(apellido);
		}
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
	
	public static int random(int max) { 
		Random r = new Random();
		return r.nextInt(max);
	}

}
