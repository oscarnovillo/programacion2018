/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import modelo.Actividad;
import modelo.Alumno;
import servicios.Polideportivo;

/**
 *
 * @author oscar
 */
public class Main {
  
  
  public static void main(String[] args) {
    boolean terminado = false;
        int terminar = 0;
        int opcion;
        // menu de las 5 cosas a hacer
        Polideportivo polideportivo = new Polideportivo();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1:Dar de alta en el gimnasio");
            System.out.println("2:Matricular en una activad");
            System.out.println("3:Dar de baja");
            System.out.println("4:Generar recibo de un cliente");
            System.out.println("5:Generar recibo de una actividad");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    polideportivo.darAltaAlumno();
                    break;
                case 2:
                    polideportivo.matricularAlumno();
                    break;
                case 3:
                    polideportivo.darBajaAlumno();
                    break;
                case 4:
                    polideportivo.generarReciboAlumno();
                    break;
                case 5:
                    polideportivo.generarReciboActividad();
                    break;
            }
        } while (opcion < 5);
    
  }
  
}
