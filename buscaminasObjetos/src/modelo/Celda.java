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
public class Celda {

  // bomba valor = 0;  
  private int valor;
  private boolean tapado;
  private boolean marcado;

  public Celda()
  {
    tapado = true;
  }
  
  
  public boolean esBomba() {

    return false;
  }

  public int getValor() {
    return 0;
  }

  public String imprimir() {
    String devolver = null;
    if (tapado) {
      devolver = "-";
    } else if (marcado) {
      devolver = "M";
    } else {
      if (valor == 0) {
	devolver = "B";
      } else {
	devolver = valor + "";
      }
    }

    return devolver;
  }

}
