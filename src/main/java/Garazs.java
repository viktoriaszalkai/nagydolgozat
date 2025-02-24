import modell.Auto;
import modell.Jarmu;
import modell.Tulajdonos;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Garazs implements Iterable, Serializable {
    private int ferohely;
    private ArrayList<Jarmu> jarmuLista;

    public Garazs(int ferohely, ArrayList<Jarmu> jarmuLista) {
        if(ferohely <= 5){
            this.ferohely = ferohely;
        }else {
            throw new RuntimeException("A férőhely max 5");
        }

        this.jarmuLista = new ArrayList<Jarmu>(ferohely);
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public void kiall(int ferohely) {
        this.ferohely = ferohely-1;
    }
    public void beall(int ferohely) {
        this.ferohely = ferohely+1;
    }

    public int getFerohely() {
        return ferohely;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private void szerializalas(){
        try(ObjectOutputStream objKi = new ObjectOutputStream(FileOutputStream("garazs.ser"))) {
            objKi.writeObject(Garazs g = new Garazs(5,garazs));
        }
    }

}
