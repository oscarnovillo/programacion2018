/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author oscar
 */
public class Alumno {

  private String nombre;
  private String apellido;
  private ArrayList<Actividad> actividades;

  public Alumno(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.actividades = new ArrayList<>();
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
    boolean ok;
    if (!this.actividades.contains(a)) {
      ok = this.actividades.add(a);
    } else {
      ok = false;
    }
    return ok;
  }

  public double calcularRecibo() {
    double recibo = 0;
    for (int i = 0; i < this.actividades.size(); i++) {
      recibo += this.actividades.get(i).getCoste();
    }

    for (Actividad a : this.actividades) {
      recibo += a.getCoste();
    }

    return recibo;
  }

  public boolean desmatricularDeTodasActividades() {
    boolean ok = true;

    // poner a null todas y 
    // desmatricular de las actividades
    for (Actividad a : this.actividades) {
      a.darBajaAlumno(this);
    }

    return ok;

  }

  @Override
  public String toString() {
    return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 79 * hash + Objects.hashCode(this.nombre);
    hash = 79 * hash + Objects.hashCode(this.apellido);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Alumno other = (Alumno) obj;
    if (!Objects.equals(this.nombre, other.nombre)) {
      return false;
    }
    if (!Objects.equals(this.apellido, other.apellido)) {
      return false;
    }
    return true;
  }

}
