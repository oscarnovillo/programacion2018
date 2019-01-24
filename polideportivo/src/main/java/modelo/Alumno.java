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
  private String apellido;
  private Actividad[] actividades;
  private int nActividades;

  public Alumno(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.nActividades = 0;
    this.actividades = new Actividad[11];
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public boolean addActividad(Actividad a) {
    boolean ok = true;
    if (nActividades < 11) {
      this.actividades[nActividades] = a;
      nActividades++;
    } else {
      ok = false;
    }

    return ok;
  }

  public double calcularRecibo() {
    double recibo = 0;
    for (int i = 0; i < nActividades; i++) {
      recibo += this.actividades[i].getCoste();
    }
    return recibo;
  }

  public boolean desmatricularDeTodasActividades() {
    boolean ok = true;

    // poner a null todas y 
    // desmatricular de las actividades
    for (int i = 0; i < nActividades; i++) {
      this.actividades[i].darBajaAlumno(this);
      this.actividades[i] = null;
    }

    return ok;

  }

  @Override
  public String toString() {
    return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
  }

}
