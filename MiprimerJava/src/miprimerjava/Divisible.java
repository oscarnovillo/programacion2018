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
public class Divisible {
    public static void main(String[] args) {
        // Pedir numero
        Scanner sc = new Scanner(System.in);

        System.out.print("pon un numero: ");
        int numero = sc.nextInt();

	System.out.print("pon otro numero: ");
        int numero2 = sc.nextInt();
	
        // comprobar si es par
        if ((numero % numero2) != 0) {
      
            System.out.println("no divisibles");
        } else {
            System.out.println("divisibles");
        }

        //sacar resultado
    }

}
