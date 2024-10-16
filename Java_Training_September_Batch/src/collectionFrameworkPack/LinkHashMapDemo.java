package collectionFrameworkPack;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMapDemo {

	public static void main(String[] args) {

		// map will store data in the form key and value pair
		// search operation is faster in map

		Map<String, String> map = new LinkedHashMap<String, String>();

		map.put("19", "India");
		map.put("32", "Indonesia");
		map.put("13", "Australia");
		map.put("42", "Canada");
		map.put("15", "Bermuda");

		for (Map.Entry<String, String> entryset : map.entrySet()) {
			System.out.println(entryset.getKey() + "  " + entryset.getValue());
		}

		// HashMap //LinkHashMap // TreeMap
	}

}
