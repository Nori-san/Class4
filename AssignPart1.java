
public class AssignPart1 {

	public static void main(String[] args) {
		
//		Part 1 :
//			Write a program that randomly generates an integer between 1 and 12
//			and based on the number, use switch case syntax to print which month has been chosen
//			1 for "January" , 2 for "Februaray" .....
		

		int num = (int) (Math.random() * 13);
		System.out.println("Random number is: " + num);
		String month = null;
		
		if (num < 1 || num > 12) {
			System.out.println("Invalid month");
			return;
		}
			
		switch (num) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}
		
		System.out.println("Random number " + num + " corresponds to " + month + ".");
			
		}

}
