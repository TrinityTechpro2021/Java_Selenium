package OOP_Concepts1;

public class O6_CallByValueAndCallByRef {
	
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		O6_CallByValueAndCallByRef obj = new O6_CallByValueAndCallByRef();
		
		int x = 10;
		int y = 20;
		obj.testSum(x, y);  //call by value OR pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	
	public int testSum(int a, int b) {
				
		int c = a + b;
		return c;
	}
	
	
	//call by reference
	public void swap(O6_CallByValueAndCallByRef t) {
		
		int temp;
		temp = t.p; // temp value is 50;
		t.p = t.q; //temp value is 60;
		
		t.q = temp; //temp value is 50;
		
	}

}
