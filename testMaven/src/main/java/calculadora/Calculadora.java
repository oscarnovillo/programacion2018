/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author oscar
 */
public class Calculadora {
  
  public int suma(int a, int b)
  {
    int resultado = a+b;

    if (a<0 || b<0)
      resultado = -1;
    else
      if (resultado <0)
	resultado = -1;
    
    return resultado;
  }
  
}
