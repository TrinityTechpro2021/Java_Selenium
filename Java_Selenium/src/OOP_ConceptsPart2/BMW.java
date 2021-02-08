package OOP_ConceptsPart2;

public class BMW extends Car{ //"has-a-relationship
	
	//when same methods is present in parent class as well as in child class with the same name and same number of arguments, is called Method Overriding
	
	public void start() { //overridden method
		System.out.println("BMW---start");
	}
	
	public void theftSafty() {
		System.out.println(" BMW---theftSafty");
	}

}
