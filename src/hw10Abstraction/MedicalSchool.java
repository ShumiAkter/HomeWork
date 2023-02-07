package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{
	public MedicalSchool () {//default constructor
		
	}	
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is from non abstract method from MedicalSchool class");	
	}
	
	// Two ( extends and implements ) keyword are used for inheritance in Java for Abstract Class.
	// Abstract Class can inherit only a regular class or an abstract class by extends keyword.
	// More than one inheritances are possible in an Abstract Class (separate by comma).

}
