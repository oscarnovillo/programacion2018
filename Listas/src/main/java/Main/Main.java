/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import daw.listas.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author oscar
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        List<Alumno> l = new ArrayList();
        l.add(new Alumno("hjjj"));
        l.add(new Alumno("aaaj"));
        l.add(new Alumno("hvvvj"));
        
       List<Alumno> filtro =  l.stream().filter(t -> t.nombre.contains("f")).collect(Collectors.toList());
      
       filtro.get(0).nombre = "jjj";
       
       System.out.println("hola");
    }
}
