package test;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import com.mycompany.testproject.SieteyMedia;
import java.io.ByteArrayInputStream;

@DisplayName("A special test case")
public class FirstJUnit5Tests {

    @Test
    @DisplayName("mi primera prueba")
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
	assertAll("nombkkkre" ,
	() -> assertTrue(false));
	
    }
    
   @Test
   public void main()
   {
	   ByteArrayInputStream in = new ByteArrayInputStream("2\n".getBytes());
	   System.setIn(in);
	   
	   SieteyMedia.main(null);
	   
   }

}
