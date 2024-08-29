package factoryPattern;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Clinic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (true) {
            try {
                // Menu
                System.out.println("[1] Dog");
                System.out.println("[2] Cat");
                System.out.println("[3] Exit");

                // User input
                System.out.print("\nChoose your pet number: ");
                choice = input.nextInt();
                System.out.println();

                if (choice == 3) {
                    break;
                }

                // Pet creation depending on the user input
                Pet pet = Pet.createPet(choice);

                if (pet == null) {
                    System.out.println("Invalid choice, please try again.");
                    System.out.println();
                    continue;
                }

                PetRecord petFile = new PetRecord();

                // Print pet details
                petFile.setPet(pet);
                petFile.setPetId(pet.getPetId());
                petFile.setPetName(pet.getPetName());

                System.out.println("Pet id is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: " + petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());

                if (pet instanceof Cat) {
                    System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
                    System.out.println();
                } else if (pet instanceof Dog) {
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number.");
                input.nextLine(); 
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }

        System.out.println("Terminating.");
        input.close();
    }
}