import java.util.Scanner;

class FibonacciSerie{
	static void fiboSeries(int number){
		int a=0, b=1, nextTerm;
		System.out.print(a + ", " + b + ", ");
		
		for(int i=2; i<=number; i++){
			nextTerm = a+b;
			a=b;
			b=nextTerm;
			System.out.print(nextTerm + ", ");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Print first n numbers in fibonacci series. Enter the value of n: ");
		int number = sc.nextInt();
		number = number-1;
		fiboSeries(number);
	}
}