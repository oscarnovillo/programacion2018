package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Main.MainMap;
import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 *
 * @author oscar
 */
@DisplayName ("hgol")
@Tag ("special")
public class NewEmptyJUnitTest1 {
    
    public NewEmptyJUnitTest1() {

    }
    

    // TODO add test methods here. The name must begin with 'test'. For example:
    @Test
    public void hello() {
    
       MainMap.main(null);
       assertTrue(1> 0);
    
    }
}
