/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import daw.listas.Alumno;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Libro;

/**
 *
 * @author oscar
 */
public class MainJSON {

    public static void main(String[] args) throws IOException {

        Alumno a = new Alumno("pepito");
        a.setBirth(LocalDate.now());
        a.setSaldoCuenta(280.090);
        Libro l = new Libro("kkk","l","l");
        a.getLibros().add(l);
        a.getLibros().add(l);
        a.getLibros().add(l);
        List alumnos = new ArrayList();

        alumnos.add(a);
        alumnos.add(new Alumno("jose"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        String json = mapper.writeValueAsString(alumnos);

        System.out.println(json);

        mapper.writeValue(
                Files.newBufferedWriter(Paths.get("alumnos.json")),
                 alumnos);

        List<Alumno> alumnosJson = mapper.readValue(json,
                new TypeReference<List<Alumno>>() {
        });
        
        System.out.println(alumnosJson.get(0).getLibros().get(0).getAutor());

//    //
    }

}
