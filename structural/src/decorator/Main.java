package decorator;

public class Main {
    public static void main(String[] args) {
        Text text = new BasicText("Kasetsart");
        text.draw();

        Text background = new TextWithBackground(text);
        background.draw();

        Text border = new TextWithBorder(background);
        border.draw();
    }
}
