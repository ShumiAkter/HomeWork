package hw4JavaVariables;

public class AboutMe {

	//variables are declared
	public String myName;
	public byte weeklySalary;
	public short myRent;
	public int myAge;
	public long height;
	public float weight;
	public double yearlySalary;
	public char gender;
	public boolean married;

	//Constructor are declared
	public AboutMe() {
		System.out.println("This is all about us:");
	}
//Method implement
	public void aboutMe() {
		System.out.println("\nMy name: " + myName + "\nMy WeeklySalary: " + weeklySalary + "\nMy Monthly Rent " + myRent
				+ "\nMy Age: " + myAge + "\nMy Height is: " + height + "\nMy Wight is: " + weight + "\nMy yearly salary: "
				+ yearlySalary + "\nMy Gender is: " + gender + "\nI am married: " + married);

	}
}
