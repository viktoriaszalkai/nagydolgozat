package modell;

import java.text.Collator;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class Auto extends Jarmu implements Comparable<Auto> , Cloneable{
    private  String rendszam;
    private int ferohely, ar;

    public Auto(String szin, UUID ID, Tulajdonos tulajdonos, String rendszam, int ferohely, int ar) {
        super(szin, ID, tulajdonos);
        this.rendszam = rendszam;
        this.ferohely = ferohely;
        this.ar = ar;
        rovidRendszam();
    }

    public void rovidRendszam(){
        if(this.getRendszam().length() < 6){
            throw new NemLetezoAutoException("túl rövid a rendszám");
        }
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getFerohely() {
        return ferohely;
    }

    public int getAr() {
        return ar;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return ferohely == auto.ferohely && Objects.equals(rendszam, auto.rendszam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rendszam, ferohely);
    }



    @Override
    public int compareTo(Auto o) {
        return this.rendszam.compareTo(o.rendszam);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // uj id
        return super.clone();
    }
    //

}
