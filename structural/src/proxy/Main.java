package proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("me.jpg");

        image.display();
        image.display();
    }
}
