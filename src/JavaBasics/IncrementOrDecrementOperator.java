package JavaBasics;

public class IncrementOrDecrementOperator {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i++; // Post increment - give value of i to j and increment i by 1
		
		System.out.println(i); //2
		System.out.println(j); //1
		
		int a =  1;
		int b = ++a; // Pre-increment - first increase the value of a by 1 and give the value of a to b
		
		System.out.println(a); // 2
		System.out.println(b); // 2
		
		System.out.println("PRE & POST Decrement");
		
		int m = 2;
		int n = m--; // Post Decrement - Give value of m to n and decrease the value of m by 1
		System.out.println(m); // 1
		System.out.println(n); // 2
		
		int k = 2;
		int l = --k; // Pre Decrement - First decrease the value of k by 1 and give it to l
		System.out.println(k); //1
		System.out.println(l); //1

	}

}
