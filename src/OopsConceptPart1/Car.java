package OopsConceptPart1;

public class Car {
	int mod;
	int wheel;

	public static void main(String[] args) {
		// new Car - object of Car Class  
		// new keyword is used to create object
		//  a, b, c is object reference Variable
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 6;
		
		c.mod = 2013;
		c.wheel = 4;
		
		System.out.println("*************************Before assiging the reference variable*************************");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("*************************After Shifting the reference variable*************************");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(a.mod);
		System.out.println(c.mod);

	}

}
