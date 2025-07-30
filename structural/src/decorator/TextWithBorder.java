package decorator;

public class TextWithBorder extends Text{
    private Text text;

    public TextWithBorder(Text text){
        this.text = text;
    }

    @Override
    public void draw(){
        System.out.println("-----------------");
        text.draw();
        System.out.println("-----------------");
    }
}
