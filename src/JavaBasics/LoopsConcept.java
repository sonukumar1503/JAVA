package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//1. While Loop
		int i = 1; // Initialization
		while(i<=10){ // Conditional Part
			// Infinite loop if there is not incremental & decremental part
			System.out.println(i);
			i = i + 1; // Incremental or decremental 
		}
		
		System.out.println("********************");
		
		for (int j = 1; j <=10; j++){ // Initialization , Condition, Incremental
			System.out.println(j);
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&");
		// Print 10 to 1
		
		for (int k = 10; k >= -10; k--){ // Initialization , Condition, (Decremental)
			System.out.println(k);
		}

	}

}
