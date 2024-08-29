package factoryPattern;

public class Cat implements Pet {
    private Integer noOfLives;
    private String petId;
    private String petName;

    public Integer getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
    }

    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    @Override
    public String play() {
        return "Catching/pursuing moving objects!";
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