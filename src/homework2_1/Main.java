package homework2_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная", "", "Holland", 35.59, 10);
        Flower chrizantem = new Flower("Хризантема", " ", "    ", 15, 5);
        Flower phion = new Flower("Пион", null, "England", 69.9, 1);
        Flower hipsophill = new Flower("Гипсофила", "", "Turkish", 19.5, 10);

        int roses = 3;
        int chrizantems = 5;
        int phions = 0;
        int hipsophills = 1;

        System.out.println();
        System.out.println("Задание 2");
        rose.printFlowers();
        chrizantem.printFlowers();
        phion.printFlowers();
        hipsophill.printFlowers();

        System.out.printf("Стоимость букета составит: %.2f рублей.\n",countBucketCost(roses, chrizantems, phions,
                hipsophills, rose.getCost(), chrizantem.getCost(), phion.getCost(), hipsophill.getCost()));

        int[] flowers = new int[]{roses, chrizantems, phions, hipsophills};

        int[] lifeSpan = new int[]{rose.lifeSpan, chrizantem.lifeSpan, phion.lifeSpan, hipsophill.lifeSpan};

        System.out.printf("Срок стояния букета составит %d дней.\n", findMinLifeSpan(lifeSpan));


        System.out.println();
        System.out.println("Задание 1");

        Human maxim = new Human(-1987, null, "Минск", "бренд-менеджер");
        Human anna = new Human(-1993, "Аня", null, "методист образовательных программ");
        Human kate = new Human(-1994, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(-1995, "Артём", "Москва", null);
        Human vladimir = new Human(LocalDate.now().getYear() - 21, "Владимир",
                "Казань", "Безработный");


        maxim.printIntroduce();
        anna.printIntroduce();
        kate.printIntroduce();
        artem.printIntroduce();
        vladimir.printIntroduce();

    }

    private static double countBucketCost(int roseAmount,
                                        int chrizantemAmount,
                                        int phionAmount,
                                        int hipsophillAmount,
                                        double roseCost,
                                        double chrizantemCost,
                                        double phionCost,
                                        double hipsophillCost)
    {
        return (roseAmount * roseCost + chrizantemAmount * chrizantemCost + phionAmount * phionCost +
                hipsophillAmount * hipsophillCost) * 1.1;


    }

//    private static float countBucketCost2()

    private static int findMinLifeSpan(int[] lifeSpan) {
        int minLifeSpan = lifeSpan[0];
        for (int value : lifeSpan) {
            if (value < minLifeSpan) {
                minLifeSpan = value;
            }
        }
        return minLifeSpan;
    }
}
