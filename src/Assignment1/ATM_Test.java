package Assignment1;

import java.time.LocalDate;
import java.util.Scanner;

public class ATM_Test {

	/**
	 * main method will: 
	 * 
	 * create three objects account.
	 * accepts user input for ID and starting balance. 
	 * If ID is incorrect, prompt to enter again...
	 * 
	 * create a method that allows user input for creating all account parameter values.
	 * 
	 * create method that gives the user a choice of different actions: 
	 * display info, display balance, withdraw, deposit, and exit program.
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Account acct1 = new Account();
		//***Struggle here with calling method to create object acct1
		acct1 = inputAccDetails();
		acct1.display();
		
		Account acct2 = new Account();
		acct2 = inputAccDetails();
		acct2.display();
		
		Account acct3 = new Account();
		acct3 = inputAccDetails();
		acct3.display();
		
		System.out.println("--------Main Menu---------");
		System.out.println("Please enter your ID:");
		Scanner userIn = new Scanner(System.in);
		int ID = userIn.nextInt();
		
		while(ID > 0) {
			//***Struggle here on the syntax to getID for acct1 
			if(ID == acct1.getAccID()) 
				//***Struggle here: parameter for menu function call is the acct. we want to show
				menu(acct1);
				
				else if(ID == acct2.getAccID())
				menu(acct2);	
			
				else if(ID == acct3.getAccID())
				menu(acct3);
			
				else 
					System.out.println("Enter valid ID");
				ID = userIn.nextInt();
				
			}
		}
				
	
/**
 * this method creates acc Account object from all inputs from user: 
 * 
 * @return
 */
	public static Account inputAccDetails() {
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String fName = userIn.nextLine();
		System.out.println("Enter last name: ");
		String lName = userIn.nextLine();
		System.out.println("Enter month of birth: ");
		int mob = userIn.nextInt();
		System.out.println("Enter day of birth: ");
		int dob = userIn.nextInt();
		System.out.println("Enter year of birth: ");
		int yob = userIn.nextInt();
		LocalDate DoB = LocalDate.of(yob, mob, dob);
		System.out.println("Enter your ID: ");
		int ID = userIn.nextInt();
		System.out.println("Enter your initial balance: ");
		double accBal = userIn.nextDouble();
		//***Struggle here: to create local date for creation of account:
		LocalDate DoC = LocalDate.now();
		
		//***Struggle here to create object acc after all inputs are filled, and
		//returned
		// NOTE: to enter all parameters IN RIGHT ORDER before returning acc.
		Account acct = new Account(ID, accBal, DoC, fName, lName, DoB);
		return acct;
		
	}
	//***Struggle here: passing parameter Account in menu = big struggle 
	public static void menu(Account acct) {
		
		System.out.println("-----Welcome to ATM------");
		System.out.println("PLease choose form the following options: ");
		System.out.println("1: Display balance");
		System.out.println("2: Display account details");
		System.out.println("3: Withdrawal");
		System.out.println("4: Deposit");
		System.out.println("5: Exit");
		Scanner userIn = new Scanner(System.in);
		int choice = userIn.nextInt();
		
		while(choice > 0) {
			switch(choice) {
			case 1: 
				System.out.println("Your balance : " + acct.getAccBal());
			break;
			
			case 2: 
				acct.display();
			break;
			
			case 3:
				System.out.println("What amount do you want to withdraw?");
				double amount = userIn.nextDouble();
				acct.withdraw(amount);
			break;
			
			case 4:
				System.out.println("What amount do you want to deposit?");
				amount = userIn.nextDouble();
				acct.deposit(amount);
			break;
			
			case 5: 
				//***Struggle here: choice number + system.exit(number):
				choice = 5;
				System.out.println("Goodbye");
				System.exit(5);
				
			//***Don't forget default! 
			default:
				System.out.println("Please enter a valid option");
				
			}
			//**outside switch, menu again, prompting for another choice ( BUT inside the while() . 
			
			System.out.println("-----Welcome to ATM------");
			System.out.println("PLease choose form the following options: ");
			System.out.println("1: Display balance");
			System.out.println("2: Display account details");
			System.out.println("3: Withdrawal");
			System.out.println("4: Deposit");
			System.out.println("5: Exit");
			userIn = new Scanner(System.in);
			choice = userIn.nextInt();
		}
	}

}
