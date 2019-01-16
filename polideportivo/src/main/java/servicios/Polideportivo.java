/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import modelo.Alumno;

/**
 *
 * @author oscar
 */
public class Polideportivo {

  private Alumno[] alumnos;
  
  
  public Polideportivo() {
    this.alumnos = new Alumno[50];
    
    Alumno a = new Alumno("luismi");
    alumnos[0]= a;
    alumnos[1] = new Alumno("enrique");
    a = new Alumno("alberto");
    alumnos[2] = a;
    
    
  }
  
  
  public void darAltaAlumno()
  {
    // pedir el alumno
    
    // add al array
    
  }
  
  public void generarReciboAlumno()
  {
    // buscar alumno.
    
    //recorrer sus actividades
    
    
  }


  public void matricularAlumno()
  {
    // buscar alumno
    
    // buscar actividad
    
    // buscar horario
    
    //add alumno a actividad.
    
  }
  
  public void darBajaAlumno()
  {
    // busca Alumno
    
    // darle de baja en array de alumnos
    
    // darle de baja en todas las actividades del alumno.
  }
  
  public void generarReciboActividad()
  {
    // buscar actividad
    
    
    // multiplicar precio por plazas.
    
  }
  
  
  
  
  
}
