package adaptor;

public class Main {
    public static void main(String[] args) {
        USSocket ussocket = new USSocket();
        EuropeSocket adaptor = new SocketAdaptor(ussocket);

        adaptor.connect();
    }
}
