package modell;

import java.text.Collator;
import java.util.Comparator;

public class FerohelyComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto o1, Auto o2) {
        Collator c = Collator.getInstance();

        return c.compare(o1.getFerohely(),o2.getFerohely());

    }
}
