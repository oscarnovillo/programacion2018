/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import daw.listas.Alumno;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import modelo.Dvd;
import modelo.Libro;
import modelo.ListaPrestables;
import modelo.Prestable;

/**
 *
 * @author oscar
 */
public class MainJsonPolimorfico {
    
    public static void main(String[] args) throws Exception {
        
        
        List<Prestable> prestables = new ArrayList();
        
        prestables.add(new Libro("jj", "libro", "tit"));
        prestables.add(new Dvd("jj", "dvd", "tit"));
        
        
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerModule(new JavaTimeModule());

        String json = mapper.writeValueAsString(prestables);

        System.out.println(json);

        mapper.writeValue(
                Files.newBufferedWriter(Paths.get("prestables.json")),
                 prestables);

        List<Prestable> alumnosJson = mapper.readValue(json,
                new TypeReference<List<Prestable>>() {
        });
        
        alumnosJson.forEach(System.out::println);
        
        
        ListaPrestables l =  new ListaPrestables();
        l.setPrestables(prestables);
        
        json = mapper.writeValueAsString(l);
        System.out.println(json);
        mapper.writeValue(
                Files.newBufferedWriter(Paths.get("prestablesPoli.json")),
                 l);
        
        ListaPrestables l1  = mapper.readValue(json,
                new TypeReference<ListaPrestables>() {
        });
        
        l1.getPrestables().forEach(System.out::println);
        
        
    }
    
}
