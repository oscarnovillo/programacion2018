/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Actividad;
import modelo.Alumno;

/**
 *
 * @author oscar
 */
public class Polideportivo {

  private ArrayList<Alumno> alumnos;
  private ArrayList<Actividad> actividades;

  public Polideportivo() {
    this.alumnos = new ArrayList<>();
    this.actividades = new ArrayList<>();

    this.alumnos.add(new Alumno("pedro", "fernandez"));

    this.actividades.add(new Actividad("aerobic", "l,x,v", "10:10-11:00", 35, 47.60));
    this.actividades.add(new Actividad("aerobic", "l,x,v", "11:10-12:00", 35, 47.60));
    this.actividades.add(new Actividad("aerobic", "l,x,v", "19:10-20:00", 35, 47.60));
    this.actividades.add(new Actividad("aerobic", "m,j", "09:10–10:00", 35, 35.70));
    this.actividades.add(new Actividad("aerobic", "m,j", "10:10–11:00", 35, 35.70));
    this.actividades.add(new Actividad("aerobic", "m,j", "18:10–19:00", 35, 35.70));
    this.actividades.add(new Actividad("artes marciales", "l,x,v", "19:00–20:00", 15, 45.00));
    this.actividades.add(new Actividad("artes marciales", "m,j", "18:00–19:00", 15, 34.00));
    this.actividades.add(new Actividad("artes marciales", "m,j", "19:00–20:00", 15, 34.00));
    this.actividades.add(new Actividad("natacion", "l,m,j", "18:10–19:00", 35, 47.60));
    this.actividades.add(new Actividad("natacion", "m,j", "17:10–18:00", 35, 35.70));

  }

  public void darAltaAlumno() {
    // pedir el alumno
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre a dar de alta: ");
    String n = sc.nextLine();
    System.out.print("Apellido a dar de alta: ");
    String a = sc.nextLine();

    // add al arraythis.alumnos.add(a);
    Alumno alumno = new Alumno(n, a);
    if (this.alumnos.contains(alumno)) {
      this.alumnos.add(alumno);
    }
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
      for (int i = 0; i < actividades.size(); i++) {
	if (actividades.get(i).getTipo().equals(nombreActividad)
		&& actividades.get(i).getPlazasOcupadas() < actividades.get(i).getPlazas()) {
	  System.out.println((i + 1) + "" + actividades.get(i));

	}

      }
      System.out.println("cual quieres??");
      int nActividad = sc.nextInt();
      sc.nextLine();
      actividad = this.actividades.get(nActividad);
    }
    // buscar actividad
    // buscar horario
    //add alumno a actividad.
    boolean add = actividad.darAltaAlumno(alumno);
    if (add) {
      System.out.println("alumno matriculado");
    }
  }

  public void darBajaAlumno() {
    // busca Alumno
    int indice = buscarAlumnoPorIndice();
    // darle de baja en array de alumnos
    this.alumnos.get(indice).desmatricularDeTodasActividades();
    // darle de baja en todas las actividades del alumno.
    this.alumnos.remove(indice);
  }

  public void generarReciboActividad() {
    // buscar actividad
    Actividad actividad = buscarActividad();
    // multiplicar precio por plazas.

    System.out.println("el precio de la " + actividad + " es " + actividad.getCoste() * actividad.getPlazasOcupadas());
  }

  private Alumno buscarAlumno() {
    int indice = buscarAlumnoPorIndice();
    Alumno buscar = null;
    if (indice != -1) {
      buscar = this.alumnos.get(indice);
    }
    return buscar;
  }

  private int buscarAlumnoPorIndice() {
    int buscar;
    boolean ok = false;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre a dar de alta: ");
    String nombre = sc.nextLine();
    System.out.print("Apellido a dar de alta: ");
    String apellidos = sc.nextLine();
    Alumno temp = new Alumno(nombre, apellidos);

    buscar = this.alumnos.indexOf(temp);
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

    for (int i = 0; i < actividades.size() && !encontrado; i++) {
      if (actividades.get(i).getTipo().equals(nombreActividad)
	      && actividades.get(i).getDias().equals(diasAct)
	      && actividades.get(i).getHorario().equals(horAct)) {
	buscar = actividades.get(i);
	encontrado = true;

      }
    }
    return buscar;
  }
}
