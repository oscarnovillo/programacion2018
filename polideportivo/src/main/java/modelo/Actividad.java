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
public class Actividad {

  private String tipo;
  private String dias;
  private String horario;
  private int plazas;
  private double coste;
  private Alumno[] alumnos;
  private int plazasOcupadas;

  public Actividad(String tipo, String dias, String horario, int plazas, double coste) {
    this.tipo = tipo;
    this.dias = dias;
    this.horario = horario;
    this.plazas = plazas;
    this.coste = coste;
    this.plazasOcupadas = 0;
    this.alumnos = new Alumno[plazas];
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
    return plazasOcupadas;
  }

  public boolean darAltaAlumno(Alumno a) {
    boolean ok = true;
    
    if (plazasOcupadas < plazas)
    {
      this.alumnos[plazasOcupadas] = a;
      plazasOcupadas ++;
    }
    else
      ok = false;
    

    return ok;
  }

  public boolean darBajaAlumno(Alumno a) {
    boolean ok = false;
    if (plazasOcupadas > 0)
    {
      // buscarle
      for (int i=0; i<plazasOcupadas && !ok; i++)
      {
	if (this.alumnos[i].getNombre().equals(a.getNombre()) &&
	this.alumnos[i].getApellido().equals(a.getApellido()))
	{  
	  this.alumnos[i] = this.alumnos[plazasOcupadas-1];
	  this.alumnos[plazasOcupadas-1] = null;
	  plazasOcupadas--;
	  ok = true;
	}
      }
    }
    
    

    return ok;
  }

  @Override
  public String toString() {
    return "Actividad{" + "tipo=" + tipo + ", dias=" + dias + ", horario=" + horario + ", coste=" + coste + ", plazasOcupadas=" + plazasOcupadas + '}';
  }

}
