package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// configuration
	public float processor;
	public int memory;

	public Computer() {
		System.out.println("This is from the default Constructor of Computer class.");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char GPA, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = GPA;
		this.madeInUSA = madeInUSA;
		System.out.println("My computer brand: " + brand + ", My computer model: " + model + ", Operating System: "
				+ operatingSystem + ", Computer price: " + price + ", Grade: " + grade + ", Made in the USA: "
				+ madeInUSA);

	}

	public Computer(String model, int price, char grade, String brand) {
		this.model = model;
		this.price = price;
		this.grade = grade;
		this.brand = brand;
		System.out.println("My computer model: " + model + ", My computer price: " + price + ", Grade: " + grade
				+ ", My computer brand: " + brand);

	}

	public Computer(String model, int price, char grade) {
		this.model = model;
		this.price = price;
		this.grade = grade;
		System.out.println("My computer model: " + model + ", My computer price: " + price + ", Grade: " + grade);
	}

	public Computer(int price, String brand, char grade) {
		this.price = price;
		this.brand = brand;
		this.grade = grade;
		System.out.println("My computer price: " + price + ", My computer brand: " + brand + ", Grade: " + grade);
	}

	// My computer configuration
	public Computer(String brand, String model, float processor, int memory) {
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.memory = memory;
		System.out.println("My Computer brand: " + brand + "\nMy computer model: " + model + "\nMy computer processor: "
				+ processor + "\nMy computer memory: " + memory);
	}

}
