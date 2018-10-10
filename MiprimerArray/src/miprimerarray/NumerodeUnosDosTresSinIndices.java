/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerarray;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class NumerodeUnosDosTresSinIndices {

  public static void main(String[] args) {
    int numero;
    Scanner sc = new Scanner(System.in);
    int veces[] = new int[10];
    for (int i = 0; i < veces.length; i++) {
      System.out.print("Pon un numero:");
      numero = sc.nextInt();
      veces[i] = numero;
    }

    int contador[] = new int[3];
    for (int i = 0; i < veces.length; i++) {

      if ((veces[i] >= 1) && (veces[i] <= 3)) {
	contador[veces[i] - 1]++;
      }
    }

  }

}
