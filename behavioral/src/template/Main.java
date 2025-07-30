package template;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Report report = new SimpleReport();

        for(int i=0; i<10; i++){
            list.add(i);
        }

        report.printReport(list);
    }
}
