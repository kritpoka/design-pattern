package abstractFactory;

public class WindowFactory implements GUIFactory{
    public Button createButton(){
        return new WindowButton();
    }

    public Checkbox createCheckbox(){
        return new WindowCheckbox();
    }
}
