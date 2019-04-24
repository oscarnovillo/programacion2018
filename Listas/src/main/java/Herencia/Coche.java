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
public class Coche extends VehiculoMotor implements Probable{

  @Override
  public void lavar() {
    super.lavar();
    addCoste(3);
  }

  @Override
  public void probar(int km) {
    this.setKm(this.getKm()+km);
    addCoste(-1);
  }
  
  
  
  
}
