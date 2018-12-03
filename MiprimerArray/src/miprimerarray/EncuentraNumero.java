/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class EncuentraNumero {

  public static void main(String[] args) {

    int cantidad = 10;
    Random r = new Random();

    int numeros[] = new int[cantidad];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = r.nextInt(40);
      System.out.print(" " + numeros[i] + " ");
    }

    int numeroEncontrar = 3;
    boolean encontrado = false;
    System.out.println("");
    for (int i = 0; (i < numeros.length) && !encontrado; i++) {
      if (numeros[i] == numeroEncontrar) {
	encontrado = true;
      }
    }

    if (encontrado) {
      System.out.println("encontrado");
    } else {
      System.out.println("no encontrado");
    }

  }

}
