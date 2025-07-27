package facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                new DVDPlayer(),
                new Projector(),
                new SoundSystem()
        );

        homeTheaterFacade.watchMovie();
    }
}
