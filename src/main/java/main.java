import modell.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.UUID;

public class main {
        public static void main(String[] args) {
            ArrayList<Jarmu> garazslista = new ArrayList();
            Garazs g1 = new Garazs(5,garazslista);
            System.out.println(g1.getFerohely());
            g1.kiall(g1.getFerohely());
            System.out.println(g1.getFerohely());
            g1.beall(g1.getFerohely());
            System.out.println(g1.getFerohely());
            Tulajdonos t1 = new Tulajdonos("Béla");
            Tulajdonos t2 = new Tulajdonos("Anna");
            Tulajdonos t3 = new Tulajdonos("Adél");
            Tulajdonos t4 = new Tulajdonos("János");
            Tulajdonos t5 = new Tulajdonos("Jenő");
            garazslista.add(new Auto("sárga", UUID.randomUUID(), t1, "abcdef",5,1000000 ));
            garazslista.add(new Auto("piros", UUID.randomUUID(), t2, "aqsscg",5,1000000 ));
            garazslista.add(new Auto("sárga", UUID.randomUUID(), t3, "nhzxyv",4,1000000 ));
            garazslista.add(new Auto("fehér", UUID.randomUUID(), t4, "jvdzfd",8,1000000 ));
            garazslista.add(new Auto("kék", UUID.randomUUID(), t5, "bxcfhb",3,1000000 ));

//            garazslista.sort(ArComparator.compare());
//            garazslista.sort(FerohelyComparator.compare());
        }

}
