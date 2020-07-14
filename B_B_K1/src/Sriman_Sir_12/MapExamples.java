package Sriman_Sir_12;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
			hm.put("abc", 1);
			hm.put("aaa", 2);
			System.out.println(hm);
			System.out.println("Value of one :"+hm.get("abc"));
	}

}
