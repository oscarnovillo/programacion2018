/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import modelo.Actividad;
import modelo.Alumno;

/**
 *
 * @author oscar
 */
public class Polideportivo {

  private Alumno[] alumnos;
  private Actividad[] actividades;
  private int numeroAlumnos;

  public Polideportivo() {
    this.alumnos = new Alumno[50];
    this.actividades = new Actividad[11];
    this.numeroAlumnos = 0;

    this.darAltaAlumno(new Alumno("pedro", "fernandez"));
    this.darAltaAlumno(new Alumno("juan", "globo"));

    actividades[0] = new Actividad("aerobic", "l,x,v", "10:10-11:00", 35, 47.60);
    actividades[1] = new Actividad("aerobic", "l,x,v", "11:10-12:00", 35, 47.60);
    actividades[2] = new Actividad("aerobic", "l,x,v", "19:10-20:00", 35, 47.60);
    actividades[3] = new Actividad("aerobic", "m,j", "09:10–10:00", 35, 35.70);
    actividades[4] = new Actividad("aerobic", "m,j", "10:10–11:00", 35, 35.70);
    actividades[5] = new Actividad("aerobic", "m,j", "18:10–19:00", 35, 35.70);
    actividades[6] = new Actividad("artes marciales", "l,x,v", "19:00–20:00", 15, 45.00);
    actividades[7] = new Actividad("artes marciales", "m,j", "18:00–19:00", 15, 34.00);
    actividades[8] = new Actividad("artes marciales", "m,j", "19:00–20:00", 15, 34.00);
    actividades[9] = new Actividad("natacion", "l,m,j", "18:10–19:00", 35, 47.60);
    actividades[10] = new Actividad("natacion", "m,j", "17:10–18:00", 35, 35.70);

  }

  public void darAltaAlumno() {
    // pedir el alumno
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre a dar de alta: ");
    String n = sc.nextLine();
    System.out.print("Apellido a dar de alta: ");
    String a = sc.nextLine();

    // add al array
    this.darAltaAlumno(new Alumno(n, a));
  }

  private void darAltaAlumno(Alumno a) {
    alumnos[numeroAlumnos] = a;
    numeroAlumnos++;
  }

  public void generarReciboAlumno() {
    // buscar alumno.
    Alumno alumno = buscarAlumno();
    //recorrer sus actividades
    System.out.println("el recibo de " + alumno + " es " + alumno.calcularRecibo());
  }

  public void matricularAlumno() {
    // buscar alumno
    Alumno alumno = buscarAlumno();
    Actividad actividad = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("1. buscar por nombre\n2. buscar por actividad");
    int opcion = sc.nextInt();
    sc.nextLine();
    if (opcion == 1) {
      System.out.println("Dime el nombre de la actividad:");
      String nombreActividad = sc.nextLine();
      for (int i = 0; i < actividades.length; i++) {
	if (actividades[i].getTipo().equals(nombreActividad) && 
		actividades[i].getPlazasOcupadas() < actividades[i].getPlazas()) {
	  System.out.println((i + 1) + "" + actividades[i]);

	}

      }
      System.out.println("cual quieres??");
      int nActividad = sc.nextInt();
      sc.nextLine();
      actividad = this.actividades[nActividad];
    }
    // buscar actividad
    // buscar horario
    //add alumno a actividad.
    actividad.darAltaAlumno(alumno);
  }

  public void darBajaAlumno() {
    // busca Alumno
    int indice = buscarAlumnoPorIndice();
    // darle de baja en array de alumnos
    this.alumnos[indice].desmatricularDeTodasActividades();
    // darle de baja en todas las actividades del alumno.
    this.alumnos[indice] = this.alumnos[numeroAlumnos - 1];
    this.alumnos[numeroAlumnos - 1] = null;
    numeroAlumnos--;
  }

  public void generarReciboActividad() {
    // buscar actividad
    Actividad actividad = buscarActividad();
    // multiplicar precio por plazas.
    System.out.println("el precio de la " + actividad + " es " + actividad.getCoste() * actividad.getPlazasOcupadas());
  }

  private Alumno buscarAlumno() {
    int indice = buscarAlumnoPorIndice();
    Alumno buscar = this.alumnos[indice];
    return buscar;
  }

  private int buscarAlumnoPorIndice() {
    int buscar = -1;
    boolean ok = false;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre a dar de alta: ");
    String nombre = sc.nextLine();
    System.out.print("Apellido a dar de alta: ");
    String apellidos = sc.nextLine();

    for (int i = 0; i < numeroAlumnos && !ok; i++) {
      if (this.alumnos[i].getNombre().equals(nombre)
	      && this.alumnos[i].getApellido().equals(apellidos)) {
	buscar = i;
	ok = true;
      }
    }
    return buscar;
  }

  private Actividad buscarActividad() {
    Actividad buscar = null;

    Scanner sc = new Scanner(System.in);
    boolean encontrado = false;
    System.out.println("Que actividad desea?");
    String nombreActividad = sc.nextLine();
    System.out.println("Que dias desea?");
    String diasAct = sc.nextLine();
    System.out.println("Que horario desea?");
    String horAct = sc.nextLine();
    encontrado = false;

    for (int i = 0; i < actividades.length && !encontrado; i++) {
      if (actividades[i].getTipo().equals(nombreActividad) && actividades[i].getDias().equals(diasAct) && actividades[i].getHorario().equals(horAct)) {
	buscar = actividades[i];
	encontrado = true;

      }
    }
    return buscar;
  }
}
