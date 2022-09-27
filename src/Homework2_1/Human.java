package Homework2_1;

public class Human {
    private int birthdayDate;
    String name;
    private String livingPlace;
    String job;
    Human(int birthdayDate, String name, String livingPlace, String job) {
        if (birthdayDate >= 0) {
            this.birthdayDate = birthdayDate;
        } else {
            this.birthdayDate = Math.abs(birthdayDate);
        }
        if (name!=null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }

        if (livingPlace!=null) {
            this.livingPlace = livingPlace;
        } else {
            this.livingPlace = "Информация не указана";
        }
        if (job != null) {
            this.job = job;
        } else {
            this.job = "Информация не указана";
        }
    }

    public int getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(int birthdayDate) {
        if (birthdayDate != 0 && birthdayDate >= 0) {
            this.birthdayDate = birthdayDate;
        } else {
            this.birthdayDate = 0;
        }
    }

    public String getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(String livingPlace) {
        if (livingPlace!=null && !livingPlace.isEmpty() && !livingPlace.isBlank()) {
            this.livingPlace = livingPlace;
        } else {
            this.livingPlace = "Информация не указана";
        }
    }

    void printIntroduce() {
        System.out.println(
                "Привет! Меня зовут " +name+". Я из города "+livingPlace+" Я родился "+birthdayDate+" году. Я работаю на должности "+job+". Будем знакомы!" );
    }

}

