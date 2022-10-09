package inheritance_hw3;

public abstract class Bird extends Animal {
    private String livingEnvironment;

    public Bird(String animalName, Integer age, String livingEnvironment) {
        super(animalName, age);
        setLivingEnvironment(livingEnvironment);
    }

    public abstract void eat();



    @Override
    public void go() {

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
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
        Bird bird = (Bird) o;
        return getLivingEnvironment().equals(bird.getLivingEnvironment());
    }
}
