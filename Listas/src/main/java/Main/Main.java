/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import daw.listas.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author oscar
 */
public class Main {

  public static void main(String[] args) {

    ArrayList<Integer> enteros = new ArrayList();

    enteros.add(8);

    boolean ok = true;
    Boolean b = new Boolean(true);
    Integer entero =  new Integer(20);
   
    b=false;
    entero = 56 + entero;
    
    if (ok == b)
    {
      
    } 
    // A partir de aqui lo util para el polideportivo
    
    ArrayList<Alumno> listaAlumnos = new ArrayList();

    Alumno a1 = new Alumno("1");
    Alumno a2 = new Alumno("2");
    Alumno a3 = new Alumno("3");
    listaAlumnos.add(new Alumno("1"));
    listaAlumnos.add(a2);
    listaAlumnos.add(a3);

    //tamaño de la lista
    System.out.println(listaAlumnos.size());

    int tam = listaAlumnos.size();
    for (int i=0; i<tam; i++)
      listaAlumnos.remove(0);
    
    listaAlumnos.clear();
    
    
    Alumno temp = listaAlumnos.get(0);
    System.out.println(temp);
    temp = listaAlumnos.get(2);
    System.out.println(temp);

    listaAlumnos.remove(1);
    System.out.println(listaAlumnos.size());

    for (int i = 0; i < listaAlumnos.size(); i++) {
      System.out.println(listaAlumnos.get(i));
    }
    
    for (Alumno a : listaAlumnos)
    {
      System.out.println(a);
    }
    
    

    System.out.println(listaAlumnos.contains(a2));
    System.out.println(listaAlumnos.indexOf(a3));
    listaAlumnos.remove(a3);
    System.out.println(listaAlumnos.indexOf(a3));

    Scanner sc = new Scanner(System.in);
    System.out.println("dame getNombre() alumno a buscar");
    String nombre = sc.nextLine();

    Alumno buscar = new Alumno(nombre);
    
     System.out.println("indice de manera lista");
    System.out.println(listaAlumnos.indexOf(buscar));
    buscar.setDireccion("nueva");
    
    int index = listaAlumnos.indexOf(buscar);
    listaAlumnos.get(index).setDireccion("nueva ");
    
    System.out.println("indice de manera array normal");
    for (int i = 0; i < listaAlumnos.size(); i++) {
      if (listaAlumnos.get(i).getNombre().equals(nombre)) {
	System.out.println(i);
      }
    }

  }
}
