package inheritance_hw3;

public class Herbivores extends Mammals {
    String sortOfMeal;

    public Herbivores(String animalName,
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
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        super.go();
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
}
