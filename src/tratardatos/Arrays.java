/**
 * 
 */
package tratardatos;

/**
 * @author Francisco
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] newArray = new int[10];
		
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = i * 100;
		}
		
		for(int element : newArray) {
			System.out.println(element);
		}
		
		int[] newArray2 = {
				1,2,3,4,5,6,7,8,9
		};
		
		for(int element : newArray2) {
			System.out.println(element);
		}
	}

}
