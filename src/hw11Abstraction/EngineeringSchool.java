package hw11Abstraction;

public abstract class EngineeringSchool extends NYUniversity implements AeronauticalSchool {

	public abstract void mechanicalLab();
	public void computerLab() {
		System.out.println("This is from non abstract method from EngineeringSchool class ");
	}

}
