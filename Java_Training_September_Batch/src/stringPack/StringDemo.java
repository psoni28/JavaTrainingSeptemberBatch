package stringPack;

public class StringDemo {

	public static void main(String[] args) {

		String name1 = "India"; // first way of creating string

		String name2 = new String("India"); // second way of creating string

		System.out.println(name1.equals(name2));// compare with actual value

		System.out.println(name1 == name2);// compare addresses of variable

		// String immutable/ unchangable

		name1.concat(" is a greate country");

		System.out.println(name1);

	}

}
