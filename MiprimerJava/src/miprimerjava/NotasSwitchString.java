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
public class NotasSwitchString {

  public static void main(String[] args) {
    // Pedir numero
    Scanner sc = new Scanner(System.in);
    double media = 0;
    String nombre = null;

    System.out.print("pon tu nombre");

    nombre = sc.nextLine();
    
    for (int i = 0; i < 3; i++) {
      int iNota = 0;
      System.out.print("pon tu nota "+ (i+1) +": ");
      String nota = sc.nextLine();

      switch (nota.toUpperCase()) {
	case "SUSPENSO":
	  iNota = 3;
	  break;
	case "APROBADO":
	  iNota = 5;
	  break;
	case "NOTABLE":
	  iNota = 7;
	  break;
	case "SOBRESALIENTE":
	  iNota = 10;
	  break;
	default:
	  iNota = -1;
      }
      System.out.println(nombre + " tu nota es " + iNota);
      media = media + iNota;
    }

    media = media / 3.0;
    System.out.println(nombre + " tu nota media es "
	    + media);

  }
}
