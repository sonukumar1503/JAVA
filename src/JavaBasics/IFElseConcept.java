package JavaBasics;

public class IFElseConcept {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		if (b > a){
			System.out.println("b is greater than a");
		}else{
			System.out.println("a is greater than b");
		}
		
		
		// comparison operator : < > <= >= == !=
		int c = 30;
		int d = 40;
		if (c == d){
			System.out.println("c & d are equal");
		}else {
			System.out.println("c & d are not equal");
		}
		
		// Write a logic to find out highest number
		
		int a1 = 100;
		int b1 = 300;
		int c1 = 500;
		
		if(a1 > b1 & a1 > c1){
			System.out.println("a1 is the greatest");
		}else if(b1 > c1){
			System.out.println("b1 is the greatest");
		}else{
			System.out.println("c1 is the greatest");
		}

	}

}
