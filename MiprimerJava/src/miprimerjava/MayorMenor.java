/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjava;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class MayorMenor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("pon un numero: ");
    int numero = sc.nextInt();
    System.out.print("pon otro numero: ");
    int numero2 = sc.nextInt();

    if (numero > numero2) {
      System.out.println("el numero " + numero 
	      + " es mayor que "+numero2);
    } else if (numero < numero2) {
      System.out.println("el numero " + numero2 
	      + " es mayor que "+numero);
    } else {
      System.out.println("el numero iguales");
    }
  }

}
