import java.util.Scanner;

public class AssignPart3 {

	public static void main(String[] args) {

//		Write a program to prompt user to enter the following information
//		1- “Please Enter your first name”
//		2- Take user’s first name
//		3- show a message “Please Enter your last name”
//		4- Take user’s last name
//		5- show a message “Please Enter your age”
//		6- Take user’s age
//		7- Show the user a message that uses those values => Hello : last name, you have year’s old; nice to meet you! -> use printf
//		8- Create a random number between 1 and 50
//		9- Show a message “Please guess a number between 1 and 50”
//		10- After user entered the number, check If the number is equal print message “you are lucky”
//		11- if the number is greater than the generate number, then message the user => “Choose a smaller one you, you were unlucky”
//		12- if the number is smaller than the generate number, then message the user => “Choose a bigger one, you were unlucky”
		
		// 1-7
		int age, randomNum, num;
		String firstName, lastName;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter your first name: ");
			firstName = input.next();
		System.out.println("Please Enter your last name: ");
			lastName = input.next();
		System.out.println("Please Enter your age: ");
			age = input.nextInt();
			
		System.out.printf("Hello! %s, %s, you are %d years old. Nice to meet you!%n%n", firstName, lastName, age);
		System.out.println("==============================================");
		
		 // 8-12
		System.out.print("Please guess a number between 1 and 50: ");
		 num = input.nextInt();
		 randomNum = (int) (Math.random() *51);
		
		while (num < 1 || num > 50) {
			System.out.print("Invalid input. Re-enter number: ");
			num = input.nextInt();
			randomNum = (int) (Math.random() *51);
		}
		System.out.println("Random number is: " + randomNum);
		 
		 if (randomNum == num) {
			 System.out.println("you are lucky");
		 } else if (num > randomNum) {
			 System.out.println("Choose a smaller one, you were unlucky");
		 } else {
			 System.out.println("Choose a bigger one, you were unlucky");
		 }
		 
		 input.close();
	}

}
