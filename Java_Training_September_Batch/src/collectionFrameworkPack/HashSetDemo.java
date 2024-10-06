package collectionFrameworkPack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> setList = new TreeSet<String>();

		//setList.add(null);
		//setList.add(null);
		setList.add("India");
		setList.add("America");
		setList.add("China");
		setList.add("America");
		setList.add("India");
		setList.add("Bermuda");

		for (String c : setList) {

			System.out.println(c);
		}

	}

}
