/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author oscar
 */
public class MainLinkedHashSet {
  
  public static void main(String[] args) {
    
    String[] numeros = {"245","41","53","7","8","9","4","3","5","2","10"};
    
    Set<String> num = null;
    
    num = Arrays.stream(numeros).sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    
    Arrays.stream(numeros).sorted().collect(Collectors.toList()).forEach(System.out::print);
    
    
    num.forEach(System.out::println);
  }
  
}
