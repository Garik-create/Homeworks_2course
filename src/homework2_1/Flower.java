package homework2_1;

public class Flower {
    String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);

        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            System.out.println("Введите целоче число!");
        }
    }

    public void printFlowers() {
        System.out.printf(" %s, страна: %s, стоимость: %.2f рублей, срок стояния: %d дней.\n", name, country,
                cost, lifeSpan);

    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isBlank()) {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

//    @Override
//    public String toString() {
//        return name + ", страна: " + country + ", стоимость: " + cost +
//                " рублей, срок стояния: " + lifeSpan + " дней";
//    }
}


