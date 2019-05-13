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
public class Prestable {
  
  private String tejuelo;
  private String titulo;

  public Prestable(String tejuelo, String titulo) {
    this.tejuelo = tejuelo;
    this.titulo = titulo;
  }

  public Prestable() {
      
  }
  
  

  
  
  
  public void prestar(){
    
  }
  
  
  public String getTejuelo() {
    return tejuelo;
  }

  public void setTejuelo(String tejuelo) {
    this.tejuelo = tejuelo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  @Override
  public String toString() {
    return "Prestable{" + "tejuelo=" + tejuelo + ", titulo=" + titulo + '}';
  }
  
  
  
}
