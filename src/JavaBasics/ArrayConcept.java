package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// Array to store single Data type value in a array variable 
		
		// 1. Integer Array
		// lowest boundary / index is 0
		// highest boundary/ Index is n-1 
		
		//DisAdvantage of Array 
			//1. Size is Fixed - Static Array - To Overcome this problem we use collection - ArrayList, HashTable 
			//2. Store only similar Data Type - To overcome this problem  we use Object Array
		
		int i[] =new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		//i[4] - ArrayIndexOutOfBoundException
		
		System.out.println(i.length); // Size/Length of Array
		
		//print all the value of array - For Loop (Always)
		
		for (int j = 0; j<i.length; j++){
			System.out.println(i[j]);
		}
		
		//2. Double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);
		
		//3. Charcter Array
		
		char c[] = new char[3];
		c[0] ='a';
		c[1] = 2;
		c[2] = '$';
		
		
		// 4. Boolean Array
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		// 5. String Array
		
		String s[] = new String[3];
		s[0] = "Test";
		s[1] = "Hello";
		s[2] = "World";
		
		System.out.println(s.length);
		
		// 6. Object Array (Object is Super Class) - Object array is used to store different data type in same array
	/*	
		Object ob[] = new Object[6];
		ob[0] = "Tom" ;
		ob[1] =  10;
		ob[2] =  12.33;
		ob[3] =  "01/01/1999";
		ob[4] =  'M';
		ob[5] =  "London";*/
	
		

	}

}
