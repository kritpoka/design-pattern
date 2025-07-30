package template;

public class SimpleReport extends Report {
    @Override
    public void printHeader(){
        System.out.println("Jasmine Shop Price Report");
        System.out.println("Jasmine price");
    }

    @Override
    public void printData(int data){
        System.out.println(data);
    }

    @Override
    public void printFooter(){
        System.out.println("We value our customer");
    }
}
