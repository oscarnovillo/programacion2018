/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class SieteyMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// crear baraja
		int numeroCartas = 40;

		int[] baraja = new int[numeroCartas];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				baraja[i + j * 10] = i + 1;
			}
		}

		// barajar cartas
		Random r = new Random();
		int posicion;
		int posicion2;
		int swap;

		for (int i = 0; i < 200; i++) {
			posicion = r.nextInt(baraja.length);
			posicion2 = r.nextInt(baraja.length);
			swap = baraja[posicion];
			baraja[posicion] = baraja[posicion2];
			baraja[posicion2] = swap;
		}
		double sumaJugador = 0;
		boolean seguir = true;
		int indiceBaraja = 0;
		int opcion = 0;
		// jugar jugador a las 7,5
		do {
			// sacar una carta.
			double carta = baraja[indiceBaraja];
			indiceBaraja++;
			// ver suma y decidir si quiere otra carta
			if (carta > 7) {
				carta = 0.5;
			}
			sumaJugador += carta;
			System.out.println("tu suma es " + sumaJugador);
			if (sumaJugador <= 7.5) {
				System.out.println("Quieres otra carta?? 1. otra carta 2. salir");
				opcion = sc.nextInt();
			}

			// ver condiciones de finalización
		} while (sumaJugador <= 7.5 && opcion != 2);
		// jugar maquina
		// sacar cartas hasta que gane o pierda
		double sumaIA = 0;
		if (sumaJugador <= 7.5) {
			do {
				// sacar una carta.
				double carta = baraja[indiceBaraja];
				indiceBaraja++;
				// ver suma y decidir si quiere otra carta
				if (carta > 7) {
					carta = 0.5;
				}
				sumaIA += carta;
				System.out.println("suma IA es " + sumaIA);

				// ver condiciones de finalización
			} while (sumaIA <= 7.5 && sumaIA < sumaJugador);

		}
		// imprimir ganador.
		if (sumaJugador <= 7.5 && (sumaIA <= 7.5 && sumaIA >= sumaJugador)) {
			System.out.println("ha ganado la IA");
		} else {
			System.out.println("ha ganado jugador");
		}
	}

}
