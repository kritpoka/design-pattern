package facade;

public class HomeTheaterFacade {
    DVDPlayer dvd;
    Projector projector;
    SoundSystem sound;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvd = dvdPlayer;
        this.projector = projector;
        this.sound = soundSystem;
    }

    public void watchMovie(){
        projector.on();
        sound.on();
        sound.setVolume(20);
        dvd.on();
        dvd.play();
    }
}
