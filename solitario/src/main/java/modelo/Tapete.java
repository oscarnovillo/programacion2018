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
public class Tapete {

  private Mazo baraja;
  private Mazo mano;
  private Mazo espadas;
  private Mazo copas;
  private Mazo oros;
  private Mazo bastos;

  public Tapete() {
    baraja = new Mazo(40);
    mano = new Mazo(40);
    espadas = new Mazo(10);
    copas = new Mazo(10);
    oros = new Mazo(10);
    bastos = new Mazo(10);

    for (int palo = 1; palo <= 4; palo++) {
      for (int valor = 1; valor <= 10; valor++) {
	Carta c = new Carta(valor, palo);
	baraja.ponerCarta(c);
      }
    }
    
    baraja.barajar();
  }

  public Mazo getBaraja() {
    return baraja;
  }

  public Mazo getMano() {
    return mano;
  }

  public Mazo getEspadas() {
    return espadas;
  }

  public Mazo getCopas() {
    return copas;
  }

  public Mazo getOros() {
    return oros;
  }

  public Mazo getBastos() {
    return bastos;
  }

}
