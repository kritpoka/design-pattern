package iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");

        displayData(list.iterator());

        System.out.println("------------");

        HashSet<String> set = new HashSet<>();
        set.add("orange");
        set.add("Apple");
        displayData(set.iterator());
    }

    public static void displayData(Iterator<String> itr){
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
