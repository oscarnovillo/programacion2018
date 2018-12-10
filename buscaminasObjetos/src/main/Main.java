/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import java.util.Scanner;
import modelo.Celda;
import servicios.Buscaminas;

/**
 *
 * @author oscar
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
//    Buscaminas buscaminas = new Buscaminas();
//    buscaminas.mostrarTablero();
    // while acabe o piche mina.

    // pedir coordenada para pinchar
    // o coordenada para posible mina
    //mostrar tablero
    //fin de juego.
    // aqui a lo cutre
    Celda[][] tablero;
    
    int dimX = 8;
    int dimY = 8;
    int nMinas = 10;

    tablero = new Celda[dimX][dimY];
    

    // ponemos las minas;
    Random r = new Random();
    for (int i = 0; i < nMinas; i++) {
      int x;
      int y;
      do {
	x = r.nextInt(dimX);
	y = r.nextInt(dimY);
      } while (tablero[x][y].getValor() == -1);
      tablero[x][y].setValor(-1);
    }
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
	if (tablero[i][j].getValor() != -1) {
	  int numMinas = 0;
	  for (int x = i - 1; x <= i + 1; x++) {
	    for (int y = j - 1; y <= j + 1; y++) {
	      if (!(x == i && y == j)) {
		if (x >= 0 && x < tablero[i].length
			&& y >= 0 && y < tablero[i].length
			//			&& (x != i && y != j)
			&& tablero[x][y].getValor() == -1) {
		  numMinas++;
		}
	      }
	    }
	  }

	  tablero[i][j].setValor(numMinas);
	}

      }
    }
    imprimirDebugTablero(tablero);

    // voy a dar a celda
    System.out.println(" numeros");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if (tablero[x][y].getValor() == 0) {
      mirarCelda(x, y, tablero);
    } else {
      tablero[x][y].setVisible(true); 
    }
    imprimirTablero(tablero);

  }

  public static void imprimirDebugTablero(Celda[][] tablero) {
    for (int i = 0; i < tablero.length; i++) {
      System.out.println("");
      for (int j = 0; j < tablero[i].length; j++) {

	System.out.printf("%3d", tablero[i][j].getValor());

      }
    }
    System.out.println("");
  }

  public static void imprimirTablero(Celda[][] tablero) {
    for (int i = 0; i < tablero.length; i++) {
      System.out.println("");
      for (int j = 0; j < tablero[i].length; j++) {
	if (!tablero[i][j].isVisible()) {
	  System.out.printf("%3s", "-");
	} else {
	  System.out.printf("%3d", tablero[i][j].getValor());
	}
      }
    }
    System.out.println("");
  }

  public static void mirarCelda(int x, int y, Celda[][] tablero) {

    tablero[x][y].setVisible(true);

    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
	// si no es la misma celda
	if (!(i == x && j == y)) {
	  // si no se sale del tablero
	  if (i >= 0 && i < tablero[x].length
		  && j >= 0 && j < tablero[y].length) {
	    //si no es 0
	    if (tablero[i][j].getValor() > 0) {
	      tablero[i][j].setVisible(true);
	    } else if (tablero[i][j].getValor() == 0 
		    && !tablero[i][j].isVisible() ) {
	      mirarCelda(i, j, tablero);
	    }
	  }
	}
      }
    }
  }

}
