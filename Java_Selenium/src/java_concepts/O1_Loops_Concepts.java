package java_concepts;

public class O1_Loops_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//while loop:
		//dis-advantage of while loop: it will generate infinite loop if you do not give incremental/decremntal part
		
		int i = 1;    //initialization
		
		while(i<=10) { //condition
			System.out.println(+i);
			i++; //incremental or decremental 
		}
		
		System.out.println("********************************");
		
		//for loop
		
		for(int j=1; j<=10; j++) { //initialization, condition, increment/decrement
			System.out.println(+j);
			
		}
		
		System.out.println("********************************");
		for(int k=10; k>=1; k--) { //initialization, condition, increment/decrement
			System.out.println(+k);
			
		}
		

	}

}
