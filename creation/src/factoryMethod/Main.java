package factoryMethod;

public class Main {
    public static void main(String[] args) {
        BirdGame birdGame;

        birdGame = new HappyBirdGame();

        birdGame.setup();
    }
}
