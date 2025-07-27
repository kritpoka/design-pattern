package proxy;

public class ProxyImage implements Image {
    private final String fileName;
    private RealImage realImage;

    public ProxyImage(String filename){
        this.fileName = filename;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
