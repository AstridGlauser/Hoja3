/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication26;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Vector;
import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author imarg
 */
public class QuicksortIT {
      @Test
 	 public void testEvalute() {
	
     Quicksort  algoritmo = new Quicksort();
      Vector<Integer> ordenado = new Vector<Integer>();
      Collections.addAll(ordenado, 1, 3, 31, 42, 55,328,400);
      Vector<Integer> desordenado = new Vector<Integer>();
      Collections.addAll(desordenado, 42, 1, 3, 400, 55,31,328);
      algoritmo.sort(desordenado, 0, desordenado.size()-1);
      assertEquals(ordenado,desordenado);
	}
          @Test
 	 public void testEvalute2() {
	
     Quicksort  algoritmo = new Quicksort();
      Vector<Integer> ordenado = new Vector<Integer>();
      Collections.addAll(ordenado, 1, 2, 3, 4, 5,6,7);
      Vector<Integer> desordenado = new Vector<Integer>();
      Collections.addAll(desordenado, 7, 6, 5, 4, 3,2,1);
      algoritmo.sort(desordenado, 0, desordenado.size()-1);
      assertEquals(ordenado,desordenado);
	}  @Test
         public void testEvalute3() {
	
     Quicksort  algoritmo = new Quicksort();
      Vector<Integer> ordenado = new Vector<Integer>();
      Collections.addAll(ordenado, 1, 2, 3, 4, 5,6,7);
      Vector<Integer> desordenado = new Vector<Integer>();
      algoritmo.sort(desordenado, 0, 0);
    
	}
         
         @Test
         public void testEvalute4() {
	
     Quicksort  algoritmo = new Quicksort();
      Vector<Integer> ordenado = new Vector<Integer>();
      Collections.addAll(ordenado, 1, 2, 3, 4, 5,6,7);
      Vector<Integer> desordenado = new Vector<Integer>();
      algoritmo.sort(null, 0, 0);
    
	}
         
         
}