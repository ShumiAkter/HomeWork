package hw11Abstraction;

public interface College {
	
	//declared method
	public abstract void commonRoom();
	public void laboratory();
	public void languageClub();

	public default void dorm() {// //default method
		
	}
	public static void studyRoom() {//static method
		
	}
}
