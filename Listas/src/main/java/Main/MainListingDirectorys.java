/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author oscar
 */
public class MainListingDirectorys {
 
    
    public static void main(String[] args) throws IOException {
        
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("c:\\"),(entry) -> {
            return entry.getFileName().startsWith("P"); //To change body of generated lambdas, choose Tools | Templates.
        });
        
        directoryStream.forEach((t) -> {
            System.out.println(t.getFileName());  
        });
        
        
        
    }
}
