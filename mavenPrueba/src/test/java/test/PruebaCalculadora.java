package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import calculadora.Calculadora;

/**
 *
 * @author oscar
 */
@DisplayName("A special test case")
public class PruebaCalculadora {

  // TODO add test methods here.
  // The methods must be annotated with annotation @Test. For example:
  //
  @Test
  public void hello() {
    Calculadora c = new Calculadora();
    assertEquals(2, c.suma(1, 1));

  }

}
