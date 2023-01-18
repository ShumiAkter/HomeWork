package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {

		System.out.println("\n<......................First Outcome..............................>\n");
		Computer computer = new Computer();

		System.out.println("\n<......................Second Outcome..............................>\n");
		Computer computer2 = new Computer("Apple", "MackBook Air", "Mojave", 800, 'A', false);

		System.out.println("\n<......................Extra for learning..............................>\n");
		Computer computer3 = new Computer("MackBook Pro", 1000, 'B', "Apple");
		Computer computer4 = new Computer("Window", 950, 'C');
		Computer computer5 = new Computer(950, "Lenovo", 'C');
		System.out.println("\n<......................Configuration..............................>\n");
		Computer shumi = new Computer("Apple", "MacBook Air", 1.8f, 8);

	}

}
