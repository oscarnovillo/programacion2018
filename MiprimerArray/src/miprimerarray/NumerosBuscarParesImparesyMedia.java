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
public class NumerosBuscarParesImparesyMedia {

  public static void main(String[] args) {
    int cantidad;
    Scanner sc = new Scanner(System.in);
    System.out.print("Cuantos numero:");
    cantidad = sc.nextInt();

    int numeros[] = new int[cantidad];
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Pon un numero:");
      numeros[i] = sc.nextInt();
    }

    int contador[] = new int[2];
    int nPar = 0, nImpar = 0;
    double media = 0;

    for (int i = 0; i < numeros.length; i++) {
      if ((numeros[i] % 2) == 0) {
	contador[0]++;
      } else {
	contador[1]++;
      }
      media += numeros[i];
    }
    media /= numeros.length;
    System.out.println("la media es " + media);
    System.out.println("numero de pares"+contador[0]);
    System.out.println("numero de impares"+contador[1]);
  }

}
