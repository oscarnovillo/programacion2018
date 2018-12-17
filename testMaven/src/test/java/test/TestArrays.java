/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
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


	@ParameterizedTest 
	@ValueSource(strings = {"1\r\n2\r\n3\r\n4\r\n5\r\n","2\n3\n4\n4\n5\n"})
	void testEjercicio1(String in)  {

		ByteArrayInputStream input = new ByteArrayInputStream(in.getBytes());
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		PrintStream outOld = System.out;
		System.setOut(new PrintStream(myOut));
		Scanner sc = new Scanner(input);
		JavaArrays.Ejercicio1(sc);
		System.setOut(outOld);
		String sOut = myOut.toString();

		System.out.println(myOut.toString());

		assertEquals(in, sOut.substring(sOut.indexOf("5") + 3));

	}

}