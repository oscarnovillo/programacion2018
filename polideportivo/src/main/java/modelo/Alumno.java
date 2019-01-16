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
public class Alumno {
  
  private String nombre;
  
  private Actividad[] actividades;

  public Alumno(String nombre) {
    this.nombre = nombre;
    this.actividades = new Actividad[11];
  }

  

  
  public void addActividad(Actividad a)
  {
    
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  
  
}
