package CollectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// Its similar to Hash Map but its synchronized
		// STore the value on basis of key-value
		//key --> Object --> Hash Code --> Value
		
		Hashtable ht = new Hashtable();
		ht.put(1, "Tom");
		ht.put(2, "Peter");
		ht.put(3, "Steve");
		
		//Create a copy or clone
		
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)ht.clone();
		
		System.out.println("The value from h1: " + ht);
		System.out.println("The value from h2: " + h2);
		
		ht.clear();
		
		System.out.println("The value from h1: " + ht);
		System.out.println("The value from h2: " + h2);
		
		//Contain Value
		
		Hashtable st = new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.containsValue("Naveen")){
			System.out.println("Value is found");
		}
		
		// Print all the value of hsah table --> Enumeration  --> elements()
		
		Enumeration e = st.elements();
		System.out.println("Print all the value of st using Enumeration");
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		System.out.println("Print all the value from st using entryset");
		
		Set s = st.entrySet();
		System.out.println(s);
		
		// To check two hash tables are equal or not 
		
		Hashtable st1 = new Hashtable();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium"); // It contain unique value
		// No null key or null value
		
		System.out.println("Values from st1");
		System.out.println(st1);
		
		if(st.equals(st1))
				System.out.println("Both are equal");
		
		// get a value from key
		
		System.out.println(st.get("A"));
		
		// get the hash code of hash table object
		
		System.out.println("The hash code value of st1 object is :" + st1.hashCode());

	}

}
