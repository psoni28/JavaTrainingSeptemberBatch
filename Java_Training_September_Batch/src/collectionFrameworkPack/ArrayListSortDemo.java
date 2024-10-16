package collectionFrameworkPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("India");
		list.add("India");
		list.add("Australia");
		list.add("Canada");
		list.add("Austria");
		list.add("Barmuda");

		System.out.println("Before Sorting");

		for (String country : list) {
			System.out.println(country);
		}
		System.out.println("After Sorting");

		Collections.sort(list);

		for (String country : list) {
			System.out.println(country);
		}
		

	}

}
