package modell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    @Test
    public void hibasRendszam(){
        Auto a1 = new Auto("barna", UUID.randomUUID(), new Tulajdonos("béla"), "asdef",5,10000);
        Assertions.assertThrows(NemLetezoAutoException));
    }


}