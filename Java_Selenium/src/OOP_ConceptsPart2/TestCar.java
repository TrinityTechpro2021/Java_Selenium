package OOP_ConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//static polymorphism -- compile-time polymorphism
		BMW b = new BMW();
		
		b.start();
		b.stop();
		b.refuel();
		b.theftSafty();
		b.engine();
		
		System.out.println("****************");
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("****************");
		
		
		//Top Casting
		Car C1 = new BMW(); //child class object can be referred by parent class reference variable -- dynamic polymorphism or run-time polymorphism
		
		C1.start();
		C1.stop();
		C1.refuel();
		
		//Down Casting
		BMW b1 = (BMW) new Car();// ClassCastException
		

	}

}
