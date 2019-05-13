/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.slf4j.LoggerFactory;

/**
 *
 * @author oscar
 */
public class MainLog {
    
    
    public static void main(String[] args) {
        try {
            LoggerFactory.getLogger(MainLog.class.getName()).error("Traza de informacion");
            
            Files.readAllLines(Paths.get("c:\\jjjj"));
        } catch (IOException ex) {
            LoggerFactory.getLogger(MainLog.class.getName()).error(" ERROR DE FICHERO",ex);
        }
        
        
    }
}
