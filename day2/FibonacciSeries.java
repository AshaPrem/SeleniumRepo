package week1.day2;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		int n=8;
		int firstNum=0, secNum=1, sum;
		System.out.println(firstNum);
		
		for (int i=1; i<=n; i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
	}
}

	
		
	
