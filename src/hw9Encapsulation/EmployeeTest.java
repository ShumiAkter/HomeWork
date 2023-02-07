package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Shumi Akter");
		employee.setAge(123);
		employee.setSex('F');
		employee.setCitizen(true);

		System.out.println("Employee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge()
				+ "\nEmployee Gender: " + employee.getSex() + "\nIs Employee US Citisen: " + employee.isCitizen());
	}

}
