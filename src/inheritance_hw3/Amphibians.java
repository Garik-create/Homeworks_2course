package inheritance_hw3;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String animalName, Integer age, String livingEnvironment) {
        super(animalName, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public void eat() {
    }

    @Override
    public String toString() {
        return "Класс Amphibians, "+getAnimalName()+", возраст "+getBirthYear()+" лет, среда обитания - "+
                getLivingEnvironment();
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Не указана";
        }
    }

}
