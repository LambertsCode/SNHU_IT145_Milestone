import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    

    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);

        initializeDogList();
        initializeMonkeyList();

    	displayMenu();
    	String input;
        do {
        	input = scnr.next().toLowerCase();
        	checkInput(input);
        	switch (input) {
        	case "1":
        		intakeNewDog(scnr);
        		break;
        	case "2":
        		intakeNewMonkey(scnr);
        		break;
        	case "3":
        		reserveAnimal(scnr);
        		break;
        	case "4":
        		printAnimals("Dog");
        		break;
        	case "5":
        		printAnimals("Monkey");
        		break;
        	case "6":
        		System.out.println("Which list to print: Dog, Monkey or Available?");
        		String option = scnr.next();
        		printAnimals(option);
        		break;
        	case "q":
        		System.out.println("Goodbye");
        		System.exit(0);
        		break;
        	}
        } while (!input.equals("q"));

    }
    
    // This method checks to make sure the menu input is valid
    private static void checkInput(String input) {
    	ArrayList<String> inputOptions = new ArrayList<String>
		(Arrays.asList("1", "2", "3", "4", "5", "6", "q"));
    	if (!inputOptions.contains(input)) {
    		System.out.println("Invalid input. Please input a valid entry.");
    	}
    }
    
    // Gives option to return to menu or quit app
    private static void returnToMenuOrQuit(Scanner scanner) {
        System.out.print("Return to main menu? ");
        String choice = scanner.next();
        if (choice.equals("y")) {
        	displayMenu();
        }
        else {
    		System.out.println("Goodbye");
    		System.exit(0);
        }
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        Dog dog4 = new Dog("Potato", "Pomski", "male", "2", "15.6", "12-12-2024", "Canada", "in service", false, "Canada");
        
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }

    // Adds a dog to the dogList
    public static void intakeNewDog(Scanner scanner) {
    	scanner.nextLine();
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }

        }
        System.out.println("What is the dog's breed");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("When was the dog aquired?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What country is the dog from?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Has the dog been reserved? (true or false)");
        boolean reserved = scanner.nextBoolean();
        System.out.println("In what country is the dog in service?");
        String inServiceCountry = scanner.nextLine();
        scanner.nextLine();

        Dog newDog = new Dog(name, breed, gender, age, weight,
        		acquisitionDate, acquisitionCountry, trainingStatus,reserved, inServiceCountry);
        dogList.add(newDog);
        System.out.println("Dog, " + name + " added.");
        returnToMenuOrQuit(scanner);
    }
	// Adds a new monkey to monkeyList
    public static void intakeNewMonkey(Scanner scanner) {
    	scanner.nextLine();
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }

        }
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        System.out.println("When was the monkey aquired?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What country is the monkey from?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Has the monkey been reserved? (true or false)");
        boolean reserved = scanner.nextBoolean();
        System.out.println("In what country is the monkey in service?");
        String inServiceCountry = scanner.nextLine();
        scanner.nextLine();
        System.out.println("How long is the monkey's tail?");
        String tailLength = scanner.nextLine();
        System.out.println("How tall is the monkey?");
        String height = scanner.nextLine();
        System.out.println("How long is the monkey's body?");
        String bodyLength = scanner.nextLine();
        System.out.println("What species is the monkey?");
        String species = scanner.nextLine();
        ArrayList<String> monkeySpecies = new ArrayList<String>
		(Arrays.asList("capuchin", "guenon", "macaque", "marmoset", "squirrel monkey", "tamarin"));
        while (!monkeySpecies.contains(species.toLowerCase())) {
        	System.out.println("Not a valid species. Please enter one of the following:");
        	System.out.println("capuchin, guenon, macaque, marmoset, squirrel monkey or tamarin");
        	species = scanner.nextLine();
        }
        
        Monkey newMonkey = new Monkey(name, gender, age, weight, acquisitionDate, 
        		acquisitionCountry, trainingStatus, reserved, inServiceCountry,
        		tailLength, height, bodyLength, species);
        monkeyList.add(newMonkey);
        System.out.println("Monkey, " + name + " added.");
        returnToMenuOrQuit(scanner);
    }
    
    // Executes the reservation process
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("What type of animal are you looking for? Dog or Monkey?");
        scanner.nextLine();
        String animalType = scanner.nextLine();
        System.out.println("What country are you looking in?");
        String country = scanner.nextLine();
        if (animalType.equalsIgnoreCase("dog")) {
        	for (Dog dog: dogList) {
        		if (country.equalsIgnoreCase(dog.getInServiceCountry())) {
        			printAnimal(dog);
        		}
        	}
        	System.out.println("Enter the name of the dog you would like to reserve: ");
        	
        	String dogName = scanner.nextLine();
        	for (Dog dog : dogList) {
        		
        		if (dog.getName().equalsIgnoreCase(dogName)) {
        			dog.setReserved(true);
        		}
        	}
			System.out.println(dogName + " has been reserved.");
			returnToMenuOrQuit(scanner);
        }
        else if (animalType.equalsIgnoreCase("monkey")) {
        	System.out.println("There are currently no monkeys.");
        	displayMenu();
        }
        else {
        	System.out.println("Wrong animal type entered.");
        	displayMenu();
        }
    }
    
    // Prints a single dog object
    private static void printAnimal(Dog animal) {
    	System.out.println("Name: " + animal.getName());
    	System.out.println("   Breed: " + animal.getBreed());
    	System.out.println("   Gender: " + animal.getGender());
    	System.out.println("   Age: " + animal.getAge());
    	System.out.println("   Weight: " + animal.getWeight());
    	System.out.println("   Acquisition Date: " + animal.getAcquisitionDate());
    	System.out.println("   Acquition Country: " + animal.getAcquisitionLocation());
    	System.out.println("   Training Status: " + animal.getTrainingStatus());
    	System.out.println("   Reserved Status: " + animal.getReserved());
    	System.out.println("   In Service Country: " + animal.getInServiceCountry());
    }

    // Prints out requested animals
    public static void printAnimals(String listType) {
        if (listType.equalsIgnoreCase("dog")) {
        	for (Dog dog: dogList) {
        		printAnimal(dog);
        	}
        }
        else if (listType.equalsIgnoreCase("monkey")) {
        	System.out.println("This option needs to be implemented.");
        }
        else if (listType.equalsIgnoreCase("available")) {
        	for (Dog dog : dogList) {
        		if (dog.getReserved() == false && dog.getTrainingStatus().equals("in service")) {
        			printAnimal(dog);
        		}
        	}
        	if (listType.equalsIgnoreCase("monkey")) {
        		System.out.println("This option (monkey) needs to be implemented.");
        	}
        }
    }
}

