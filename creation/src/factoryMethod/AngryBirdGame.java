package factoryMethod;

public class AngryBirdGame extends BirdGame {
    protected Bird createBird() {
        return new AngryBird();
    }
}
