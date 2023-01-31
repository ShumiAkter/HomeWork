package hw8Abstraction;

public abstract class MedicalSchool {
	public MedicalSchool () {//default constructor
		
	}	
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is from non abstract method from MedicalSchool class");	
	}
	
	
	

}
