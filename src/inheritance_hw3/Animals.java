package inheritance_hw3;

import java.time.LocalDate;

public class Animals {
    private final String animalName;
    private final Integer birthYear;

    public Animals(String animalName, Integer age) {

        if (animalName != null && !animalName.isBlank()) {
            this.animalName = animalName;
        } else {
            this.animalName = "Animal";
        }

        if (age != null && age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else if (age < 0) {
            this.birthYear = LocalDate.now().getYear() + age;
        } else {
            this.birthYear = LocalDate.now().getYear();
        }
    }

    public void eat() {

    }

    public void sleep() {

    }

    public void go() {

    }
    public String getAnimalName() {
        return animalName;
    }

    public int getBirthYear() {
        return LocalDate.now().getYear() - birthYear;
    }

}
