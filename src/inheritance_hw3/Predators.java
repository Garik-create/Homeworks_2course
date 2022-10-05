package inheritance_hw3;

public class Predators extends Mammals {
    String sortOfMeal;

    public Predators(String animalName,
                      Integer age,
                      String livingEnvironment,
                      Integer speed,
                      String sortOfMeal) {
        super(animalName, age, livingEnvironment, speed);
        setSortOfMeal(sortOfMeal);
    }

    public void eat() {
        System.out.println("Выследить добычу и съесть.");
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
}
