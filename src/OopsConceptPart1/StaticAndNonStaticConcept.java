package OopsConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Tom";
	static int age = 25;
	// Gloabal Variable: The scope of global variable will be across all the functions with some condition

	public static void main(String[] args) {
		
		// Access Static Variable and method
		//1 . Direct Method
		System.out.println(age);
		sum();
		
		//2. calling by class name
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept.sum();
		
		// Access Non Static method
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.sendMail();
		
		// Can I access static method using object reference? - YES
		//obj.sum();// It should be access in static way

	}
	
	public void sendMail(){
		System.out.println("Send Mail Method");
	}
	
	public static void sum(){
		System.out.println("Sum method");
	}

}
