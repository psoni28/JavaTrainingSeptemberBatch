package forEachPack;

public class ForEachLoopDemo {

	public static void main(String[] args) {

		/*
		 * for(DataType v1: list) {
		 * 
		 * }
		 */

		int[] arr = { 10, 20, 30, 40, 50 };

		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */
//terminating condition for loop need to right for older loops

		// forEach loop
		for (int v1 : arr) {
			System.out.println(v1);
		}

	}

}
