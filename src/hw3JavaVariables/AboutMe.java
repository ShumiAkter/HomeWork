package hw3JavaVariables;

public class AboutMe {

	public String className; // Variables are declared

	// Variables are initialized
	public String myName = "Shumi Akter";
	public byte weeklySalary = 126;
	public short myRent = 14500;
	public int myAge = 124;
	public long height = 38475l;
	public float weight = 134.97478f;
	public double yearlySalary = 28327684;
	public char gender = 'F';
	public boolean married = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println("My name is: " + aboutMe.myName + "\nMy Age is: " + aboutMe.myAge + "\nMy gender is: "
				+ aboutMe.gender);
		
	}

}
