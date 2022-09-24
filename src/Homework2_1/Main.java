package Homework2_1;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(-1987, null,"Минск", "бренд-менеджер");
        Human anna = new Human(-1993,"Аня" ,null, "методист образовательных программ");
        Human kate = new Human(-1994,"Катя",  "Калининград","продакт-менеджер");
        Human artem = new Human(-1995, "Артём", "Москва",null);

        maxim.printIntroduce();
        anna.printIntroduce();
        kate.printIntroduce();
        artem.printIntroduce();

    }
}
