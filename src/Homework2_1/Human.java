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
            this.birthdayDate = 0;
        }
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }

        if (livingPlace != null) {
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

//    Human(int birthdayDate, String livingPlace, String job) {
//        this(birthdayDate, "Информация не указана", livingPlace, job);
//    }

//    Human (int birthdayDate, String name, String job) {
//        this(birthdayDate, name, "Информация не указана", job);
//    }

//    Human(int birthdayDate, String name, String livingPlace) {
//        this(birthdayDate, name, livingPlace,"Информация не указана");
//    }


    void printIntroduce() {
        System.out.printf(
                "\nПривет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!",
                name, livingPlace, birthdayDate, job);
    }
}

