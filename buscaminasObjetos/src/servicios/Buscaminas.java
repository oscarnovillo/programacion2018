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
  
  
  
  private Tablero t;
  
  
  public Buscaminas(int dimX,int dimY,int nMinas){
    
    t = new Tablero(dimX,dimY);

    // ponemos las minas;
    Random r = new Random();
    r= new Random();
    for (int i = 0; i < nMinas; i++) {
      int x;
      int y;
      do {
	x = r.nextInt(dimX);
	y = r.nextInt(dimY);
      } while (t.getTablero()[x][y].getValor() == -1);
      t.getTablero()[x][y].setValor(-1);
    }
    
    for (int i = 0; i < t.getDimensionX(); i++) {
      for (int j = 0; j < t.getDimensionY(); j++) {
	if (t.getTablero()[i][j].getValor() != -1) {
	  int numMinas = 0;
	  for (int x = i - 1; x <= i + 1; x++) {
	    for (int y = j - 1; y <= j + 1; y++) {
	      if (!(x == i && y == j)) {
		if (x >= 0 && x < t.getTablero()[i].length
			&& y >= 0 && y < t.getTablero()[i].length
			//			&& (x != i && y != j)
			&& t.getTablero()[x][y].getValor() == -1) {
		  numMinas++;
		}
	      }
	    }
	  }

	  t.getTablero()[i][j].setValor(numMinas);
	}

      }
    }
    
  }
  
  public void pincharCelda(int x, int y)
  {
    if (t.getTablero()[x][y].getValor() == 0) {
      mirarCelda(x, y);
    } else {
      t.getTablero()[x][y].setVisible(true);
    }
  }
  
  public int getDimensionX()
  {
    return t.getTablero()[0].length;
  }
  public int getDimensionY()
  {
    return t.getTablero().length;
  }
  
 public  void imprimirTablero() {
   
	 
    for (int i = 0; i < t.getTablero().length; i++) {
      System.out.println("");
      for (int j = 0; j < t.getTablero()[i].length; j++) {
	if (!t.getTablero()[i][j].isVisible()) {
	  System.out.printf("%3s", "-");
	} else {
	  System.out.printf("%3d", t.getTablero()[i][j].getValor());
	}
      }
    }
    System.out.println("");
  }
  
  public  void imprimirDebugTablero() {
    for (int i = 0; i < t.getTablero().length; i++) {
      System.out.println("");
      for (int j = 0; j < t.getTablero()[i].length; j++) {

	System.out.printf("%3d", t.getTablero()[i][j].getValor());

      }
    }
    System.out.println("");
  }
  
  
   private void mirarCelda(int x, int y) {

    t.getTablero()[x][y].setVisible(true);

    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
	// si no es la misma celda
	if (!(i == x && j == y)) {
	  // si no se sale del t.getTablero()
	  if (i >= 0 && i < t.getTablero()[x].length
		  && j >= 0 && j < t.getTablero()[y].length) {
	    //si no es 0
	    if (t.getTablero()[i][j].getValor() > 0) {
	      t.getTablero()[i][j].setVisible(true);
	    } else if (t.getTablero()[i][j].getValor() == 0
		    && !t.getTablero()[i][j].isVisible()) {
	      mirarCelda(i, j);
	    }
	  }
	}
      }
    }
  }
}
