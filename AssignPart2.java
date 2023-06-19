import java.util.Scanner;

public class AssignPart2 {

	public static void main(String[] args) {
		
//		Part 2 :
//			Write a program that prompts the
//			user to enter the month and year and displays the number of days in the
//			month. For example, if the user entered month 2 and year 2012, the program
//			should display that February 2012 had 29 days. If the user entered month 3
//			and year 2015, the program should display that March 2015 had 31 days.
//			use this link-> https://coda.io/@hales/simple-online-calculator-for-dates-and-times/how-manymonths-of-the-year-have-28-days-13
//			don't forget about leap years that have 29 days !!!

		int year, monthNum, days;
		boolean leapYear = false;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter month (1-12): ");
		monthNum = input.nextInt();
		
		while (monthNum < 1 || monthNum > 12) {
			System.out.print("Invalid month. Re-enter month: ");
			monthNum = input.nextInt();
		}
		
		System.out.print("Enter Year: ");
		year = input.nextInt();
		
		// Using boolean weather leap year is true or false
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					leapYear =  true;
				} else {
					leapYear = false;
				}
		
		// Determining Month and Days
		days = 0;
		String month = null;
        if (monthNum >= 1 && monthNum <= 12) {
            switch (monthNum) {
                case 1: 
                	month = "January";
                	days = 31;
                	break;
                	
                case 2: 
                	month = "February"; 
                    if (leapYear == true) {
                    	days = 29;
                    } else {
                    	days = 28;
                    }
                    break;
                    
                case 3: 
                	month = "March";
                	days = 31;
                	break;
                	
                case 4: 	
                	month = "April";
                	days = 30;
                    break;
               
                case 5: 
                	month = "May";
                	days = 31;
                	break;
                	
                case 6: 
                	month = "June";
                	days = 30;
                    break;	
                	
                case 7: 
                	month = "July";
                	days = 31;
                	break;
                	
                case 8: 
                	month = "August";
                	days = 31;
                	break;
                	
                case 9: 
                	month = "September";
                	days = 30;
                    break;
                	
                case 10: 
                	month = "October";
                	days = 31;
                	break;
                	
                case 11:
                	month = "November";
                	days = 30;
                    break;
                	
                case 12: 
                	month = "December";
                	days = 31;
                    break;
            		}
        		} 
        
        		System.out.println(month + " " + year + " has " + days + " days");
        		input.close();
        
    	}
	}


