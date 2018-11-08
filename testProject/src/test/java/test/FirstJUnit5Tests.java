package test;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

@DisplayName("A special test case")
public class FirstJUnit5Tests {

    @Test
    @DisplayName("mi primera prueba")
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
	assertAll("nombre" ,
	() -> assertTrue(true));
	
    }

}
