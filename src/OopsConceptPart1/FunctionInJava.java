package OopsConceptPart1;

public class FunctionInJava {

	// main method - staring point of execution
	public static void main(String[] args) {
		
		FunctionInJava obj = new FunctionInJava();
		// One object will be cretaed.. obj is the reference variable, refering to object "New FunctionInJava()
		// After creating the object, copy of all non static method will be given to this object
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		String s1 = obj.qa();
		System.out.println(s1);
		
		double x = obj.division(30, 9);
		System.out.println(x);

	}
	
	// void - Does not return anything
	public void test(){		// No Input, No Output
		System.out.println("In Test Method");
	}
	
	public int pqr(){		// No Input, Some Output
		System.out.println("In Pqr method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	public String qa(){		// No Input, Some Output
		System.out.println("In qa method");
		String s = "Selenium";
		return s;
	}
	public double division(int x, int y){
		System.out.println("In Division Method");
		int d = x/y;
		System.out.println("The divison is : "+d);
		return d;
	}

}
