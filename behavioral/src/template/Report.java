package template;

import java.util.List;

public abstract class Report {
    public void printReport(List<Integer> list){
        printHeader();
        for(int data : list){
            printData(data);
        }
        printFooter();
    }

    abstract public void printHeader();
    abstract public void printData(int data);
    abstract public void printFooter();
}
