package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// "+" is a concatenation operator
		
		// println used to write into console with newline in last
		
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "World";
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b); // 300
		System.out.println(x+y); //HelloWorld
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(x+y+(a+b));//HelloWorld300
		System.out.println(a+b+x+y+a+b);//300HelloWorld100200
		
		System.out.println(c+d);//22.66
		System.out.println(x+y+c+d);//HelloWorld12.3310.33
		
		System.out.println("The value of a is : " +a);
		System.out.println(a+d);

	}

}
