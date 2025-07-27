package facade;

public class SoundSystem {
    public void on(){
        System.out.println("Sound On");
    }

    public void setVolume(int level){
        System.out.println("Volume set to " + level);
    }
}
