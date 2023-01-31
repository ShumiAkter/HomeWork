package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {

		// Example from Hierarchical Inheritance are Mammal extends Animal, Reptile
		// extends Animal, and Birds extends Animal.

		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n...................(__)...................\n");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		System.out.println("\n...................(__)...................\n");

		// Here reptile is single Inheritance because reptile extends animal
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("\n...................(__)...................\n");

		// Here birds is single Inheritance because birds extends animal
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		System.out.println("\n...................(__)...................\n");

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("\n...................(__)...................\n");

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("\n...................(__)...................\n");

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("\n...................(__)...................\n");

		// This is Multi_Level Inheritance because bulldog extends dog, dog extends
		// mammal, and mammal extends animal
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("\n...................(__)...................\n");

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		System.out.println("\n...................(__)...................\n");

	}

}
