package Assignment1;

import java.time.LocalDate;

/**
 * Class account creates all parameters for the bank account, 
 * accepts parameters from Person.
 * 
 * Get + Set for all fields + default constructor.
 * 
 * Two methods calculate + return the interest - by month, based on year rate. and 
 * fee by month based on balance of account.
 * 
 * two methods will calculate + return withdraw and deposit.
 * 
 * one display method for all account details.
 * 
 * @author zpell
 *
 */
public class Account {

	private int accID;
	private double accBal;
	private final double annIntRate = 4.5;
	private Person person;
	private LocalDate DoC;
	
	public Account() {
		this.accID = 0;
		this.accBal = 0.0;
		this.person = new Person("A", "Z", LocalDate.now());
		this.DoC = LocalDate.now();
		
		
	}
	public Account(int accID, double accBal, LocalDate DoC, String fName, String lName, LocalDate DoB ) {
		this.accID = accID;
		this.accBal = accBal;
		this.DoC = DoC;
		this.person = new Person(fName, lName, DoB);

}
	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public LocalDate getDoC() {
		return DoC;
	}
	public void setDoC(LocalDate doC) {
		DoC = doC;
	}
	public double getAnnIntRate() {
		return (annIntRate/12);
	}
	public double getMIntRate() {
		return (getAnnIntRate() * accBal);
	}
	public double withdraw(double amount) {
		return (accBal -= amount);
	}
	public double deposit(double amount) {
		return (accBal += amount);
	}
	public void display() {
		System.out.println("-------Account holder details--------");
		person.display();
		System.out.println("Account ID: " + accID);
		System.out.println("Account balance: " + accBal);
		System.out.println("Account created on: " + DoC);
		
	}
	
}
