package JavaBasics;

import java.util.*;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put("A", "100");
		h.put("B","200");
		h.put("C", "300");
		
		System.out.println(h.size());
		
		System.out.println(h.get("C" ));

	}

}
