/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerjava;

/**
 *
 * @author oscar
 */
public class MiprimerJava {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        final int SIDES_HEXAGONO = 6;
        final char SALTO_LINEA = '\n';
        int x = 9;
        double a = 5.7;
        x = (int) a;
        x++;
        x = x + 1;

        boolean siono = true;
        boolean no = false;
        boolean valorBool = x > 9;
        char caracter = 'a';
        caracter = SALTO_LINEA;
        int[] array = new int[10];
        array = new int[10];
        x += 5;
        x = x + 360 / SIDES_HEXAGONO;
        x = (x > 5) ? x + 3 : x - 3;
        if (x > 5) {
            if (caracter == 'p') {
                x = x + 3;
            }
        } else if (x < 5) {

        } else {
            x = x - 3;
        }

// ahora voy a poner una linea que hace el hola mundo
// T code application logic here
// despoues de hacer pool
        System.out.print("hola" + x + 1 + " me " + " gusta la fiesta");
        System.out.println(x);
    }

}
