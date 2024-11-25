import java.util.Scanner;

public class TextUI {

    private Scanner scanner = new Scanner(System.in);

    // Method to select a pet type and give it a name
    public CyberPet selectPet() {
        System.out.println("Select a pet type:");
        System.out.println("1. Dog");
        System.out.println("2. Fish");
        System.out.println("3. Ninja");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the name of your pet: ");
        String name = scanner.nextLine();

        switch (choice) {
            case 1:
                return new Dog(name);
            case 2:
                return new Fish(name);
            case 3:
                return new Ninja(name);
            default:
                System.out.println("Invalid choice, defaulting to Dog.");
                return new Dog(name);
        }
    }

    // Method to display the status of the pet
    public void showStatus(CyberPet pet) {
        System.out.println("\nPet: " + pet.getName());
        System.out.println(pet.getStatus());
        System.out.println("What would you like to do? Press any other key to exit game.");
        System.out.println("1. Feed");
        System.out.println("2. Play");
        System.out.println("3. Sleep");
        System.out.println("4. Speak");
        System.out.println("5. Move");
    }

    // Method to get the user's choice of action
    public String getUserInput() {
        System.out.print("Enter your choice: ");
        return scanner.nextLine();
    }
}
