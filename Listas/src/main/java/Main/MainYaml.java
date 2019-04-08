/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author oscar
 */
public class MainYaml {
  
  public static void main(String[] args) {
    try {
      Yaml yaml = new Yaml();
      
      Map<String, Object> obj = yaml.load( new FileInputStream("config.yml"));
      System.out.println(obj.get("clave"));
    } catch (FileNotFoundException ex) {
      Logger.getLogger(MainYaml.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
}
