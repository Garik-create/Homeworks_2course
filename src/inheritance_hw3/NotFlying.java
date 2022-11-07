package inheritance_hw3;

import java.util.Arrays;

public class NotFlying extends Bird {

    private String sortOfMotion;

    public NotFlying(String animalName, Integer age, String livingEnvironment, String sortOfMotion) {
        super(animalName, age, livingEnvironment);
        setSortOfMotion(sortOfMotion);
    }

    @Override
    public void eat() {
        System.out.println("Поклевать семена, или поймать рыбку.");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NotFlying notFlying = (NotFlying) o;
        return getSortOfMotion().equals(notFlying.getSortOfMotion());
    }

    public static void addNotFlying(NotFlying[] notFlyings, NotFlying notFlying) {
        for (int i = 0; i < notFlyings.length; i++) {
            if (notFlyings[i]!=null && !notFlyings[i].equals(notFlying)) {
                int newLength = notFlyings.length + 1;
                Arrays.copyOf(notFlyings, newLength);
                notFlyings[newLength - 1] = notFlying;
                System.out.println(notFlyings[newLength-1]);
            }
        }
    }
}
