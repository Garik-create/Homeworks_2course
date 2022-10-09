package inheritance_hw3;

import java.time.LocalDate;

public abstract class Animal {
    private final String animalName;
    private final Integer birthYear;

    public Animal(String animalName, Integer age) {

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

    public abstract void eat();

    public void sleep() {
        System.out.println("Закрыть глаза");
    }

    public abstract void go();
    public String getAnimalName() {
        return animalName;
    }

    public Integer getBirthYear() {
        return LocalDate.now().getYear() - birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getAnimalName().equals(animal.getAnimalName()) && getBirthYear().equals(animal.getBirthYear());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
