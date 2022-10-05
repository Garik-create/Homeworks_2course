package inheritance_hw3;

public class NotFlying extends Birds {

    String sortOfMotion;

    public NotFlying(String animalName, Integer age, String livingEnvironment, String sortOfMotion) {
        super(animalName, age, livingEnvironment);
        setSortOfMotion(sortOfMotion);
    }

    public void go() {
        System.out.println("Go for a walk!");
    }

    @Override
    public String toString() {
        return "Класс NotFlying, "+getAnimalName()+", возраст "+getBirthYear()+" лет, среда обитания - "+
                getLivingEnvironment()+", "+getSortOfMotion();
    }

    public String getSortOfMotion() {
        return sortOfMotion;
    }

    public void setSortOfMotion(String sortOfMotion) {
        if (sortOfMotion!=null && !sortOfMotion.isBlank()) {
            this.sortOfMotion = sortOfMotion;
        } else {
            this.sortOfMotion = "Хождение";
        }
    }
}
