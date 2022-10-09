package inheritance_hw3;

import java.util.Arrays;

public class Flying extends Bird {
    private String sortOfMotion;

    public Flying(String animalName, Integer age, String livingEnvironment, String sortOfMotion) {
        super(animalName, age, livingEnvironment);
        setSortOfMotion(sortOfMotion);
    }

    @Override
    public void eat() {
        System.out.println("Поймать рыбку, или мышку.");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return getSortOfMotion().equals(flying.getSortOfMotion());
    }

    public static void addFlying(Flying[] flyings, Flying flying) {
        for (int i = 0; i < flyings.length; i++) {
            if (flyings[i]!=null && !flyings[i].equals(flying)) {
                int newLength = flyings.length + 1;
                Arrays.copyOf(flyings, newLength);
                flyings[newLength - 1] = flying;
                System.out.println(flyings[newLength-1]);
            }
        }
    }
}
