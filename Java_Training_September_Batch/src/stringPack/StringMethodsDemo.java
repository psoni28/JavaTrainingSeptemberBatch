package stringPack;

public class StringMethodsDemo {

	public static void main(String[] args) {

		String name = "learning java with selenium session";

		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		System.out.println(name.equalsIgnoreCase("learning jaVA With SELENIUM SESSION"));

		String[] words = name.split(" ");
//
//		for (String w : words) {
//			System.out.println(w);
//		}
//
//		char[] sents = name.toCharArray();
//
//		for (char ch : sents) {
//			System.out.println(ch);
//		}

		// uppercase
		// lowercase
		// sizeOfString
		// replace
		// replaceAll
		// split
		// toChar
		// chartAt
		// lenght
		// contains
		name = name.replaceAll(" ", ",");

		System.out.println(name.contains("learning"));
	}

}
