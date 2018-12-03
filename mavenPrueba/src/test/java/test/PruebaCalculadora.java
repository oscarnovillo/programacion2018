package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Calculadora;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author oscar
 */
@DisplayName("A special test case")
public class PruebaCalculadora {

  

  // TODO add test methods here.
  // The methods must be annotated with annotation @Test. For example:
  //
 @ParameterizedTest
  @CsvSource( {"1,1","2,2" })
  public void hello(int num,int num2) {
    Calculadora c = new Calculadora();
    assertEquals(num+num2, c.suma(num, num2));
  
  }
  
  
}
  