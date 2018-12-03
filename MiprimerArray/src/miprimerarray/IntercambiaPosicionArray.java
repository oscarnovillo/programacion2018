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
public class IntercambiaPosicionArray {
  
  public static void main(String[] args) {
    int cantidad  =10;
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    int numeros[] = new int[cantidad];
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = r.nextInt(20);
      System.out.print(" "+numeros[i]+" ");
    }
    
    int swap;
    
    swap = numeros[0];
    numeros[0] = numeros[1];
    numeros[1] = swap;
    
    System.out.println("");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(" "+numeros[i]+" ");
    }
  }
  
}
