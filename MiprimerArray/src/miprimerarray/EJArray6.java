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
 * @author dam1
 */
public class EJArray6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int array[] = new int[12];
    int array2[] = new int[12];
    int array3[] = new int[24];

    rellenaRandomArray(array, 10);
    rellenaRandomArray(array2, 100);

    imprimirArray(array);
    imprimirArray(array2);
    
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
	array3[j + i * 6] = array[j + i * 3];
	array3[j + 3 + i * 6] = array2[j + i * 3];
      }
    }

    for (int i = 0; i < 24; i += 3) {
      for (int j = 0; j < 3; j++) {
	if ((i % 2) == 0) {
	  array3[i + j] = array[((i / 6) * 3) + j];
	} else {
	  array3[i + j] = array2[((i / 6) * 3) + j];
	}
      }
    }
    imprimirArray(array3);
  }

  public static void rellenaRandomArray(int array[],int maximo){
     Random r = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = r.nextInt(maximo);
    }
  }
  
  public static void imprimirArray(int array[]) {
    System.out.println("");
    System.out.print("(");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length-1) {
	System.out.print(" - ");
      }
    }
    System.out.println(")");
  }
}
