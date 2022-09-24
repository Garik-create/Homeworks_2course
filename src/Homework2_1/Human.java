package Homework2_1;

public class Human {
    int birthdayDate;
    String name;
    String livingPlace;
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

    void printIntroduce() {
        System.out.println(
                "Привет! Меня зовут " +name+". Я из города "+livingPlace+" Я родился "+birthdayDate+" году. Я работаю на должности "+job+". Будем знакомы!" );
    }

}

