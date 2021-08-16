package tratardatos;

import java.util.Random;
import java.util.Arrays;

public class ArrayBidimensional {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int MAX = 50;
		final int LEN = 6;
		int[][] matrix = new int[LEN][LEN];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random(MAX);
			}
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}	
			System.out.println("");
		}
	
		System.out.println(Arrays.deepToString(matrix));
	}
	
	public static int random(int max) { 
		Random r = new Random();
		return r.nextInt(max);
	}

}
