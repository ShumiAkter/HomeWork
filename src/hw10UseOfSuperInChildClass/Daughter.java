package hw10UseOfSuperInChildClass;

public class Daughter extends Father{
	
	String birthMonth;
	int age;
	
	//default constructor
public Daughter() {
	super();
	super.father();
	super.father("Hasan Shak ", 123, 'M', true);
	super.familyName = "Shumi";
	
	System.out.println("This is a default constructor from the child Class Daughter");
}

public Daughter(String birthMonth, int age) {
	this.birthMonth = birthMonth;
	this.age = age;
	System.out.println("Daughter Birth of Month: "+birthMonth+", Daughter age: "+age);
}
public void daughter() {
	
	super.familyName = "Shumi";
	
	System.out.println("Family Name: "+familyName);
	System.out.println("This is a implement method from the child Class Daughter");
}
public void daughter(String birthMonth, int age) {
	//local variables
	this.birthMonth = birthMonth;
	this.age = age;
	System.out.println("Daughter Birth of Month: "+birthMonth+", Daughter age: "+age);
}

}
