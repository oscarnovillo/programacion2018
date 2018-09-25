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
public class ParImpar {

    public static void main(String[] args) {
        // Pedir numero
        Scanner sc = new Scanner(System.in);

        System.out.print("pon un numero: ");
        int numero = sc.nextInt();

        // comprobar si es par
        if ((numero % 2) != 0) {
            int n = 1;
            System.out.println("impar");
        } else {
            System.out.println("par");
        }

        //sacar resultado
    }

}
