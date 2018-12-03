/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class NumerodeUnosDosTres {

  public static void main(String[] args) {

    int veces[] = new int[3];
    for (int i = 0,j =veces.length-1
	    ; i < veces.length; 
	    i++,j--) {
      veces[i] = 0;
    }

    int numero;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Pon un numero:");
      numero = sc.nextInt();
      if ((numero < 4) && (numero >0)) {
	veces[numero - 1]++;
      }

    } while (numero != -1);

    for (int i = 0; i < veces.length; i++) {
      System.out.println(" numero de "+(i+1)+" = "+veces[i]);
    }

    
    
    
  }

}
