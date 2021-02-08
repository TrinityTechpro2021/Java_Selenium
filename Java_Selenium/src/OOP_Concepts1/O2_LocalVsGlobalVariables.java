package OOP_Concepts1;

public class O2_LocalVsGlobalVariables {
	
	//Global variables - class variable
	String name = "John";
	int age = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10; // local variable
		System.out.println(i);
		
		O2_LocalVsGlobalVariables lvg = new O2_LocalVsGlobalVariables();
		
		System.out.println(lvg.name);
		System.out.println(lvg.age);

	}
	
	public void sum() {
		int i = 15; //local variable for sum method
		int j = 20;
		int age = 25;
	}

}
