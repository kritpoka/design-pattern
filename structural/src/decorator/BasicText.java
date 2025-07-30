package decorator;

public class BasicText extends Text{
    private String data;

    public BasicText(String text){
        this.data = text;
    }

    @Override
    public void draw(){
        System.out.println(data);
    }
}
