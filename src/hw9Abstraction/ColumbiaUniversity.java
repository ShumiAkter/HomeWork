package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
	
	//public abstract void chemistry();
	// Regular class can't contain abstract method
	
	public ColumbiaUniversity () {//default constructor 	
	}	
	public void biology() {//non abstract method
		System.out.println("This is from non abstract method from ColumbiaUniversity class");	
		
		// // Two ( extends and implements ) keyword are used for inheritance in Java for Regular  Class.
		// Abstract Class  can only inherit a regular class or an abstract class by extends keyword.     
		// More than one inheritances are possible in an Abstract Class (separate by comma).

	

	}
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}
