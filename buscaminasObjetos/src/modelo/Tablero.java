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
  
  public Celda [][]tablero;
  
  
  public Tablero(){
    tablero = new Celda[8][8];
    for (int i = 0;
	    i < 8; i++) {
      for (int j = 0; 
	      j < 8; j++) {
	tablero[i][j] = new Celda();
      }
    }
    
  }
  
  public int getDimensionX()
  {
    return tablero[0].length;
  }
  public int getDimensionY()
  {
    return tablero.length;
  }
  
  public Celda getCelda(int x, int y)
  {
    return tablero[x][y];
  }
  
  
  
}
