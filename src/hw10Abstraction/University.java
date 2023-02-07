package hw10Abstraction;

public interface University extends College, Hospital {
	

	public void classSize(); // Declared method

	public void playGround();

	public abstract void teacher();

	// public University() {} ------constructor
	// You can't create a Constructor inside the University interface because
	// Interfaces can't have constructor

	public default void gymnasium() { // default method
		
	}
	public static void library() { //static method
		
		/*
		 1) Only one (extends ) keyword are used for the inheritance in interface. 
		 2)  Interface can inherit other interface. But Interface can't inherit a regular class or an abstract class by extends keyword
		3)  An Interface can inherit more than one Interface (separate by comma)
		 
		 */
		
	}
	
}
