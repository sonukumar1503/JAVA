package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap class implement Map interface
		//extend abstract map
		//It contain only unique element
		// store the value in the form of key - value pair
		// It may have one null key and multiple null value
		// It main No-order
		 // Hash Map is non synchronized - Not thread safe	
		//Concurrent Modification Exception - Fail Fast Condition
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		
		System.out.println(hm);
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Entry m : hm.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 25, "Admin");
		Employee e2 = new Employee("Peter", 26, "QA");
		Employee e3 = new Employee("Steve", 27, "Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> m : emp.entrySet()){
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.println("Employee" + key +"Info : ");
			System.out.println(e.name + " " + e.age + " " +e.dept);
		}
		

	}

}
