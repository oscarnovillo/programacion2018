/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import java.util.Scanner;
import servicios.Buscaminas;
import modelo.Celda;
import modelo.Tablero;

/**
 *
 * @author oscar
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
//    Buscaminas buscaminas = new Buscaminas();
//    buscaminas.mostrarTablero();
    // while acabe o piche mina.

    
    
    
    
    // pedir coordenada para pinchar
    // o coordenada para posible mina
    //mostrar tablero
    //fin de juego.
    // aqui a lo cutre
    

    int dimX = 8;
    int dimY = 8;
    int nMinas = 10;
    Buscaminas buscaminas = new Buscaminas(dimX,dimY,nMinas);

    buscaminas.imprimirDebugTablero();

    // voy a dar a celda
    System.out.println(" numeros");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    buscaminas.pincharCelda(x, y);
    
    buscaminas.imprimirTablero();

  }

 

  

 

}
