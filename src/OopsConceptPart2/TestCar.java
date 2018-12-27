package OopsConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		BMW b1 = new BMW();
		b1.start();// Over ridden metthod
		// Static Polymorphism - Compile time Polymorphism
		b1.stop();
		b1.safety();
		b1.fuelRefil();
		b1.engine();
		
		System.out.println("*************************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.fuelRefil();
		
		System.out.println("************************");
		// Top Casting - Parent class reference variable can be assigned to child class Object
		Car c1 = new BMW();// Child class object can be refer by Parent class reference variable - Dynamic Polymorphism- Run Time Polymorphism
		c1.start();
		c1.stop();
		c1.fuelRefil();
		
		//Down Casting - Child class reference variable can not assigned to  parent class reference variable
		BMW b2 = (BMW)new Car();
		// ClassCastException @ Run time
		

	}

}
