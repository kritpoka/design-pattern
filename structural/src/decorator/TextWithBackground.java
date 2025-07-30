package decorator;

public class TextWithBackground extends Text{
    private Text text;

    public TextWithBackground(Text text){
        this.text = text;
    }

    @Override
    public void draw(){
        text.draw();
        System.out.println("....add background....");
    }
}
