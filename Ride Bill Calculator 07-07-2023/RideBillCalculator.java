import java.util.Scanner;
class RideBillCalculator{
	public static void main(String[] args){
		int bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas Provide your Height and Age to calculate bill.");
		System.out.println("Enter your height in CM: ");
		int height = sc.nextInt();
		
		if(height>120){
			System.out.println("You can ride.");
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			if(age<12){
				bill=5;
				System.out.println("You want photos: Yes-1   No-0");
				int option = sc.nextInt();
				switch(option){
					case 1:
						bill+= 3;
						System.out.println("Total Bill is $"+bill);
						break;
					case 0:
						System.out.println("Total Bill is $"+bill);
						break;
				}
				
			}
			else if(12<= age && age <18){
				bill=7;
				System.out.println("You want photos: Yes-1   No-0");
				int option = sc.nextInt();
				switch(option){
					case 1:
						bill+= 3;
						System.out.println("Total Bill is $"+bill);
						break;
					case 0:
						System.out.println("Total Bill is $"+bill);
						break;
				}
				
			}
			else if(18<=age && age <45){
				bill=12;
				System.out.println("You want photos: Yes-1   No-0");
				int option = sc.nextInt();
				switch(option){
					case 1:
						bill+= 3;
						System.out.println("Total Bill is $"+bill);
						break;
					case 0:
						System.out.println("Total Bill is $"+bill);
						break;
				}
			}
			else if(45<=age && age<=55){
				bill=0;
				System.out.println("You want photos: Yes-1   No-0");
				int option = sc.nextInt();
				switch(option){
					case 1:
						bill+= 3;
						System.out.println("Total Bill is $"+bill);
						break;
					case 0:
						System.out.println("Total Bill is $"+bill);
						break;
				}
			}
			else{
				System.out.println("You can't ride your age must be in between 0-55 year");
			}
			
			
		}
		else{
			System.out.println("You Can't ride");
		}
		
	}
	
}