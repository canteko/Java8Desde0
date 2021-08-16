package holamundo;

public class Variables {
	public static void main(String[] args) {
		int number = 1;
		int secondNumber = 2;
		
		final int definitiveNumber = 3;
		
		System.out.println(definitiveNumber);
		
		int newNumber = number + definitiveNumber;

		System.out.println(newNumber + secondNumber);
		
	}
}
