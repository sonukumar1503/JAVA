package OopsConceptPart1;

public class LocalVsGlobalVariables {
	
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		int i = 20;
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		
		System.out.println(obj.age);
		obj.sum();

	}
	
	public  void sum(){
		int i = 25;
		int j = 35;
		System.out.println(i + " --  " +j);
	}

}
