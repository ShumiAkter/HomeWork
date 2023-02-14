package hw11Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{
	
	//public abstract void chemistry();
	// Regular class can't contain abstract method
	
	public ColumbiaUniversity () {//default constructor 	
		System.out.println("This is default constructor from Regular Class");
	}	
	public void biology() {//non abstract method
		System.out.println("This is from non abstract method from ColumbiaUniversity class");	
		
		
		// // Two ( extends and implements ) keyword are used for inheritance in Java for Regular  Class.
		// Abstract Class  can only inherit a regular class or an abstract class by extends keyword.     
		// More than one inheritances are possible in an Abstract Class (separate by comma).

	}
	public static void shumi() {
		System.out.println("This is static void method");
		
	}
	//Regular Class didn't support default void method
	/*
	public default void shahi() {
		
	}
	*/
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

}
