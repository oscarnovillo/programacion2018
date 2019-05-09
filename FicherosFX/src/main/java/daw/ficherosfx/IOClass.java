/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ficherosfx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

/**
 *
 * @author oscar
 */
public class IOClass {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        
        
        OutputStream f = Files.newOutputStream(Paths.get("file.txt"),StandardOpenOption.APPEND);
        BufferedOutputStream b = new BufferedOutputStream(f);
        
        b.write("hola".getBytes());
        b.flush();
        
        b.close();
        f.close();
       
               InputStream i = Files.newInputStream(Paths.get("file.txt"));
        BufferedInputStream bi = new BufferedInputStream(i);
        
        byte[] buffer = new byte[5000];
        int leidos = bi.read(buffer);
        
        System.out.println(new String(Arrays.copyOf(buffer, leidos)));
        bi.close();
        i.close();



    }
    
}
