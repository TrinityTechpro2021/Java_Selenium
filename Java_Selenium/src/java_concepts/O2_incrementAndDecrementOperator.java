package java_concepts;

public class O2_incrementAndDecrementOperator {

	public static void main(String[] args) {
		
		int a = 1;
		int x = 1;
		int b = a++; //post increment
		int y = ++x; //pre increment
		
		System.out.println("valus of a " +a);
		System.out.println("value of b " +b);
		
		
		System.out.println("valus of x " +x);
		System.out.println("value of y " +y);
		
		
		
		int m = 2;
		int l = m--; //post decrement
		
		System.out.println("valus of m " +m);
		System.out.println("value of l " +l);
		
		
		int p = 2;
		int q = --p;  //ptr decrement
		System.out.println("valus of p " +p);
		System.out.println("value of q " +q);
		

	}

}
