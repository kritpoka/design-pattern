package factoryMethod;

abstract public class BirdGame {
    public void setup(){
        System.out.println("BirdGame setup");

        Bird bird1 = createBird();
        Bird bird2 = createBird();

        bird1.fly();
        bird2.fly();

        System.out.println("game setup complete");
    }

    abstract protected Bird createBird();
}
