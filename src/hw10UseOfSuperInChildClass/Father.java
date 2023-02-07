package hw10UseOfSuperInChildClass;

public class Father {
	
	//Declared variables
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen ;
	public String familyName;
	
	public Father() {//default constructor
		System.out.println("This is a default constructor from the Parent Class Father");
	}
	
	//parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;	
		System.out.println("Father name: "+name+", Father's age: "+age+", Father sex: "+sex+", Is Father USCitizen: "+usCitizen);
	}
	//implement method
	public void father() {
		System.out.println("This is a void type method from the Parents Class of Father");
		
	}
	public void father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;	
		System.out.println("Father name: "+name+"Father's age: "+age+"Father sex: "+sex+"Is Father USCitizen: "+usCitizen);
	}
	

}

