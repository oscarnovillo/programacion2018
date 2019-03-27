/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author oscar
 */
public class MainSets {

  public static void main(String[] args) {

    Set<String> nombres = new HashSet<>();

    nombres.add("Mustafa");
    System.out.println(nombres.size());

    boolean añadido = nombres.add("Mustafa");
    System.out.println("" + añadido + nombres.size());
    nombres.add("Laura");
    nombres.add("Jenny");
    nombres.add("Paul");
    nombres.add("Zinedine");
    nombres.add("Luismi");

    System.out.println(nombres.size());
    
    System.out.println(nombres.contains("Alberto"));
    
    Iterator<String> it = nombres.iterator();
    
    while (it.hasNext())
    {
      System.out.println(it.next());
    }
    
    for (String nombre : nombres)
    {
      System.out.println(nombre);
    }
    
    List <String> listaOrdenada = new ArrayList(nombres);
    Collections.sort(listaOrdenada, new Comparator(){
      @Override
      public int compare(Object o1, Object o2) {
	String s = (String)o1;
	String s1 = (String)o2;
	
	return -1 * s.compareTo(s1);
	
      }
    });
    for (String s : listaOrdenada) {
      System.out.println(s);
    }
    
  }

}
