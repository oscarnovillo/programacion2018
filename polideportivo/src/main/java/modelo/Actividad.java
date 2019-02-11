/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class Actividad {

  private String tipo;
  private String dias;
  private String horario;
  private int plazas;
  private double coste;
  private ArrayList<Alumno> alumnos;

  public Actividad(String tipo, String dias, String horario, int plazas, double coste) {
    this.tipo = tipo;
    this.dias = dias;
    this.horario = horario;
    this.plazas = plazas;
    this.coste = coste;

    this.alumnos = new ArrayList<>();
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getDias() {
    return dias;
  }

  public void setDias(String dias) {
    this.dias = dias;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public int getPlazas() {
    return plazas;
  }

  public void setPlazas(int plazas) {
    this.plazas = plazas;
  }

  public double getCoste() {
    return coste;
  }

  public void setCoste(double coste) {
    this.coste = coste;
  }

  public int getPlazasOcupadas() {
    return this.alumnos.size();
  }

  public boolean darAltaAlumno(Alumno a) {
    boolean ok = true;

    if (this.alumnos.contains(a)) {
      System.out.println("alumno ya existe");
    } else {
      if (this.alumnos.size() < plazas) {
	this.alumnos.add(a);
      } else {
	ok = false;
      }
    }

    return ok;
  }

  public boolean darBajaAlumno(Alumno a) {
    boolean ok = false;
    if (this.alumnos.isEmpty()) {
      ok = this.alumnos.remove(a);
    }
    return ok;
  }

  @Override
  public String toString() {
    return "Actividad{" + "tipo=" + tipo + ", dias=" + dias + ", horario=" + horario + ", coste=" + coste + ", plazasOcupadas=" + this.alumnos.size() + '}';
  }

}
