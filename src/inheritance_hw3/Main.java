package inheritance_hw3;

public class Main {
    public static void main(String[] args) {

//        Herbivores[] herbivores = new Herbivores[0];
        Herbivores gazelle = new Herbivores("Газель", 1, "Саванна", 50,
                "Траву");
        Herbivores giraffe = new Herbivores("Жираф", 2, "Саванна", 30,
                "Листья");
        Herbivores horse = new Herbivores("Лошадь", 3, "Степь", 60,
                "Сено");

        Predators hyena = new Predators("Гиена", 1, "Саванна",
                40, "Падаль");
        Predators tiger = new Predators("Тигр", 2, "Саванна",
                50, "Мясо");
        Predators bear = new Predators("Медведь", 3, "Лес", 60,
                "Рыбу");

        Amphibians frog = new Amphibians("Лягушка", 1, "Вода");
        Amphibians snake = new Amphibians("Уж пресноводный", 1, "Лес");

        NotFlying peacock = new NotFlying("Павлин", 2, "Тропики",
                "Ходит");
        NotFlying penguin = new NotFlying("Пингвин", 3, "Антарктика",
                "Ходит");
        NotFlying dodoBird = new NotFlying("Птица Додо", 4, "Тропики",
                "Прыгает");

        Flying gull = new Flying("Чайка", 2, "Побережье",
                "Летает");
        Flying albatross = new Flying("Альбатрос", 3, "Побережье",
                "Летает");
        Flying falcon = new Flying("Сокол", 5, "Степь", "Летает");

        System.out.println();
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println();
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println();
        System.out.println(frog);
        System.out.println(snake);
        System.out.println();
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println();
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
    }



    /*public static void addHerbivores(Herbivores[] herbivores) {
        for (int i = 0; i < herbivores.length; i++) {
            if (herbivores[i] == null) {
                herbivores[i] = new Herbivores()
            }
        }
    }*/
}

