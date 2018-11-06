package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FirstJUnit5Tests {

    @Test
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

}
