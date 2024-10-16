package collectionFrameworkPack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("India");
		list.add("India");
		list.add("Australia");
		list.add("Canada");
		list.add("Austria");
		list.add("Barmuda");
		// list.remove(1);

		List<String> list2 = new ArrayList<>();
		list2.add("China");
		list2.add("Pakistan");
		list2.add("South Africa");

		System.out.print("Before adding list 2");

		for (String country : list) {
			System.out.println(country);
		}

		System.out.println(list.containsAll(list2));

		list.addAll(list2);

		System.out.print("After adding list 2");
		for (String country : list) {
			System.out.println(country);
		}

		System.out.println(list.containsAll(list2));

		System.out.println(list.contains("India"));

		System.out.println(list.isEmpty());

		System.out.println(list.set(2, "Germony"));

		for (String country : list) {
			System.out.println(country);
		}

		// manipulation operation like insertion and deletion is slower, when using
		// million of data

	}

}
