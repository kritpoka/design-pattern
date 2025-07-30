package composition;

import java.util.ArrayList;
import java.util.List;

public class Compound extends Substance{
    private List<Substance> containing = new ArrayList<>();

    @Override
    public int getWeight() {
        int total = 0;
        for(Substance substance : containing){
            total += substance.getWeight();
        }

        return total;
    }

    public void addItem(Substance substance){
        containing.add(substance);
    }
}
