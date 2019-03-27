/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import daw.listas.Alumno;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author oscar
 */
public class MainMap {

  public static void main(String[] args) {
    Map<String, Alumno> alumnos = new TreeMap();

    alumnos.put("123222", new Alumno("LuisMi123222"));
    alumnos.put("1231", new Alumno("LuisMi1231"));
    alumnos.put("13", new Alumno("LuisMi13"));
    alumnos.put("1", new Alumno("LuisMi1"));
    alumnos.put("131111", new Alumno("LuisMi131111"));
    alumnos.put("123", new Alumno("LuisMi123"));
    Alumno a1 = alumnos.put("12", new Alumno("Ruben"));
    if (a1 == null) {
      System.out.println(" alumno metido sin mas");
    }

    a1 = alumnos.put("124", new Alumno("Rubencillo"));
    if (a1 == null) {
      System.out.println(" alumno metido sin mas");
    } else {
      System.out.println("alumno cambiado " + a1);
    }

    System.out.println(alumnos.size());

    Alumno a = alumnos.get("124");
    System.out.println(a);

    for (Alumno al : alumnos.values())
    {
      System.out.println(al);
    }

    for (String codigo : alumnos.keySet())
    {
      System.out.println(codigo + " = " + alumnos.get(codigo));
    }

    
    
  }

}
