/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author oscar
 */
public class Revista extends Prestable{

  @Override
  public String toString() {
    return "Revista{" + "coleccion=" + coleccion + '}';
  }
  
  private String coleccion;

  
  
  public String getColeccion() {
    return coleccion;
  }

  public void setColeccion(String coleccion) {
    this.coleccion = coleccion;
  }
}
