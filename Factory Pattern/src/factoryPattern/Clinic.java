package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pet pet;
        PetRecord petFile = new PetRecord();

        while (true) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepherd");

                    System.out.println("Pet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                    System.out.println("Communication sound: " + petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    break;

                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);

                    System.out.println("Pet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
                    System.out.println("Communication sound: " + petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    break;

                case 3:
                    System.out.println("Terminating.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            System.out.println();
        }
    }
}