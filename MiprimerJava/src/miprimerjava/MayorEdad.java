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
public class MayorEdad {

  public static void main(String[] args) {
    // Pedir numero
    Scanner sc = new Scanner(System.in);

    System.out.print("pon tu edad: ");
    int edad = sc.nextInt();

    // comprobar si es par
    if (edad >= 18) {
      System.out.println("Eres mayor");
    } else {
      System.out.println("pa lka cuna");
    }

    //sacar resultado
  }
}
