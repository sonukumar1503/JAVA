package OopsConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}
	
	public static void main(int p){
		
	}
	
	public static void main(int q, int r){
		
	}
	// We can overlaod main method
	// method overloading - When the method name is same with different argument or input parameter withing same class
	// we can not create method inside the method
	// Duplicate method.. i.e.. same method name with same number of argument are not allowed 
	public void sum(){
		System.out.println("Sum Method :: Zero Parameter");
	}
	
	public void sum(int i){
		System.out.println("Sum method :: One Parameter");
		System.out.println(i);
	}
	
	public void sum(int k, int l){
		System.out.println("Sum method :: Two Parameter");
		System.out.println(k+l);
	}

}
