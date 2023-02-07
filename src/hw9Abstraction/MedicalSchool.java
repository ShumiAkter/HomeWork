package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool{
	public MedicalSchool () {//default constructor
		
	}	
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is from non abstract method from MedicalSchool class");	
	}
	
	// Two ( extends and implements ) keyword are used for inheritance in Java for Abstract Class.
	// Abstract Class  can only inherit a regular class or an abstract class by extends keyword.But it can't inherit interface by extends keyword.
	// We can inherit one Regular Class or one Abstract Class by extends keywords and more than one interface in Abstract Class by Implements keywords.

}
