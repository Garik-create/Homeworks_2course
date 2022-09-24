package Homework2_1;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1987,"Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(1993,"Аня" ,"Москва", "методист образовательных программ");
        Human kate = new Human(1994, "Катя", "Калининград","продакт-менеджер");
        Human artem = new Human(1995, "Артём", "Москва","директор по развитию бизнеса");

        maxim.printIntroduce();
        anna.printIntroduce();
        kate.printIntroduce();
        artem.printIntroduce();

    }
}
