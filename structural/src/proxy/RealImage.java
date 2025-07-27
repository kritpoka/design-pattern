package proxy;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Loading image...");
    }

    public void display() {
        System.out.println("displaying " + fileName);
    }
}
