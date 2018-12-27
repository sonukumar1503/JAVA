package OopsConceptPart1;

public class CallByValueAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testSum(x, y);
		
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		
		// After swapping
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	public int testSum(int a, int b){
		a = 40;
		b = 70;
		int c = a + b;
		return c;
		
	}
	
	public void swap(CallByValueAndCallByRef t){
		int temp = t.p;
		t.p = t.q;
		t.q = temp;
	}

}
