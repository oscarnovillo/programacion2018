/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import utils.Constantes;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class MainEnumerados {

  public static void main(String[] args) {

    DiasSemana dia = DiasSemana.LXV;

    System.out.println(DiasSemana.LXV);
    
    Scanner sc = new Scanner(System.in);
    String datosUsuario = sc.nextLine();
    DiasSemana usuario = 
	    DiasSemana.valueOf(datosUsuario);
    
    System.out.println(usuario);
    
    switch(dia)
    {
      case LXV:
      case MJ:
    }
    
    
    for (int i=0;i<DiasSemana.values().length; i++)
      System.out.println(DiasSemana.values()[i]);
	    
	    
    String diaSemana = "LXV";

    String diaSemanaCte = Constantes.DIAS_SEMANA_LXV;

    diaSemana.equals(Constantes.DIAS_SEMANA_LXV);

    if (dia == DiasSemana.LXV) {

      System.out.println("OPK");
    }

  }

}
