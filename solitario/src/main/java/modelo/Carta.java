/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author oscar
 */
public class Carta {

  private final int valor;
  private final int palo;

  
  
  public Carta(int valor, int palo) {
    this.valor = valor;
    this.palo = palo;
  }

  public int getValor() {
    return valor;
  }

  public int getPalo() {
    return palo;
  }

  @Override
  public String toString() {
    return " el " + valor + " de " + palo + " ";
  }

}
