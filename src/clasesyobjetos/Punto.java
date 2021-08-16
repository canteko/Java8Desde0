/**
 * 
 */
package clasesyobjetos;

/**
 * @author Francisco
 *
 */
public class Punto {
	// Atributos privados
	private float x;
	
	private float y;
	
	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}
	
	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}
	
	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}
	
	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
}
