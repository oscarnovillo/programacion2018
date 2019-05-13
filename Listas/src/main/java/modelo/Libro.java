/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author oscar
 */
public class Libro extends Prestable{
  
private String autor;

    public Libro() {
    }



    public Libro(String autor, String tejuelo, String titulo) {
        super(tejuelo, titulo);
        this.autor = autor;
    }


  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  @Override
  public String toString() {
    return "Libro{" + "autor=" + autor + '}';
  }

  
}
