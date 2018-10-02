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
public class NumerosHasta100omenos1 {

  public static void main(String[] args) {
    // pedir numeros hasta que sumen 100 y decir cuantos numeros he pedido
    Scanner sc = new Scanner(System.in);
    int suma = 0;
    int veces = 0;
    int numero = 0;

    while ((suma < 100) && (numero != -1)) {
      System.out.print("pon un numero: ");
      numero = sc.nextInt();
      suma += numero; // suma = suma + numero;
      veces++; // veces = veces + 1;
    }
    if (numero == -1) {
      System.out.println("acabo por -1");
    } else {
      System.out.println("la suma ya es cien con " + veces + " numeros");
    }

  }

}
