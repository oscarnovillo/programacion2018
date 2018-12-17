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
public class Tablero {

  private Celda [][]celdas;
  
  private int dimX;

  public Tablero(int dimX, int dimY)
  {
    this.dimX = dimX;
    celdas = new Celda[dimX][dimY];
    
    crearCeldas();
  }
  
  private void crearCeldas()
  {
    for (int i = 0; i < this.getDimensionX(); i++) {
      for (int j = 0; j < this.getDimensionY(); j++) {
	celdas[i][j] = new Celda();
      }
    }
  }
  
  public int getDimensionX()
  {
    return celdas[0].length;
  }
  public int getDimensionY()
  {
    return celdas.length;
  }

  public Celda[][] getCeldas() {
    return celdas;
  }

  public void setCeldas(Celda[][] celdas) {
    this.celdas = celdas;
  }
  

 
  
  
  
  
}
