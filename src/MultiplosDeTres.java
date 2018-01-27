/**
 * 
 */

/**
 * @author tiagowmmicloud.com
 *
 */
public class MultiplosDeTres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int j = 1;
		int count = 20;
		while(j < count) {
			if(j % 4 == 0) {
				System.out.println("" + j);
			}
			j++;
		}
		
		for (int i = 1; i <= count; i++) {
			if (i % 2 == 0) {
				System.out.println(" " + i);
			}
		}
		
		for (int i = 3; i < count; i += 3) {
			System.out.println(" " + i);
		}
	}

}
