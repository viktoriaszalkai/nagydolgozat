package modell;

import java.util.UUID;

public class Jarmu {
    private String szin;
    private UUID ID;
    private Tulajdonos tulajdonos;

    public Jarmu(String szin, UUID ID, Tulajdonos tulajdonos) {
        this.szin = szin;
        this.ID = ID;
        this.tulajdonos = tulajdonos;
    }

    public String getSzin() {
        return szin;
    }

    public UUID getID() {
        return ID;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }
}
