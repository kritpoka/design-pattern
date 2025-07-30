package composition;

public class Main {
    public static void main(String[] args) {
        Element hydrogen = new Element(1);
        Element oxygen = new Element(16);
        Element carbon = new Element(12);

        Compound water = new Compound();
        water.addItem(hydrogen);
        water.addItem(hydrogen);
        water.addItem(oxygen);

        Compound co2 = new Compound();
        co2.addItem(carbon);
        co2.addItem(oxygen);
        co2.addItem(oxygen);

        Compound mixture = new Compound();
        mixture.addItem(water);
        mixture.addItem(co2);

        System.out.println("Water weight: " + water.getWeight()); // 18
        System.out.println("CO2 weight: " + co2.getWeight());     // 44
        System.out.println("Mixture weight: " + mixture.getWeight()); // 62
    }
}
