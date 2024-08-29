package factoryPattern;
public interface Pet {
    String makeSound();

    String play();

    String getPetId();

    void setPetId(String petId);

    String getPetName();

    void setPetName(String petName);

    static Pet createPet(Integer choice) {
        try {
            switch (choice) {
                case 1:
                    Dog dog = new Dog();
                    dog.setPetId("D01");
                    dog.setPetName("Bantay");
                    dog.setBreed("German Shepherd");
                    return dog;
                case 2:
                    Cat cat = new Cat();
                    cat.setPetId("C01");
                    cat.setPetName("Muning");
                    cat.setNoOfLives(9);
                    return cat;
                default:
                    return null;
            }
        } catch (Exception e) {
            System.out.println("Error creating pet due to: " + e.getMessage());
            return null;
        }
    }
}