package collectionFrameworkPack;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// map will store data in the form key and value pair
		// search operation is faster in map

		Map<String, String> map = new HashMap<String, String>();

		map.put("1", "India");
		map.put("2", "Indonesia");
		map.put("3", "Australia");
		map.put("4", "Canada");
		map.put("5", "Bermuda");

		for (Map.Entry<String, String> entryset : map.entrySet()) {
			System.out.println(entryset.getKey() + "  " + entryset.getValue());
		}

		// HashMap //LinkHashMap // TreeMap
	}

}
