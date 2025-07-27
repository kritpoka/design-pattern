package singleton;

//create only one object
//another class can't instantiate single class
//start instantiate when need

public class Singleton {
    private static Singleton instance;
    private String name;

    private Singleton() {}

    //final can't override
    //static access by class
    public static final Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }

    //getter, setter method
}
