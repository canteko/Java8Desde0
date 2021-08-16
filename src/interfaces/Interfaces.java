package interfaces;

public class Interfaces {

	public static void main(String[] args) {
		RectanglePlus r1 = new RectanglePlus(10, 20);
		Relatable r2 = new RectanglePlus(20, 10);

		switch(r1.isLargerThan(r2)) {
			case -1:
				System.out.println("Es más xico");
				break;
			case 1:
				System.out.println("Es más rande");
				break;
			case 0:
				System.out.println("Es iwa");
				break;
		}
		
		Clase c =  new Clase();
		Clase2 c2 =  new Clase2();
		
		c.metodo();
		c2.metodo();
		
		c.metodoPorDefecto();
		c2.metodoPorDefecto();
	}

}
