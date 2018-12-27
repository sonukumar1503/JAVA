package OopsConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	// Only method declaration
	// No method body - Only method prototype
	// variable declare in interface is by default static in nature
	// var value can not be changed, Its final in nature
	// no static method is allowed
	// No main method in interface
	// we can not create the object of interface because Interface is abstract in nature
	
	
	

}
