package collectionFrameworkPack;

import java.util.Arrays;

public class TestMainArraySort {

	public static void main(String[] args) {

		int[] arr = { 10, 15, 2, 9, -4, 11, 20, 18, 4 };

		for (int e : arr) {
			System.out.print(e + " ");
		}
		Arrays.sort(arr);
		System.out.println();

		for (int e1 : arr) {
			System.out.print(e1 + " ");
		}
	}
}