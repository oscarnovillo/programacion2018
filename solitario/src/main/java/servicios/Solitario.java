/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import modelo.Carta;
import modelo.Mazo;
import modelo.Tapete;

/**
 *
 * @author oscar
 */
public class Solitario {

  
  public void jugar() {
    Tapete tapete = new Tapete();
    boolean seguir = true;
    boolean cartaManoColocada = false;
    boolean cartaBarajaColocada = false;
    Carta cartaTemporal;
    Carta cartaTemporalPalo;
    do {
      System.out.println(" Cartas nuevas ");
      // coger dos cartas
      cartaTemporal = tapete.getBaraja().sacarCarta();
      tapete.getMano().ponerCarta(cartaTemporal);
      System.out.print(cartaTemporal+" ");
      cartaTemporal = tapete.getBaraja().sacarCarta();
      if (cartaTemporal != null) {
	tapete.getMano().ponerCarta(cartaTemporal);
        System.out.print(cartaTemporal);
      }

      
      
      //mirar si se puede colocar
      do {
	cartaManoColocada = false;
	cartaTemporal = tapete.getMano().verUltimaCarta();
	if (cartaTemporal != null) {
	  switch (cartaTemporal.getPalo()) {
	    case 1:
	      cartaManoColocada = colocarCarta(cartaTemporal, tapete, tapete.getOros());
	      break;
	    case 2:
	      cartaManoColocada = colocarCarta(cartaTemporal, tapete, tapete.getCopas());
	      break;
	    case 3:
	      cartaManoColocada = colocarCarta(cartaTemporal, tapete, tapete.getEspadas());
	      break;
	    case 4:
	      cartaManoColocada = colocarCarta(cartaTemporal, tapete, tapete.getBastos());
	      break;
	  }
	  if (!cartaBarajaColocada) {
	    cartaBarajaColocada = cartaManoColocada;
	  }
	  if (cartaManoColocada)
	    System.out.println("carta colocada "+cartaTemporal);
	}
      } while (cartaManoColocada);

      Scanner sc = new Scanner(System.in);
      sc.nextLine();
      // ganar
      if (tapete.getBastos().verValorUltimaCarta() == 10
	      && tapete.getOros().verValorUltimaCarta() == 10
	      && tapete.getEspadas().verValorUltimaCarta() == 10
	      && tapete.getCopas().verValorUltimaCarta() == 10) {
	seguir = false;
	System.out.println(" has ganado");
      }

      //perder
      else if (tapete.getBaraja().verUltimaCarta() == null) {
	if (cartaBarajaColocada == false) {
	  System.out.println("has perdido");
	  seguir = false;
	} else {
	  while (tapete.getMano().verUltimaCarta() != null) {
	    cartaTemporal = tapete.getMano().sacarCarta();
	    tapete.getBaraja().ponerCarta(cartaTemporal);
	  }
	}
      }

    } while (seguir);

  }

  private boolean colocarCarta(Carta cartaTemporal, Tapete tapete, Mazo palo) {
    boolean cartaColocada = false;
    int valorUltimaCarta = palo.verValorUltimaCarta();
    if (valorUltimaCarta
	    == cartaTemporal.getValor() - 1) {
      cartaColocada = true;
      cartaTemporal = tapete.getMano().sacarCarta();
      palo.ponerCarta(cartaTemporal);
    }
    return cartaColocada;
  }

}
