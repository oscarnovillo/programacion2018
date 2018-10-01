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
public class NotasSwitch {

  public static void main(String[] args) {
    // Pedir numero
    Scanner sc = new Scanner(System.in);

    System.out.print("pon tu nota: ");
    int nota = sc.nextInt();
    // esto se come el \n que deja el numero
    sc.nextLine();
    
    System.out.println("pon tu nombre");
    String nombre = sc.nextLine();
    
    String mensaje = null;

    switch (nota) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
	mensaje = "suspenso";
	break;
      case 5:
      case 6:
	mensaje = "suspenso";
	break;

      default:
	mensaje = "no valida";
    }

    System.out.println(nombre + " tu nota es " + mensaje);

    /*
    String sNota = "SOBRESALIENTE";
    switch (sNota) {
      case "SOBRESALIENTE":
	System.out.println("tienes un 9 o 10");
	break;
      case "NOTABLE":
	System.out.println("suspenso");
	break;

    }
     */
  }
}
