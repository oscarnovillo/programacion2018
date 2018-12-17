/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Random;
import modelo.Tablero;

/**
 *
 * @author oscar
 */
public class Buscaminas {
  
  
  
  private Tablero tablero;
  
  
  public Buscaminas(int dimX,int dimY,int nMinas){
    
    tablero = new Tablero(dimX,dimY);

    // ponemos las minas;
    Random r = new Random();
    r= new Random();
    for (int i = 0; i < nMinas; i++) {
      int x;
      int y;
      do {
	x = r.nextInt(dimX);
	y = r.nextInt(dimY);
      } while (tablero.getCeldas()[x][y].getValor() == -1);
      tablero.getCeldas()[x][y].setValor(-1);
    }
    
    for (int i = 0; i < tablero.getDimensionX(); i++) {
      for (int j = 0; j < tablero.getDimensionY(); j++) {
	if (tablero.getCeldas()[i][j].getValor() != -1) {
	  int numMinas = 0;
	  for (int x = i - 1; x <= i + 1; x++) {
	    for (int y = j - 1; y <= j + 1; y++) {
	      if (!(x == i && y == j)) {
		if (x >= 0 && x < tablero.getCeldas()[i].length
			&& y >= 0 && y < tablero.getCeldas()[i].length
			//			&& (x != i && y != j)
			&& tablero.getCeldas()[x][y].getValor() == -1) {
		  numMinas++;
		}
	      }
	    }
	  }

	  tablero.getCeldas()[i][j].setValor(numMinas);
	}

      }
    }
    
  }
  
  public void pincharCelda(int x, int y)
  {
    if (tablero.getCeldas()[x][y].getValor() == 0) {
      mirarCelda(x, y);
    } else {
      tablero.getCeldas()[x][y].setVisible(true);
    }
  }
  
  public int getDimensionX()
  {
    return tablero.getCeldas()[0].length;
  }
  public int getDimensionY()
  {
    return tablero.getCeldas().length;
  }
  
 public  void imprimirTablero() {
   
	 
    for (int i = 0; i < tablero.getCeldas().length; i++) {
      System.out.println("");
      for (int j = 0; j < tablero.getCeldas()[i].length; j++) {
	if (!tablero.getCeldas()[i][j].isVisible()) {
	  System.out.printf("%3s", "-");
	} else {
	  System.out.printf("%3d", tablero.getCeldas()[i][j].getValor());
	}
      }
    }
    System.out.println("");
  }
  
  public  void imprimirDebugTablero() {
    for (int i = 0; i < tablero.getCeldas().length; i++) {
      System.out.println("");
      for (int j = 0; j < tablero.getCeldas()[i].length; j++) {

	System.out.printf("%3d", tablero.getCeldas()[i][j].getValor());

      }
    }
    System.out.println("");
  }
  
  
   private void mirarCelda(int x, int y) {

    tablero.getCeldas()[x][y].setVisible(true);

    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
	// si no es la misma celda
	if (!(i == x && j == y)) {
	  // si no se sale del t.getCeldas()
	  if (i >= 0 && i < tablero.getCeldas()[x].length
		  && j >= 0 && j < tablero.getCeldas()[y].length) {
	    //si no es 0
	    if (tablero.getCeldas()[i][j].getValor() > 0) {
	      tablero.getCeldas()[i][j].setVisible(true);
	    } else if (tablero.getCeldas()[i][j].getValor() == 0
		    && !tablero.getCeldas()[i][j].isVisible()) {
	      mirarCelda(i, j);
	    }
	  }
	}
      }
    }
  }
}
