package factoryMethod;

public class HappyBirdGame extends BirdGame {
    protected Bird createBird() {
        return new HappyBird();
    }
}
