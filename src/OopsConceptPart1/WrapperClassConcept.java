package OopsConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		
		// Data Conversion : String to Int
		String x ="200";
		System.out.println(x+20);		
		int i = Integer.parseInt(x);
		System.out.println(i +20);
		
		// Data Conversion : String to double
		String y = "12.33";
		System.out.println(y+10);
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		// Data Conversion : String to boolean
		String z = "true";
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		// Int tp String
		
		int j = 200;
		System.out.println(j+20);
		String s =  String.valueOf(j);
		System.out.println(s+20);
		
		String s1 = "100A";
		Integer.parseInt(s1);// Number Format exception

	}

}
