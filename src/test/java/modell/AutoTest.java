package modell;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    @Test
    public void hibasRendszam(){
        Auto a1 = new Auto("barna", UUID.randomUUID(),Tulajdonos t = new Tulajdonos("béla"), "asdef",5,10000);

    }



}