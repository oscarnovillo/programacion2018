/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class ArrayNumeros {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    
    int array[] = new int[numero];
    int array2[] = {numero, 2, 3, 4};

    for (int i = 0; i < array.length; i++) {
      array[i] = 1;
    }

    array[1] = numero;

    
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {

      if (i > 0) {
	System.out.print(",");
      }
      System.out.print(array[i]);

    }
    System.out.println(")");

  }

}
