package homework2_1;

public class Human {
    private int birthdayDate;
    String name;
    private String livingPlace;
    String job;
    Human(int birthdayDate, String name, String livingPlace, String job) {
        this.birthdayDate = this.setBirthdayDate(birthdayDate);
        if (name!=null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }

        this.livingPlace = this.setLivingPlace(livingPlace);

        if (job != null) {
            this.job = job;
        } else {
            this.job = "Информация не указана";
        }
    }

    public int getBirthdayDate() {
        return birthdayDate;
    }

    public int setBirthdayDate(int birthdayDate) {
        if (birthdayDate != 0 && birthdayDate >= 0) {
            this.birthdayDate = birthdayDate;
        } else {
            this.birthdayDate = 0;
        }
        return this.birthdayDate;
    }

    public String getLivingPlace() {
        return livingPlace;
    }

    public String setLivingPlace(String livingPlace) {
        if (livingPlace!=null && !livingPlace.isBlank()) {
            this.livingPlace = livingPlace;
        } else {
            this.livingPlace = "Информация не указана";
        }
        return livingPlace;
    }

    void printIntroduce() {
        System.out.println(
                "Привет! Меня зовут " +name+". Я из города "+livingPlace+" Я родился "+birthdayDate+" году. Я работаю на должности "+job+". Будем знакомы!" );
    }

}

