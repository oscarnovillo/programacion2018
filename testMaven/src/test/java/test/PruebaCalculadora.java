/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import calculadora.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author oscar
 */
public class PruebaCalculadora {
  
  @Test
  public void pruebaSuma()
  {
    Calculadora c = new Calculadora();
    int resultado = c.suma(8,8);
    assertEquals(16,resultado);
    assertNotEquals(-16,resultado);
  }
  
  @Test
  public void pruebaResta()
  {
    Calculadora c = new Calculadora();
    int resultado = c.suma(8,8);
    assertEquals(0,resultado);
    
  }
  
}