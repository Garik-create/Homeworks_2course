package inheritance_hw3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Herbivore[] herbivores = new Herbivore[0];
        Herbivore gazelle = new Herbivore("Газель", 1, "Саванна", 50,
                "Траву");
        Herbivore giraffe = new Herbivore("Жираф", 2, "Саванна", 30,
                "Листья");
        Herbivore horse = new Herbivore("Лошадь", 3, "Степь", 60,
                "Сено");

        System.out.println();
        Herbivore.addHerbivore(herbivores,gazelle);
        Herbivore.addHerbivore(herbivores,giraffe);
        Herbivore.addHerbivore(herbivores,horse);

        Predator[] predators = new Predator[0];
        Predator hyena = new Predator("Гиена", 1, "Саванна",
                40, "Падаль");
        Predator tiger = new Predator("Тигр", 2, "Саванна",
                50, "Мясо");
        Predator bear = new Predator("Медведь", 3, "Лес", 60,
                "Рыбу");
        System.out.println();
        Predator.addPredator(predators,hyena);
        Predator.addPredator(predators,tiger);
        Predator.addPredator(predators,bear);


        Amphibian[] amphibians = new Amphibian[0];
        Amphibian frog = new Amphibian("Лягушка", 1, "Вода");
        Amphibian snake = new Amphibian("Уж пресноводный", 1, "Лес");

        System.out.println();
        Amphibian.addAmphibian(amphibians,frog);
        Amphibian.addAmphibian(amphibians,snake);


        NotFlying[] notFlyings = new NotFlying[0];
        NotFlying peacock = new NotFlying("Павлин", 2, "Тропики",
                "Ходит");
        NotFlying penguin = new NotFlying("Пингвин", 3, "Антарктика",
                "Ходит");
        NotFlying dodoBird = new NotFlying("Птица Додо", 4, "Тропики",
                "Прыгает");

        System.out.println();
        NotFlying.addNotFlying(notFlyings,peacock);
        NotFlying.addNotFlying(notFlyings,penguin);
        NotFlying.addNotFlying(notFlyings,dodoBird);


        Flying[] flyings = new Flying[0];
        Flying gull = new Flying("Чайка", 2, "Побережье",
                "Летает");
        Flying albatross = new Flying("Альбатрос", 3, "Побережье",
                "Летает");
        Flying falcon = new Flying("Сокол", 5, "Степь", "Летает");

        System.out.println();
        Flying.addFlying(flyings,gull);
        Flying.addFlying(flyings,albatross);
        Flying.addFlying(flyings,falcon);
    }



//    public static void addHerbivore(Herbivore[] herbivores, Herbivore herbivore) {
//        for (int i = 0; i < herbivores.length; i++) {
//            if (herbivores[i]!=null && !herbivores[i].equals(herbivore)) {
//                int newLength = herbivores.length + 1;
//                Arrays.copyOf(herbivores, newLength);
//                herbivores[newLength - 1] = herbivore;
//            }
//        }
//    }
}

