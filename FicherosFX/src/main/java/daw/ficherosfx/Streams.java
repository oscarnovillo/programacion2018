/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ficherosfx;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class Streams {

    public static void main(String[] args) {
        BufferedInputStream b = null;
        BufferedReader br = null;
        try {
            b = new BufferedInputStream(new FileInputStream("newfile.txt"));

            byte[] buffer = new byte[1000];
            int leidos = b.read(buffer);

            byte[] losLeidos = Arrays.copyOf(buffer, leidos);

            String s = new String(losLeidos);

            System.out.println(s);
            
            
            
            br = Files.newBufferedReader(Paths.get("newfile.txt"));
            
            Files.size(Paths.get("newfile.txt"));
            Files.readAllLines(Paths.get("newfile.txt")).forEach(System.out::println);

            br = new BufferedReader(new FileReader("newfile.txt"));

            br.lines().forEach(System.out::println);
        } catch (IOException ex) {
            Logger.getLogger(Streams.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                b.close();
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Streams.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
