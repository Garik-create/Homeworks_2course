package inheritance_hw3;

import java.util.Arrays;

public class Predator extends Mammal {
    private String sortOfMeal;

    public Predator(String animalName,
                    Integer age,
                    String livingEnvironment,
                    Integer speed,
                    String sortOfMeal) {
        super(animalName, age, livingEnvironment, speed);
        setSortOfMeal(sortOfMeal);
    }

    public void eat() {
        System.out.println("Выследить добычу, поймать и съесть.");
    }



    @Override
    public String toString() {
        return "Класс Predators, "+getAnimalName()+", возраст "+getBirthYear()+" лет, среда обитания - "+
                getLivingEnvironment()+", максимальная скорость передвижения "+getSpeed()+
                " км/ч, ест "+getSortOfMeal();
    }

    public String getSortOfMeal() {
        return sortOfMeal;
    }

    public void setSortOfMeal(String sortOfMeal) {
        if (sortOfMeal!=null && !sortOfMeal.isBlank()) {
            this.sortOfMeal = sortOfMeal;
        } else {
            this.sortOfMeal = "Мясо";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return getSortOfMeal().equals(predator.getSortOfMeal());
    }
    public static void addPredator(Predator[] predators, Predator predator) {
        for (int i = 0; i < predators.length; i++) {
            if (predators[i]!=null && !predators[i].equals(predator)) {
                int newLength = predators.length + 1;
                Arrays.copyOf(predators, newLength);
                predators[newLength - 1] = predator;
                System.out.println(predators[newLength-1]);
            }
        }
    }
}
