package inheritance_hw3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Herbivore extends Mammal {
    private String sortOfMeal;

    public Herbivore(String animalName,
                     Integer age,
                     String livingEnvironment,
                     Integer speed,
                     String sortOfMeal) {
        super(animalName, age, livingEnvironment, speed);
        this.sortOfMeal = sortOfMeal;
//        int count++;
    }

    @Override
    public void eat() {
        System.out.println("Выйти на луг, пощипать травку.");
    }



    @Override
    public void go() {
        System.out.println("Поскакали.");;

    }

    public static void addHerbivore(Herbivore[] herbivores, Herbivore herbivore) {
        for (int i = 0; i < herbivores.length; i++) {
            if (herbivores[i]!=null && !herbivores[i].equals(herbivore)) {
                int newLength = herbivores.length + 1;
                Herbivore[] herbivores1 = Arrays.copyOf(herbivores, newLength);
                herbivores1[newLength - 1] = herbivore;
                System.out.println(herbivores1[newLength-1]);
            }
        }
    }

    @Override
    public String toString() {
        return "Класс Herbivores, "+getAnimalName()+", возраст "+getBirthYear()+" лет, среда обитания - "+
                getLivingEnvironment()+", максимальная скорость передвижения "+getSpeed()+
                " км/ч, ест "+getSortOfMeal();
    }

    public String getSortOfMeal() {
        return sortOfMeal;
    }

    public void setSortOfMeal(String sortOfMeal) {
        if (sortOfMeal != null && !sortOfMeal.isBlank()) {
            this.sortOfMeal = sortOfMeal;
        } else {
            this.sortOfMeal = "Травка";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return getSortOfMeal().equals(herbivore.getSortOfMeal());
    }
}
