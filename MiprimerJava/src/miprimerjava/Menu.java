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
public class Menu {

  public static void main(String[] args) {
    // Pedir numero
    Scanner sc = new Scanner(System.in);
    int opcion;
    do {
      System.out.println(
	      "1. problema que clacula los numeros de la primitiva\n"
	      + "2. suma 20 numeros y los resta para que de 0\n"
	      + "3. para salir\n"
	      + "que opcion quieres????");
      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
	case 1:
	  primitiva(sc);
	  break;
	case 2:
	  suma20(sc);
	  break;
      }

    } while (opcion != 3);

  }

  public static void primitiva(Scanner sc) {

    System.out.print("pon tu nota: ");
    int nota = sc.nextInt();

    // comprobar si es par
    if ((nota >= 5) && (nota < 7)) {
      System.out.println("SUFICIENTE");
    } else if ((nota >= 7) && (nota < 9)) {
      System.out.println("NOTA");
    } else if ((nota >= 9) && (nota <= 10)) {
      System.out.println("SOBRE");
    } else if ((nota < 5) && (nota >= 0)) {
      System.out.println("SUSPENSO");
    } else if ((nota > 10) || (nota < 0)) {
      System.out.println("nota no valida");
    }

    //sacar resultado
    if ((nota > 10) || (nota < 0)) {
      System.out.println("nota no valida");
    } else if (nota >= 9) {
      System.out.println("SOBRE");
    } else if (nota >= 7) {
      System.out.println("NOTA");
    } else if (nota >= 5) {
      System.out.println("SUFICIENTE");
    } else if (nota < 5) {
      System.out.println("SUSPENSO");
    }

  }

  public static void suma20(Scanner sc) {

    
    int i;
   
    
    for (i=0;i<4;i++){}
    
  }
}
