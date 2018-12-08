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

  // bomba valor = -1;  
  private int valor;
  private boolean visible;
  private boolean marcado;

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public boolean isVisible() {
    return visible;
  }

  public void setVisible(boolean visible) {
    this.visible = visible;
  }

  public boolean isMarcado() {
    return marcado;
  }

  public void setMarcado(boolean marcado) {
    this.marcado = marcado;
  }

  
  
}
