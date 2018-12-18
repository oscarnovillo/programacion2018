/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author IsaacM
 */
public class JavaArrays {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// Entorno
		int numeroejercicio;

		// algoritmo
		Scanner read = new Scanner(System.in);

		System.out.println("Dime el numero de ejercicio");
		numeroejercicio = read.nextInt();
		switch (numeroejercicio) {
		case 1:
			Ejercicio1(read);
			break;
		case 2:
			Ejercicio2(read);
			break;
		case 3:
			Ejercicio3(read);
			break;
		case 4:
			Ejercicio4(read);
			break;
		case 5:
			Ejercicio5(read);
			break;
		case 6:
			Ejercicio6(read);
			break;
		case 7:
			Ejercicio7(read);
			break;
		case 8:
			Ejercicio8(read);
			break;
		case 9:
			Ejercicio9(read);
			break;
		case 10:
			Ejercicio10(read);
			break;
		case 11:
			Ejercicio11(read);
			break;
		case 12:
			Ejercicio12(read);
			break;
		case 13:
			Ejercicio13(read);
			break;
		case 14:
			Ejercicio14(read);
			break;
		case 15:
			Ejercicio15(read);
			break;
		case 16:
			Ejercicio16(read);
			break;
		case 17:
			Ejercicio17(read);
			break;

		}

	}

	public static void Ejercicio1(Scanner read) {
		System.out.println("EJERCICIO 1");
		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime los numeros, " + (i + 1));

			numeros[i] = read.nextInt();

		}
		int i;

		for (i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);
		}
	}

	public static void Ejercicio2(Scanner read) {
		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime los numeros, " + (i + 1));

			numeros[i] = read.nextInt();

		}
		int i;
		System.out.println("Imprimir orden inverso");
		for (i = numeros.length - 1; i > -1; i--) {

			System.out.println(numeros[i]);
		}

	}

	public static void Ejercicio3(Scanner read) {

		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[5];
		int pos = 0, neg = 0, cero = 0; // contadores
		int i;
		double sumaP = 0;
		double sumaN = 0;
		double sumaC = 0;

//Leemos los valores por teclado y los guardamos en el array
		System.out.println("Lectura de los elementos del array: ");
		for (i = 0; i < numeros.length; i++) {
			System.out.print("numeros[" + i + "]= ");
			numeros[i] = teclado.nextInt();
		}
		// se recorre el array para contar positivos, negativos y ceros
		for (i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				sumaP = sumaP + numeros[i];
				pos++;
			} else if (numeros[i] < 0) {
				sumaN = sumaN + numeros[i];

				neg++;
			} else {
				sumaC = sumaC + numeros[i];
				cero++;
			}
		}

		// mostrar resultados
		System.out.println("Positivos: " + pos);
		System.out.println("Negativos: " + neg);
		System.out.println("Ceros: " + cero);
		System.out.println("media de positivos: " + sumaP / pos);
		System.out.println("media de negativos: " + sumaN / neg);
		System.out.println("cantidad de ceros:  " + cero);

	}

	public static void Ejercicio4(Scanner read) {
		Scanner teclado = new Scanner(System.in);
		int i, t[];
		t = new int[10];
		for (i = 0; i < 10; i++) {
			System.out.print("Introduzca numero: ");
			t[i] = teclado.nextInt();

		}
		System.out.println("El resultado es:");
		for (i = 0; i <= 4; i++) {
			System.out.println(t[i]);
			System.out.println(t[9 - i]);
		}

	}

	public static void Ejercicio5(Scanner read) {
		Scanner teclado = new Scanner(System.in);
		int a[], b[], c[];
		int i, j;
		a = new int[10];
		b = new int[10];
// la tabla c tendrá que tener el doble de tamaño que a y b.
		c = new int[20];
// leemos la tabla a
		System.out.println("Leyendo la tabla a");
		for (i = 0; i < 10; i++) {
			System.out.print("número: ");
			a[i] = teclado.nextInt();
		}
// leemos la tabla b

		System.out.println("Leyendo la tabla b");
		for (i = 0; i < 10; i++) {
			System.out.print("número: ");
			b[i] = teclado.nextInt();
		}
// asignaremos los elementos de la tabla c
// para las tablas a y b utilizaremos como índice i
// y para la tabla c utilizaremos como índice k.
		j = 0;
		for (i = 0; i < 10; i++) {
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
		}
		System.out.println("La tabla c queda: ");
		for (j = 0; j < 20; j++) // seguimos utilizando k, para la tabla c. Aunque se podría utilizar i.
		{
			System.out.print(c[j] + " ");
		}
		System.out.println("");
	}

	public static int[] doEjercicio6(int[] ta, int[] tb) {
		int mezcla[] = new int[24];

	
		for (int i = 0; i < 24; i += 3) {
			for (int j = 0; j < 3; j++) {
				if ((i % 2) == 0) {
					
					mezcla[i + j] = ta[((i / 6) * 3) + j];
				} else {
					mezcla[i + j] = tb[((i / 6) * 3) + j];
				}
			}

		}
		return mezcla;
	}
	
	

	public static void Ejercicio6(Scanner read) {
		Random r = new Random();
		int ta[] = new int[12];
		int tb[] = new int[12];

		for (int i = 0; i < 12; i++) {
			ta[i] = r.nextInt(12);
			System.out.print(ta[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < 12; i++) {
			tb[i] = r.nextInt(12);
			System.out.print(tb[i] + " ");
		}
		int mezcla[] = doEjercicio6(ta, tb);
		
		System.out.println("\n");
		for (int i = 0; i < 24; i++) {
			System.out.print(mezcla[i] + " ");
		}
	}

	public static void Ejercicio7(Scanner read) {
		int[] numeros = new int[10];
		int i;
		boolean creciente = true;
		boolean decreciente = true;

		Random r = new Random();

		for (i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(100);
			System.out.println(numeros[i]);
		}
		for (i = 0; i < numeros.length; i++) {
			System.out.print(" " + numeros[i]);
		}
		System.out.println("");
		for (i = 0; i < numeros.length - 1 && (creciente || decreciente); i++) {
			if (numeros[i] > numeros[i + 1]) {
				creciente = false;
			} else if (numeros[i] < numeros[i + 1]) {
				decreciente = false;
			}
		}

		if (creciente) {
			System.out.println("creciente");
		} else if (decreciente) {
			System.out.println("decreciente");
		} else {
			System.out.println("desordenada");
		}
	}

	public static void Ejercicio8(Scanner sc) {
		Random r = new Random();
		int tabla[] = new int[10];
		int insertar;
		int posicion;
		for (int i = 0; i < 8; i++) {
			tabla[i] = r.nextInt(100);
		}
		System.out.print("Numero que vas a insertar: ");
		insertar = sc.nextInt();

		System.out.print("En que posicion quieres que este: ");
		posicion = sc.nextInt();

		for (int i = 7; i >= posicion; i--) {
			tabla[i + 1] = tabla[i];
		}
		tabla[posicion] = insertar;

		for (int i = 0; i < 9; i++) {
			System.out.println(tabla[i]);
		}

	}

	public static void Ejercicio9(Scanner read) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int guardar;

		System.out.println("Llenamos el array");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(i + " introduce ");

			numeros[i] = teclado.nextInt();

		}
		guardar = numeros[9];

		for (int i = 8; i >= 0; i--) {
			numeros[i + 1] = numeros[i];

		}
		numeros[0] = guardar;
		System.out.println("resultado");
		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);

		}

	}

	public static void Ejercicio10(Scanner read) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int desplazaminetos;
		int guardar;
		System.out.println("Llenamos el array");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(i + " Dime numero");
			numeros[i] = teclado.nextInt();
			guardar = numeros[9];

		}
		System.out.println("Dime cuantos desplazamientos quieres");
		desplazaminetos = teclado.nextByte();

		for (int k = 0; k < desplazaminetos; k++) {
			guardar = numeros[9];
			for (int i = 8; i >= 0; i--) {
				numeros[i + 1] = numeros[i];

			}
			numeros[0] = guardar;

		}
		System.out.println("Salida");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);

		}

	}

	public static void Ejercicio11(Scanner read) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int insertar;
		int guardar = 0;
		int lugar = 0;
		int k = 0;

		System.out.println("Dime 5 numeros EN FORMA CRECIENTE");
		for (int i = 0; i < 5; i++) {
			System.out.println("Numero" + (i + 1) + " =");
			numeros[i] = teclado.nextInt();

		}
		System.out.println("Dime el numero a insertar");
		insertar = teclado.nextInt();

		// encontramos el lugar donde tendria que ir el numero
		while (numeros[k] < insertar && k <= 5) {
			k++;
			lugar++;
		}
		// movemos los arrays
		for (int i = 4; i >= lugar; i--) {
			numeros[i + 1] = numeros[i];

		}
		// metemos el numero en el lugar
		numeros[lugar] = insertar;
		System.out.println("Salida");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);

		}

	}

	public static void Ejercicio12(Scanner read) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int borrar;
		System.out.println("Llenar el array");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime el numero: " + (i));
			numeros[i] = teclado.nextInt();

		}
		System.out.println("Que indice quiere eliminar");
		borrar = teclado.nextInt();
//borrando , desplazar sin guardar
		for (int i = borrar; i < 9; i++) {
			numeros[i] = numeros[i + 1];

		}
		numeros[9] = 0;

		System.out.println("Salida");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);

		}
	}

	public static void Ejercicio13(Scanner sc) {
		int contadorpar;
		int contadorimpar;
		int tabla[] = new int[10];
		int par[];
		int impar[];
		for (int i = 0; i < 10; i++) {
			System.out.print("Dime 10 numeros: ");
			tabla[i] = sc.nextInt();
		}
		contadorpar = 0;
		contadorimpar = 0;
		for (int i = 0; i < 10; i++) {
			if ((tabla[i] % 2) == 0) {
				contadorpar++;
			} else {
				contadorimpar++;
			}
		}
		par = new int[contadorpar];
		impar = new int[contadorimpar];

		contadorpar = 0;
		contadorimpar = 0;
// con valores
		for (int i = 0; i < 10; i++) {
			if ((tabla[i] % 2) == 0) {
				par[contadorpar] = tabla[i];
				contadorpar++;
			} else {
				impar[contadorimpar] = tabla[i];
				contadorimpar++;
			}
		}

		System.out.print("Los pares son: ");
		for (int i = 0; i < contadorpar; i++) {
			System.out.print(par[i] + " ");

		}
		System.out.println("\n");
		System.out.print("Los impares son:");
		for (int i = 0; i < contadorimpar; i++) {
			System.out.print(impar[i] + " ");

		}

		// con indices
		contadorpar = 0;
		contadorimpar = 0;
		for (int i = 0; i < 10; i++) {
			if ((tabla[i] % 2) == 0) {
				par[contadorpar] = i;
				contadorpar++;
			} else {
				impar[contadorimpar] = i;
				contadorimpar++;
			}
		}

		System.out.print("Los pares son: ");
		for (int i = 0; i < contadorpar; i++) {
			System.out.print(tabla[par[i]] + " ");

		}
		System.out.println("\n");
		System.out.print("Los impares son:");
		for (int i = 0; i < contadorimpar; i++) {
			System.out.print(tabla[impar[i]] + " ");

		}

	}

	public static void Ejercicio14(Scanner sc) {
		/*
		 * 14. Leer dos series de 10 enteros, que estarán ordenados crecientemente.
		 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan
		 * ordenados.
		 */
		int tablaA[] = new int[10];
		int tablaB[] = new int[10];
		int tabla20[] = new int[20];
		System.out.println("Vas a introducir " + tablaA.length
				+ " números enteros dos veces de forma creciente, para llenar dos tablas, y te los voy a juntar y mostrar sin perder el orden creciente.");

		for (int i = 0; i < tablaA.length; i++) {
			System.out.println("Introduce el número " + (i + 1) + "º para la tabla A: ");
			tablaA[i] = sc.nextInt();
			sc.nextLine();
		}

		for (int i = 0; i < tablaB.length; i++) {
			System.out.println("Introduce el número " + (i + 1) + "º para la tabla B: ");
			tablaB[i] = sc.nextInt();
			sc.nextLine();
		}
		int indiceA = 0;
		int indiceB = 0;
		for (int i = 0; i < 20; i++) {
			// no pongo un if de si tanto indiceA como indiceB están llenos porque en ese
			// caso i debe ser 20.
			// si alguna de las dos tablas ya está insertada entera, insertará lo que queda
			// de la otra
			if (indiceA >= 10) {
				tabla20[i] = tablaB[indiceB];
				indiceB++;
			} else if (indiceB >= 10) {
				tabla20[i] = tablaA[indiceA];
				indiceA++;
				// Contrasta ahora según el índice por el que vaya de cada tabla los números
				// menores de cada una para insertar el menor
			} else if (tablaA[indiceA] <= tablaB[indiceB]) {
				tabla20[i] = tablaA[indiceA];
				indiceA++;
			} else if (tablaB[indiceB] <= tablaA[indiceA]) {
				tabla20[i] = tablaB[indiceB];
				indiceB++;
			}
		}
		System.out.println("La cadena ha quedado finalmente de esta manera: ");
		for (int i = 0; i < tabla20.length; i++) {
			System.out.println(tabla20[i]);
		}

	}

	public static void Ejercicio15(Scanner read) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int buscar = 0;
		System.out.println("Llenar el array FORMA ascendente");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime el numero: " + (i));
			numeros[i] = teclado.nextInt();
		}
		int i = 0;
		System.out.println("Dimero que numero buscar");
		buscar = teclado.nextInt();

		while (i < 10 && numeros[i] < buscar) {
			i++;
		}
		if (i == 10) {
			System.out.println(" No se encontro el numero");

		} else {
			if (numeros[i] == buscar) {
				System.out.println("El numero esta en el indice: " + i);
			} else {
				System.out.println("No se encontro el numero");
			}

		}

	}

	public static void Ejercicio16(Scanner sc) {
		/*
		 * 16. Queremos desarrollar una aplicación que nos ayude a gestionar las notas
		 * de un centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se
		 * pide leer las notas del primer, segundo y tercer trimestre de un grupo.
		 * Debemos mostrar al final: la nota media del grupo en cada trimestre, y la
		 * media del alumno que se encuentra en la posición N (N se lee por teclado).
		 */
		int cantidadAlumnos = 5;
		// priemra casilla es la evaluación, segunda casilla es la nota.
		double alumnos[][] = new double[3][cantidadAlumnos];
		System.out.println(
				"Vas a introducir las notas de 5 alumnos, de 3 evaluaciones. Después mostraré al final: la nota media del\n"
						+ " grupo en cada trimestre, y la media del alumno que se encuentra en la posición N que tú me digas.");
		for (int i = 0; i < cantidadAlumnos; i++) {
			System.out.println("Introduce la nota del alumno " + (i + 1) + " en la primera evaluación: ");
			alumnos[0][i] = sc.nextDouble();
			sc.nextLine();
			while (alumnos[0][i] < 0 || alumnos[0][i] > 10) {
				System.out.println(
						"Introduce BIEN la nota (de 0 a 10) del alumno " + (i + 1) + " en la primera evaluación: ");
				alumnos[0][i] = sc.nextDouble();
				sc.nextLine();
			}
		}
		for (int i = 0; i < cantidadAlumnos; i++) {
			System.out.println("Introduce la nota del alumno " + (i + 1) + " en la segunda evaluación: ");
			alumnos[1][i] = sc.nextDouble();
			sc.nextLine();
			while (alumnos[1][i] < 0 || alumnos[1][i] > 10) {
				System.out.println(
						"Introduce BIEN la nota (de 0 a 10) del alumno " + (i + 1) + " en la segunda evaluación: ");
				alumnos[1][i] = sc.nextDouble();
				sc.nextLine();
			}
		}
		for (int i = 0; i < cantidadAlumnos; i++) {
			System.out.println("Introduce la nota del alumno " + (i + 1) + " en la tercera evaluación: ");
			alumnos[2][i] = sc.nextDouble();
			sc.nextLine();
			while (alumnos[2][i] < 0 || alumnos[2][i] > 10) {
				System.out.println(
						"Introduce BIEN la nota (de 0 a 10) del alumno " + (i + 1) + " en la tercera evaluación: ");
				alumnos[2][i] = sc.nextDouble();
				sc.nextLine();
			}
		}
		double mediaClase = 0;
		// Hacemos la media
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < cantidadAlumnos; j++) {
				mediaClase += alumnos[i][j];
			}
		}
		mediaClase /= (cantidadAlumnos * 3);
		System.out.println("La media de la clase es " + mediaClase + ".");
		System.out.println("¿De qué alumno quieres la media? (de 0 a " + cantidadAlumnos
				+ ") (introduce solo el número entero): ");
		int N = sc.nextInt();
		sc.nextLine();
		// Por si acaso inserta un alumno que no existe
		while (N < 0 || N > cantidadAlumnos) {
			System.out.println("Cari, ese alumno no existe, introdúcelo bien: ");
			N = sc.nextInt();
			sc.nextLine();
		}
		System.out.println(
				"La media del alumno " + N + " es " + ((alumnos[0][N] + alumnos[1][N] + alumnos[2][N]) / 3) + ".");

	}

	public static void Ejercicio17(Scanner read) {
		Scanner teclado = new Scanner(System.in);
		int[] baraja1 = new int[10];
		int[] baraja2 = new int[10];
		Random Aleatorio = new Random();

		int aux = 0;
		int IndiceR1 = 0;
		int IndiceR2 = 0;
		int contador1 = 0;
		int contador2 = 0;

		for (int i = 0; i < baraja1.length; i++) {
			baraja1[i] = i;
		}
		for (int i = 0; i < baraja2.length; i++) {
			baraja2[i] = i;
		}

		for (int j = 0; j < 100; j++) {
			IndiceR1 = Aleatorio.nextInt(10);
			IndiceR2 = Aleatorio.nextInt(10);
			aux = baraja1[IndiceR1];

			baraja1[IndiceR1] = baraja1[IndiceR2];
			baraja1[IndiceR2] = aux;

		}

		for (int j = 0; j < 100; j++) {
			IndiceR1 = Aleatorio.nextInt(10);
			IndiceR2 = Aleatorio.nextInt(10);
			aux = baraja2[IndiceR1];

			baraja2[IndiceR1] = baraja2[IndiceR2];
			baraja2[IndiceR2] = aux;
		}
		System.out.println("---------------------------------");
		System.out.println("Salida baraja 1");
		for (int i = 0; i < baraja1.length; i++) {
			System.out.println(baraja1[i]);

		}
		System.out.println("---------------------------------");
		System.out.println("Salida baraja 2");
		for (int i = 0; i < baraja2.length; i++) {
			System.out.println(baraja2[i]);

		}
		for (int i = 0; i < 10; i++) {
			if (baraja1[i] > baraja2[i]) {

				contador1++;
			} else if (baraja2[i] > baraja1[i]) {
				contador2++;

			}
		}
		if (contador1 > contador2) {
			System.out.println("bajara 1 gana, obviamente es mejor..");
		} else if (contador1 < contador2) {
			System.out.println("baraja 2 gana, solo ha sido suerte..");
		} else if (contador1 == contador2) {
			System.out.println("Empate, wtf, como es posible");

		}
	}
}
