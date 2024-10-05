package stringbufferAndBuilderPack;

public class StringBufferAndBuilderDemo {

	public static void main(String[] args) {

		// immutable- string one

		String name = "hello world";

		System.out.println("before append : " + name);

		name.concat(" java");

		System.out.println("after append : " + name);

		// mutable- string below one string buffer and string builder class

		StringBuffer name2 = new StringBuffer("hello world");

		System.out.println("String buffer before append : " + name2);

		name2.append(" java");

		System.out.println("String buffer after append : " + name2);

		StringBuilder name3 = new StringBuilder("hellow world");

		System.out.println("String builder before append : " + name3);

		name3.append(" java");

		System.out.println("String builder after append : " + name3);

	}

}
