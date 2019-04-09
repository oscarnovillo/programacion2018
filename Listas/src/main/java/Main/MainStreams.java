/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author oscar
 */
public class MainStreams {

  public static void main(String[] args) {

    int[] numeros = {1, 2, 3, 4, 56, 76, 87, 9, 90};

    IntStream s = Arrays.stream(numeros);
    
    System.out.println(s.average());
    
    int sum = 0;
    for (int i = 0;i<numeros.length;i++)
    {
      sum+= numeros[i];
    }

    
    Arrays.stream(numeros).forEach(new IntConsumer() {
      private String nombre;
      
      @Override
      public void accept(int value) {
	System.out.println(value);
      }
    });

    Arrays.stream(numeros).forEach((jj) -> {System.out.println(jj);
    
    });
    
   
    for (int i = 0;i<numeros.length;i++)
    {
      if (numeros[i]%2 ==0)
	System.out.println(numeros[i]);
    }
    
    Arrays.stream(numeros).filter((value) -> {
      return value%2==0; 
    }).forEach(System.out::println);
    

    
    
    

    List<String> nombres = new ArrayList<>();
    nombres.add("Roger");
    nombres.add("julio");
    nombres.add("kiko");
    nombres.add("paco");
    nombres.add("pepe");

    
    
    
    nombres.parallelStream().filter((value) -> {
      return value.charAt(0) == 'p' && value.contains("a") ; 
    }).forEach(MainStreams::mio);

    
    List<String> nombresUpper = nombres.parallelStream().map((nombre) -> {
      return nombre.toUpperCase(); //To change body of generated lambdas, choose Tools | Templates.
    }).collect(Collectors.toList());
    
    nombres.stream().forEach(System.out::println);
    nombresUpper.stream().forEach(System.out::println);
    
    
    
    nombresUpper.parallelStream().sorted((o1, o2) -> {
      return o1.compareTo(o2);
    }).forEachOrdered(System.out::println);
  }

  
  public static void mio(String s)
  {
    s = s.toUpperCase();
    System.out.println(s);
  }
}
