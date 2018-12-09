/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.ByteArrayInputStream;
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

/**
 *
 * @author oscar
 */
@DisplayName("me llamo juan")
public class TestArrays {
    
    @Test
    void testEjercicio1() throws FileNotFoundException
    {
String out = "";
        ByteArrayInputStream input = new ByteArrayInputStream("1\n2\n3\n4\n5\n".getBytes());
        PrintStream w = new PrintWriter( out);
        System.setOut(w);
        Scanner sc =  new Scanner(input);
        JavaArrays.Ejercicio1(sc);
    }
    
}
