/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;



import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.Scanner;
import main.JavaArrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author oscar
 */
@DisplayName("me llamo juan")
public class TestArrays {

	//@ValueSource(strings = {"1\r\n2\r\n3\r\n4\r\n5\r\n","2\n3\n4\n4\n5\n"})
	
	@Test 
	void testEjercicio1()  {

		String entrada = "1\r\n2\r\n89\r\n4\r\n5\r\n";
		
		final ByteArrayInputStream input 
		= new ByteArrayInputStream(entrada.getBytes());
		System.setIn(input);

		PrintStream outOld = System.out;

		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));
		Scanner sc = new Scanner(System.in);
		JavaArrays.Ejercicio1(sc);

		System.setOut(outOld);
		
		String sOut = myOut.toString();

		System.out.println(myOut.toString());
	
		
		assertEquals(entrada, sOut.substring(sOut.indexOf("5")+3));
		
	}

	@Test
	void ejercicio6()
	{
		
		int ta[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int tb[] = {1,2,3,4,5,6,7,8,9,10,11,12};

		int resultado[] = {1,2,3,1,2,3,4,5,6,4,5,6,7,8,9,7,8,9,10,11,12,10,11,12};
		
		int mezcla[] = JavaArrays.doEjercicio6(ta, tb);
		
		assertArrayEquals(resultado, mezcla);
	}
	
	@Test
	void testMain()
	{
		final ByteArrayInputStream input 
		= new ByteArrayInputStream("1\n1\n2\n89\n4\n5\n".getBytes());
		System.setIn(input);

		PrintStream outOld = System.out;

		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));
		JavaArrays.main(null);
		System.setOut(outOld);
		
		String sOut = myOut.toString();

		assertNotEquals(-1, sOut.indexOf("EJERCICIO 1"));
		
	}
	
}
