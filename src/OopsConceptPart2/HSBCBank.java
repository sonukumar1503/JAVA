package OopsConceptPart2;

public class HSBCBank implements USBank, BrazilBank{ // We are achieving multiple Inheritance
	// is-a-relationship
	// If the class is implementing any Interface, Its mandatory to define/override all the method of Interface
	public void credit(){
		System.out.println("HSBC BANK :: CREDIT");
	}
	
	public void debit(){
		System.out.println("HSBC BANK :: DEBIT");
	}
	
	public void transferMoney(){
		System.out.println("HSBC BANK :: TRANSFER MONEY");
	}
	
	public void educationLoan(){
		System.out.println("HSBC BANK :: EDUCATION LOAN");
	}
	
	public void personalLocan(){
		System.out.println("HSBC BANK :: PERSONAL LOAN");
	}
	
	// Define Brazil Bank Method
	public void mutualFund(){
		System.out.println("HSBC BANK :: MUTUAL FUND");
	}

}
