package inheritance_hw3;

import java.util.Arrays;

public class Amphibian extends Animal {
    private String livingEnvironment;

    public Amphibian(String animalName, Integer age, String livingEnvironment) {
        super(animalName, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public void eat() {
        System.out.println("Поймать насекомое и съесть.");
    }



    @Override
    public void go() {
        System.out.println("Погнали.");
    }

    @Override
    public String toString() {
        return "Класс Amphibians, "+getAnimalName()+", возраст "+getBirthYear()+" лет, среда обитания - "+
                getLivingEnvironment();
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Не указана";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return getLivingEnvironment().equals(amphibian.getLivingEnvironment());
    }

    public static void addAmphibian(Amphibian[] amphibians, Amphibian amphibian) {
        for (int i = 0; i < amphibians.length; i++) {
            if (amphibians[i]!=null && !amphibians[i].equals(amphibian)) {
                int newLength = amphibians.length + 1;
                Arrays.copyOf(amphibians, newLength);
                amphibians[newLength - 1] = amphibian;
                System.out.println(amphibians[newLength-1]);
            }
        }
    }
}
