package factoryPattern;


public class Dog implements Pet {
    private String breed;
    private String petId;
    private String petName;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Aw, aw!";
    }

    @Override
    public String play() {
        return "Catching objects that you throw!";
    }

    @Override
    public String getPetId() {
        return petId;
    }

    @Override
    public void setPetId(String petId) {
        this.petId = petId;
    }

    @Override
    public String getPetName() {
        return petName;
    }

    @Override
    public void setPetName(String petName) {
        this.petName = petName;
    }
}
