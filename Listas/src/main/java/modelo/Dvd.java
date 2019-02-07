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
public class Dvd extends Prestable{

  public Dvd(String director, String tejuelo, String titulo) {
    super(tejuelo, titulo);
    this.director = director;
  }



  @Override
  public String toString() {
    return "Dvd{" + "director=" + director 
	    +super.toString()+"}";
  }
  
  private String director;

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }
  
}
