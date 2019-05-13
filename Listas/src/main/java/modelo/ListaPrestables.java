/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ListaPrestables {

    
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
    @JsonSubTypes({
        @Type(value = Libro.class, name = "dog"),
        @Type(value = Dvd.class, name = "cat")})
    private List<Prestable> prestables;

    public ListaPrestables() {
    }

    public List<Prestable> getPrestables() {
        return prestables;
    }

    public void setPrestables(List<Prestable> prestables) {
        this.prestables = prestables;
    }

}
