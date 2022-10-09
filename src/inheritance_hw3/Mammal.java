package inheritance_hw3;

public abstract class Mammal extends Animal {
    private String livingEnvironment;
    private Integer speed;

    public Mammal(String animalName, Integer age, String livingEnvironment, Integer speed) {
        super(animalName, age);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);

    }

    @Override
    public void eat() {
        System.out.println("Найти пищу и поесть.");
    }



    @Override
    public void go() {
        System.out.println("Go for a walk!");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Не указана";
        }
    }

    public void setSpeed(Integer speed) {
        if (speed != null && speed >= 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return getLivingEnvironment().equals(mammal.getLivingEnvironment())
                && getSpeed().equals(mammal.getSpeed());
    }
}
