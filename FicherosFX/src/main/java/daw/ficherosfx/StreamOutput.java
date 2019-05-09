/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ficherosfx;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author oscar
 */
public class StreamOutput {
    
    public static void main(String[] args) throws IOException {
        
        
        BufferedWriter br = Files.newBufferedWriter(Paths.get("newfile.txt"),
                StandardOpenOption.APPEND);
        BufferedOutputStream bstream = new BufferedOutputStream(Files.newOutputStream(Paths.get("newfile.txt"),
                StandardOpenOption.APPEND));    
    
        br.write("hola buffered\n");
        
        
        bstream.write("hola2 writer\n".getBytes());
        
        
        br.write("hola buffered2\n");
        
        br.close();
        bstream.close();
        
    }
    
}
