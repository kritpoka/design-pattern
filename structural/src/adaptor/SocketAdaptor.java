package adaptor;

public class SocketAdaptor implements EuropeSocket{
    USSocket ussocket;

    public SocketAdaptor(USSocket ussocket) {
        this.ussocket = ussocket;
    }

    public void connect() {
        System.out.println("adapting voltage from 100v to 220v");
        ussocket.plugIn();
    }
}
