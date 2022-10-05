package inheritance_hw3;

public class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String animalName, Integer age, String livingEnvironment) {
        super(animalName, age);
        setLivingEnvironment(livingEnvironment);
    }

    public void eat() {

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Не указана";
        }
    }
}
