package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print
		System.out.println("The content of LinkedList is : " + ll);
		
		//add First
		ll.addFirst("Sonu");
		//addLast
		ll.addLast("Automation");
		System.out.println("The content of LinkedList is : " + ll);
		
		
		//Get
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		//Set
		System.out.println(ll.set(1, "TestComplete"));
		System.out.println(ll.get(1));
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("The content of LinkedList is : " + ll);
		
		ll.remove(2);
		System.out.println("The content of LinkedList is : " + ll);
		
		// How to print all the value of LinkedList
		// Using For loop
		
		System.out.println("**********Using For Loop**********");
		for(int i = 0; i < ll.size(); i++){
			System.out.println(ll.get(i));
		}
		
		// Using advance for loop
		System.out.println("**********Using Advance For Loop**********");
		for(String str : ll){
			System.out.println(str);
		}
		
		//Using Iterator
		System.out.println("**********Using Iterator**********");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//Using While Loop
		
		System.out.println("**********Using While Loop**********");
		int num = 0;
		while(ll.size() > num){
			System.out.println(ll.get(num));
			num++;
		}
		

	}

}
