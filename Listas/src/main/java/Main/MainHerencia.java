/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import modelo.Dvd;
import modelo.Libro;
import modelo.Prestable;
import modelo.Revista;

/**
 *
 * @author oscar
 */
public class MainHerencia {

  public static void main(String[] args) {
    Revista r = new Revista();
    r.setTejuelo("revista");
    r.setColeccion("mihail");
    r.prestar();
    Libro l = new Libro("n","n","n");
    l.setTejuelo("libro");
    l.setAutor("pedro");
    l.prestar();
    Dvd dvd = new Dvd("juan", "dvd",
	    "Holocausto Canibal");

    dvd.prestar();
    
    
    
    
    ArrayList<Prestable> prestables = new ArrayList<>();
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<Dvd> dvds = new ArrayList<>();

    libros.add(l);
    prestables.add(l);
    prestables.add(dvd);
    prestables.add(r);
    
    Libro libro = (Libro) prestables.get(0);
    libro.setAutor("jorge");
    Prestable p1 = libro;

    for (Prestable p : prestables) {
      p.setTitulo("cambiado");

      if (p instanceof Libro) {
	Libro libro2 = (Libro) p;
	libro.setAutor("jorge");
      }
    }

    for (Prestable p : prestables) {
      if (p instanceof Dvd) {
	System.out.println(p);
      }
    }

    for (Prestable p : prestables) {
      System.out.println(p);
    }

  }

}
