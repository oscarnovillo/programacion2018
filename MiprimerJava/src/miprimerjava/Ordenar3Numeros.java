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
public class Ordenar3Numeros {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("pon un numero: ");
    int numero = sc.nextInt();
    System.out.print("pon otro numero: ");
    int numero2 = sc.nextInt();
    System.out.print("pon otro numero: ");
    int numero3 = sc.nextInt();

    if ((numero >= numero2) && (numero >= numero3)) {
      if (numero2 > numero3) {
	System.out.println(numero + " > " + numero2 + " > " + numero3);
      } else {
	System.out.println(numero + " > " + numero3 + " > " + numero2);
      }
    } else if ((numero2 >= numero) && (numero2 >= numero3)) {
      if (numero >= numero3) {
	System.out.println(numero2 + " > " + numero + " > " + numero3);
      } else {
	System.out.println(numero2 + " > " + numero3 + " > " + numero);
      }
    } else if ((numero3 >= numero) && (numero3 >= numero2)) {
      if (numero >= numero2) {
	System.out.println(numero3 + " > " + numero + " > " + numero2);
      } else {
	System.out.println(numero3 + " > " + numero2 + " > " + numero);
      }
    }

  }

}
