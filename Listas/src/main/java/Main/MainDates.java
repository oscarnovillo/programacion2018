package Main;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.text.DateFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */
public class MainDates {

  public static void main(String[] args) {
    Date fecha = null;
    fecha = new Date();
    System.out.println(fecha);

    Calendar c = Calendar.getInstance();
    c.set(2018, 10, 10);
    c.add(Calendar.HOUR, -17);
    fecha = c.getTime();

    System.out.println(fecha);

    // creacion de fechas
    LocalDate fechaNueva = LocalDate.now();
    System.out.println(fechaNueva);

    fechaNueva = LocalDate.parse("2019-08-28");
    System.out.println(fechaNueva);

    fechaNueva = LocalDate.of(2019, 7, 1);
    System.out.println(fechaNueva);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    String formattedDate = formatter.format(LocalDateTime.now());
    System.out.println(formattedDate);
    LocalDateTime fechaTime = null;
    do {
      try {
	Scanner sc = new Scanner(System.in);
	System.out.println("dame fecha:");
	fechaTime = LocalDateTime.parse(sc.nextLine(), formatter);
	fechaTime = fechaTime.minusWeeks(2);
	System.out.println(fechaTime);
      } catch (Exception e) {
	System.out.println(" por favor formato correcto");
      }
    } while (fechaTime == null); 
    // no usar formateo a manubrio
    System.out.printf("%02d/%02d/%4d", fechaNueva.getDayOfMonth(),
	    fechaNueva.getMonthValue(),
	    fechaNueva.getYear());

    Duration duracion = Duration.between(LocalDateTime.now(), fechaTime);
    System.out.println(duracion.toDays());
    //Period period = Period.between(LocalDate.now(), fechaNueva);
  }

}
