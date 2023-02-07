package hw9Abstraction;

public interface Hospital {

//Declared method
	public void emergencyRoom();

	public abstract void surgeryRoom();

	public void cafeteria();

	public default void morgue() {// default method

	}

	public static void pharmacy() {// static method

	}
}
