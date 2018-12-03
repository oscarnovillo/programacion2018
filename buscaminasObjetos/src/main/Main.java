/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
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
    int[][] tablero;
    int dimX = 8;
    int dimY = 8;
    int nMinas = 10;

    tablero = new int[dimX][dimY];

    // ponemos las minas;
    Random r = new Random();
    for (int i = 0; i < nMinas; i++) {
      int x;
      int y;
      do {
	x = r.nextInt(dimX);
	y = r.nextInt(dimY);
      } while (tablero[x][y] == -1);
      tablero[x][y] = -1;
    }
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
	if (tablero[i][j] != -1) {
	  int numMinas = 0;
	  for (int x = i - 1; x <= i + 1; x++) {
	    for (int y = j - 1; y <= j + 1; y++) {
	      if (!(x == i && y == j)) {
		if (x >= 0 && x < tablero[i].length
			&& y >= 0 && y < tablero[i].length
			//			&& (x != i && y != j)
			&& tablero[x][y] == -1) {
		  numMinas++;
		}
	      }
	    }
	  }

//	  if  ( (i-1 >=0 && j+1 <tablero[i].length)
//	     && (tablero[i - 1][j + 1] == -1)) {
//	    numMinas++;
//	  }
//	  if ( (j+1 <tablero[i].length)
//	     && (tablero[i][j + 1] == -1) )  {
//	    numMinas++;
//	  }
//	  if ( (i+1 <tablero[i].length) && (j+1 <tablero[i].length)
//	     && tablero[i + 1][j + 1] == -1) {
//	    numMinas++;
//	  }
//	  if (i-1 >=0 && j-1>=0 && tablero[i - 1][j - 1] == -1) {
//	    numMinas++;
//	  }
//	  if (j-1>=0 && tablero[i][j - 1] == -1) {
//	    numMinas++;
//	  }
//	  if ((i+1 <tablero[i].length) && j-1>=0 &&  tablero[i + 1][j - 1] == -1) {
//	    numMinas++;
//	  }
//	  if (i-1 >=0 && tablero[i - 1][j] == -1) {
//	    numMinas++;
//	  }
////	if (tablero[i][j]==-1)
////	  numMinas++;
//	  if ((i+1 <tablero[i].length) && tablero[i + 1][j] == -1) {
//	    numMinas++;
//	  }
	  tablero[i][j] = numMinas;
	}

      }
    }
    imprimirTablero(tablero);

  }

  public static void imprimirTablero(int[][] tablero) {
    for (int i = 0; i < tablero.length; i++) {
      System.out.println("");
      for (int j = 0; j < tablero[i].length; j++) {
	if (i > 4) {
	  System.out.printf("%3s", "-");
	} else {
	  System.out.printf("%3d", tablero[i][j]);
	}
      }
    }
  }

}
