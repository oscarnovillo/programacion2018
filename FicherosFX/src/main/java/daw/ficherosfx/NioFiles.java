/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ficherosfx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class NioFiles {
    
    public static void main(String[] args) throws IOException {
        List<String> lista = new ArrayList();
        Path p = Paths.get("D:\\");
        
        if (Files.isDirectory(p))
        {
            Files.list(p).forEach((dir) -> {
               if (Files.isDirectory(dir))
               {
                   try {
                       Files.list(dir).filter((arg0) -> {
                           return arg0.toString().startsWith("P");
                       }).forEach((arg0) -> {
                           lista.add(arg0.toString());
                       });
                   } catch (IOException ex) {
                       Logger.getLogger(NioFiles.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            });
        }
        else
        {
            Files.readAllLines(p).forEach(System.out::println);
        }
                
               
    
    }
    
}
