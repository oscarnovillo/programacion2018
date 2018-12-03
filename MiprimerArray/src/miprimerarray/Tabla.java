/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerarray;

/**
 *
 * @author oscar
 */
public class Tabla {

  public static void main(String[] args) {

    int[][] tabla = new int[5][3];

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
	tabla[i][j] = 1;
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
	System.out.print(tabla[j][i]+ " ");
      }
      System.out.println();
    }
    
    
  }
}
