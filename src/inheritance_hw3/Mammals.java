package inheritance_hw3;

public class Mammals extends Animals {
    private String livingEnvironment;
    private Integer speed;

    public Mammals(String animalName, Integer age, String livingEnvironment, Integer speed) {
        super(animalName, age);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
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
}
