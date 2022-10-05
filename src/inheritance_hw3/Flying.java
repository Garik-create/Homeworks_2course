package inheritance_hw3;

import java.time.LocalDate;

public class Flying extends Birds {
    String sortOfMotion;

    public Flying(String animalName, Integer age, String livingEnvironment, String sortOfMotion) {
        super(animalName, age, livingEnvironment);
        setSortOfMotion(sortOfMotion);
    }

    public void go() {
        System.out.println("Go fly!");
    }

    @Override
    public String toString() {
        return "Класс Flying, "+getAnimalName()+", возраст "+getBirthYear()+" лет, среда обитания - "+
                getLivingEnvironment()+", "+getSortOfMotion();
    }

    public String getSortOfMotion() {
        return sortOfMotion;
    }

    public void setSortOfMotion(String sortOfMotion) {
        if (sortOfMotion!=null && !sortOfMotion.isBlank()) {
            this.sortOfMotion = sortOfMotion;
        } else {
            this.sortOfMotion = "Летание";
        }
    }
}
