/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author oscar
 */
public class Mazo {

  private Carta[] cartas;
  private int indiceEncima;

  public Mazo(int tamaño) {
    this.cartas = new Carta[tamaño];
    indiceEncima = -1;
  }

  public void barajar()
  {
    Random r = new Random();
    for (int i=0; i<1000;i++)
    {
      int carta = r.nextInt(40);
      int carta2 = r.nextInt(40);
      Carta tmp = cartas[carta];
      cartas[carta]=cartas[carta2];
      cartas[carta2] = tmp;
    }

  }
	  
  
  public int verValorUltimaCarta() {
    Carta c = null;
    int valor = 0;
    if (indiceEncima > -1) {
      valor = cartas[indiceEncima].getValor();
    }
    return valor;
  }
  
  
  public Carta verUltimaCarta() {
    Carta c = null;
    if (indiceEncima > -1) {
      c = cartas[indiceEncima];
    }
    return c;
  }

  public Carta sacarCarta() {
    Carta c = null;
    if (indiceEncima > -1) {
      c = cartas[indiceEncima];
      cartas[indiceEncima] = null;
      indiceEncima --;
    }
    return c;
  }

  public void ponerCarta(Carta carta) {
    
    indiceEncima++;
    cartas[indiceEncima] = carta;
    
  
  }

}
