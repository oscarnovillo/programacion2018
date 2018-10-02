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
public class TablaDel5 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("pon la tabla de que numero: ");
    int numeroTabla = sc.nextInt();
    sc.nextLine();
    System.out.print("pon hasta que numero la tabla: ");
    int numeroHasta = sc.nextInt();
    sc.nextLine();
    int numero = 0;

    while (numero <= numeroHasta) {
      System.out.println(numeroTabla + " X " + numero
	      + " = " + (numero * numeroTabla));
      numero++;
    }
    
    for (int i=0; (i<=numeroHasta) 
	    ;i++)
    {
      System.out.println(numeroTabla + " X " + i
	      + " = " + (i * numeroTabla));
    }
    

  }

}
