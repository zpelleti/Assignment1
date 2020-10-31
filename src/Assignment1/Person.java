package Assignment1;

import java.time.LocalDate;

/**
 * first class: two String fields for first name and last name
 * plus localdate for date of birth.
 * 
 * add constructor and display method
 * 
 * @author zpell
 *
 */
public class Person {

	private String fName;
	private String lName;
	private LocalDate DoB;
	
	public Person(String fName, String lName, LocalDate DoB) {
		this.fName = fName;
		this.lName = lName;
		this.DoB = DoB;
		
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public LocalDate getDoB() {
		return DoB;
	}
	public void display() {
		System.out.println("First name: " + fName);
		System.out.println("Last name : " + lName);
		System.out.println("Date of birth: " + DoB);
		
	}
}
