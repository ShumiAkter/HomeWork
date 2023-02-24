package hw12Polymorphism;

/*
 method overriding is when different methods exist with the same method name with same parameters or signature but with different syntax or logic
 Method Overriding occurs during run time.
 it happen when subclass (Niece extends) Parent class( Sister)
  
 */
public class Niece extends Sister {

// Void type method
	@Override
	public void sister() {
		System.out.println("This is void type method from Sister class");
	}

//Void type Parameterized method 	
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int tota0l = 3 * age1 + age2 + age3 + Integer.parseInt(age4) + age5 - 3 + age6;
		System.out.println("Total ages of sister is =  " + tota0l);
	}

//Return type parameterized method
	@Override
	public int sister(int age1, double age8, String age4, int age3, float age7) {
		int total02 = age1 + (int) age8 + Integer.parseInt(age4) + 3 + age3 + (int) age7;
		System.out.println("Total ages of sister is =  " + total02);
		return total02;

	}
	/*

	// Static type parameterized method 
	//static method can'possible Overridden.
	// It support overload.

	@Override
	public static int sister(String age4, int age5, int age6) {
		int total03 = Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total ages of sister is =  " + total03);
		return total03;

	}

	// Final type parameterized method
	// Final type method can't be Overridden because it already final by itself

	@Override
	public final int sister(int age2, int age3, int age5, String age4) {
		int total04 = age2 + age3 + age5 + Integer.parseInt(age4);
		System.out.println("Total ages of sister is =  " + total04);
		return total04;
	}
*/
	
}
