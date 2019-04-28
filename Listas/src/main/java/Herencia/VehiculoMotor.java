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
public abstract class VehiculoMotor extends Vehiculo {
  
  
  private int km;
  private String matricula;

  public int getKm() {
    return km;
  }

  public void setKm(int km) {
    this.km = km;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  @Override
  public void lavar() {
    addCoste(5);
  }
  
	  
}
