package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();// constructor is initialized
//variables are initialized
		aboutMe.myName = "Shumi Akter";
		aboutMe.weeklySalary = 121;
		aboutMe.myRent = 1234;
		aboutMe.myAge = 123;
		aboutMe.height = 43218l;
		aboutMe.weight = 65432f;
		aboutMe.yearlySalary = 76543;
		aboutMe.gender = 'F';
		aboutMe.married = true;
		aboutMe.aboutMe();// Method is initialized

		System.out.println("\n************\t{ _____ }      **************\n");

		AboutMe Alex = new AboutMe();// constructor is initialized
		//variables are initialized
		Alex.myName = "Alex";
		Alex.weeklySalary = 120;
		Alex.myRent = 334;
		Alex.myAge = 33;
		Alex.height = 65418l;
		Alex.weight = 87632f;
		Alex.yearlySalary = 987543;
		Alex.gender = 'F';
		Alex.married = true;
		
		Alex.aboutMe(); //method is initialized

	}

}
