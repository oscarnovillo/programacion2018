/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author oscar
 */
public class Main {
  
  public static void main(String[] args) {
    
    Vehiculo vm = new Coche();
    
    if (vm instanceof Probable)
    {
      ((Probable)vm).probar(100);
      ((Coche)vm).probar(100);
    }

  }
  
}
