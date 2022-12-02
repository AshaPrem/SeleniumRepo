package week1.day2;



public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Input=13;
				boolean flag=false;
				
	
		
		for (int i = 2; i < Input/2; i++) {
		if (Input%i==0) {
			flag=true;
			break;
			
		}	
		}
		if (!flag)
			System.out.println(Input + " is a prime number");
			else
				System.out.println(Input + " is not a prime number");
			
	}
}
		