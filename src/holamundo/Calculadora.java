/**
 * 
 */
package holamundo;

import java.util.Scanner;

/**
 * @author Francisco
 *
 */
public class Calculadora {

	// Números con los que vamos a operar
	private float firstNumber, secondNumber;
	private Scanner sc = new Scanner(System.in);
	private int option;
	
	public void calculator() {
		do {
			// Menú de la calculadora
			System.out.println("*** CALCULADORA PAKETE ***");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
			System.out.println("0. Salir del programa");
			System.out.println("Introduzca una opcion: ");
			
			// Recibimos lo escrito por pantalla
			this.option = Integer.parseInt(this.sc.nextLine());
			
			// Si es 0, pasamos a la siguiente iteración, pero como el bucle se acaba cuando la opción es
			if(this.option == 0) {
				break;
			}
			
			// Obtenemos los números que vamos a operar
			this.getNumbersToOperate();
			
			// Comprobamos las opciones
			switch(this.option) {
				case 1:
					System.out.println("El resultado de la suma es: " + (this.firstNumber + this.secondNumber));
					break;
				case 2:
					System.out.println("El resultado de la resta es: " + (this.firstNumber - this.secondNumber));
					break;
				case 3:
					System.out.println("El resultado de la multiplicacion es: " + (this.firstNumber * this.secondNumber));
					break;
				case 4:
					System.out.println("El resultado de la division es: " + (this.firstNumber / this.secondNumber));
					break;
				case 5:
					System.out.println("El resultado del modulo es: " + (this.firstNumber % this.secondNumber));
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		} while (true);
		
		System.out.println("Hemos terminado la calculadora");
	}
	
	private void getNumbersToOperate() {
		System.out.println("Introduzca el primer operando: ");
		this.firstNumber = Integer.parseInt(this.sc.nextLine());
		System.out.println("Introduzca el segundo operando: ");
		this.secondNumber = Integer.parseInt(this.sc.nextLine());
	}
}
