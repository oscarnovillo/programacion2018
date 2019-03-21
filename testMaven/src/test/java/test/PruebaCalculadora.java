/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;



/**
 *
 * @author oscar
 */
@DisplayName("me llamo juan")
public class PruebaCalculadora {
  Calculadora c ;
  
  @BeforeEach
  void cargarCalculadora()
  {
    c = new Calculadora();
  }
  
  @Test
  @DisplayName(" hola")
  public void pruebaSuma()
  {
    
    int resultado = c.suma(8,8);
    assertEquals(16,resultado);
//    assertAll(
//    		() -> {
//    			int r = c.suma(8,8);
//    			assertEquals(6,r)},
//    		() -> assertEquals(6,resultado)
//    		)
//    ;
   
    resultado = c.suma(-1, -5);
    assertEquals(-1,resultado);
 /*   resultado = c.suma(5, -1);
    assertEquals(-1,resultado);
    resultado = c.suma(-5, -1);
    assertEquals(-1,resultado);*/
  }
  

  @Test
  public void pruebaResta()
  {
    
    int resultado = c.resta(8,8);
    assertEquals(0,resultado);
    
  }
  
}
