package Main;


import daw.listas.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */
public class MainStreamEjemplos {

  public static void main(String[] args) {
    int[] numeros = {1, 6789, 2377, 23, 213467, 5678, 234, 809, 23, 43345, 346, 456, 3, 21234, 3456, 345, 1223, 12, 6345, 123, 124, 2345, 3465, 123};

    System.out.println("la media es "
	    + Arrays.stream(numeros)
		    .filter((ruben) -> {
		      return ruben % 2 == 0; //To change body of generated lambdas, choose Tools | Templates.
		    })
		    .average().getAsDouble());

    Arrays.stream(numeros).sorted().forEach((value) -> {
      System.out.println(value);
    });

    Arrays.stream(numeros).sorted().forEach(System.out::println);

    List<String> nombres = new ArrayList<>();

    nombres.add("lkasdjflosf");
    nombres.add("lkAsdjflosf");
    nombres.add("lkasddsf");
    nombres.add("lkiillljflosf");
    nombres.add("lkasDjfasdasdlosf");
    nombres.add("lkasdjasasdadAAAAAAflosf");

    boolean b = nombres.stream().anyMatch((nombre) -> {
      boolean mayusculas = false;
      for (int i = 0; i < nombre.length() && !mayusculas; i++) {
	mayusculas = Character.isUpperCase(nombre.charAt(i));
      }

      return mayusculas;
    });

    System.out.println(b);

    nombres.stream().filter((nombre) -> {
      boolean mayusculas = false;
      for (int i = 0; i < nombre.length() && !mayusculas; i++) {
	mayusculas = Character.isUpperCase(nombre.charAt(i));
      }
      return mayusculas;
    }).forEach(System.out::println);

    nombres.stream().sorted((o1, o2) -> {
      return o1.compareTo(o2) * -1; //To change body of generated lambdas, choose Tools | Templates.
    }).forEach(System.out::println);

    nombres.stream().map((nombre) -> {
      return nombre.replace('a', 'A')
	      .replace('e', 'E')
	      .replace('i', 'I')
	      .replace('o', 'O')
	      .replace('u', 'U'); //To change body of generated lambdas, choose Tools | Templates.
    }).forEach(System.out::println);

    List<Alumno> alumnos = new ArrayList<>(); 
    alumnos.add(new Alumno("lkjlkjlk"));
    alumnos.add(new Alumno("lkasdasdasdjlkjlk"));
    alumnos.add(new Alumno("lkasasdasdasd"));
    
    
    Map<String,Alumno> mapAlumnos = alumnos.stream()
	    
	    .collect(Collectors.toMap((t) -> {
	      return t.getNombre(); //To change body of generated lambdas, choose Tools | Templates.
	    },(t) -> {
	      return t; //To change body of generated lambdas, choose Tools | Templates.
	    } ));
    
    
  }

}
