/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import modelo.Tablero;

/**
 *
 * @author oscar
 */
public class Buscaminas {

  private Tablero tablero;

  public Buscaminas() {
    tablero = new Tablero();
  }

  public void iniciarTablero() {

  }

  public boolean pincharTablero() {

    return true;
  }

  public void mostrarTablero() {
    // coger Celdas e imprimirlas.
    for (int i = 0;
	    i < tablero.getDimensionX(); i++) {
      System.out.println("");
      for (int j = 0;
	      j < tablero.getDimensionY(); j++) {
	//System.out.print(
		//tablero.getCelda(i, j).imprimir());
      }
    }

  }

  public void posibleMina() {

  }

}
