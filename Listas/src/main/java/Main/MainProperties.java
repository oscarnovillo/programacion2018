/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class MainProperties {
  
  public static void main(String[] args) {
    
    try {
      Properties appProps = new Properties();
      appProps.load(new FileInputStream("config.properties"));
      System.out.println(appProps.getProperty("clave"));
      appProps.setProperty("color", "rojo");
      appProps.storeToXML(new FileOutputStream("config.xml"),"UN COMENTARIO");
    } catch (Exception ex) {
      Logger.getLogger(MainProperties.class.getName()).log(Level.SEVERE, null, ex);
    }
 
    
    
  }
  
}
