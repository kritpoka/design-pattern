package composition;

public class Element extends Substance{
    private int weight;

    public Element(int weight){
        this.weight = weight;
    }

    @Override
    public int getWeight(){
        return weight;
    }
}
