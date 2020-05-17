package com.company;

        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @Test
    void getQuantity() {
        Drink testObj = new Drink("сок ананасовый", 200, 30);
        String quantity = "200 мл.";
        assertEquals(testObj.getQuantity(), quantity);
    }

    @Test
    void getType() {
        Drink testObj = new Drink("сок ананасовый", 200, 30);
        String type = "напиток";
        assertEquals(testObj.getType(), type);
    }
}