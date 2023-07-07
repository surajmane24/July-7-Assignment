import java.util.Scanner;

class CheckPrimeNumber{
	static void checkPrime(int number){
		int i, mid, flag=0;
		mid = number/2;
		
		if(number==0 || number==1){
			System.out.println("Number is not a prime number");
		}
		else{
			for(i=2; i<=mid; i++){
				if(number%2==0){
					System.out.println("number is not a prime number");
					flag=1;
					break;
				}
			}	
			if(flag==0){
				System.out.println("Number is prime number");
			}
			
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr number to check is Prime or Not: ");
		int number = sc.nextInt();
		
		checkPrime(number);
	}
}