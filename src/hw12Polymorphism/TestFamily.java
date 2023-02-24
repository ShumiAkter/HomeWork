package hw12Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println(".............. Sister .............\n");
		Sister sis = new Sister();
		sis.sister();	//void type method
		sis.sister(5, 10, 60, "30", 20, 16);	//parameterized void type method
		sis.sister(13, 4334l, "24", 16,14.32f);		//return type parameterized method
		Sister.sister(3.4f,"34", 145,100);
		sis.sister(30, 50, 60,"90", 34565l);
		
		System.out.println("\n.............. Niece .............\n");
		Niece nic = new Niece();
		nic.sister();
		nic.sister(2, 10, 20, "15", 13, 18);
		nic.sister(9, 2, "5", 10, 4);
		
	
	
		
		
	}
	

}
