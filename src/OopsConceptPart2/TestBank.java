package OopsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		//USBank.min_bal = 200;
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.personalLocan();
		
		
		// Dynamic Polymorphism 
		// Child Class Object can be referred by Parent Interface Reference variable
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.toString();

	}

}
