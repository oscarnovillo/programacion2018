/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author oscar
 */
public abstract class Vehiculo {

  private String color;
  private String marca;
  private double precio_venta;

  public void pintar(String color) {
    this.color = color;
    this.precio_venta *= 1.1;
  }
  
  public void pintar(String color,int tono) {
    this.color = color;
    this.precio_venta *= 1.1;
  }
  
  
  
  public abstract void lavar();
	  

  public void addCoste(double cantidad)
  {
    this.precio_venta += cantidad;
  }
  
  public double getPrecio_venta() {
    return precio_venta;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

}
