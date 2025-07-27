package abstractFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        factory = new MacFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}
