package Sriman_Sir_13;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDemo {
	public static void main(String[] args) {
		
		Employee emp = new Employee(1);
		Employee emp1 = new Employee(1);
		
		Map<Employee, String> map = new HashMap<Employee, String>();
			map.put(emp, "jack");
			map.put(emp1, "jack");
		System.out.println(map.size());
		System.out.println(map.entrySet());
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
			map1.put(i, "one");
			map1.put(i1, "one");
		System.out.println(map1.size());
		System.out.println(map1.entrySet());
	}

}
