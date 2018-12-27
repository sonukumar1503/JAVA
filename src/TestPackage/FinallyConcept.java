package TestPackage;

public class FinallyConcept {

	public static void main(String[] args) {
		test();

	}
	
	public static void test(){
		try{
			System.out.println("Inside try block");
			throw new RuntimeException("test");
		}catch(Exception e){
			System.out.println("Insode catch block");
		}finally{
			System.out.println("Inside finally block");
		}
	}

}
