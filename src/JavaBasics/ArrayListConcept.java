package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add("100");
		ar.add("200");
		ar.add("300");
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Shayam");
		
		
		System.out.println(ar.size());
		 for(int i = 0; i<= ar.size() -1 ; i++){
			 System.out.println(ar.get(i));
		}
		
		// ArrayList<Integer> arl = new ArrayList<Integer>();
		
	}

}
