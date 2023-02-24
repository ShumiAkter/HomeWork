package hw12Polymorphism;

/*
---- Overloading allows a class to have more than one method with same name but with different parameter. 
---- It doesn't support same parameter.
---- Method Overloading occurs during compile time.

*/
public class Sister {
	
	// Void type method
	public void sister() {
		System.out.println("This is void type method from Sister class");
	}

	// Void type Parameterized method 
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {	//method are implements 
		int tota0l = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;	// local variables
		System.out.println("Total ages of sister is =  " + tota0l);
	}

	// Return type parameterized method
	public int sister(int age1, double age8, String age4, int age3, float age7) {
		int total02 = age1 + (int) age8 + Integer.parseInt(age4) + age3 + (int) age7;	// local variables
		System.out.println("Total ages of sister is =  " + total02);
		return total02;
	}

	// Static type parameterized method
	public static int sister(float age7, String age4, int age5, int age6) {
		int total03 = (int) age7 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total ages of sister is =  " + total03);
		return total03;
	}

	// Final type parameterized method
	public final int sister(int age2, int age3, int age5, String age4, double age8) {
		int total04 = age2 + age3 + age5 + Integer.parseInt(age4) + (int) age8;
		System.out.println("Total ages of sister is =  " + total04);
		return total04;
	}

}
