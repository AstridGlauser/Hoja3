/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import java.util.Collections;
import java.util.Vector;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author imarg
 */
public class REDIXIT {
          @Test
 	 public void testEvalute() {
	
     radixSort  algoritmo = new radixSort();
      Vector<Integer> ordenado = new Vector<Integer>();
      Collections.addAll(ordenado, 1, 3, 31, 42, 55,328,400);
      Vector<Integer> desordenado = new Vector<Integer>();
      Collections.addAll(desordenado, 42, 1, 3, 400, 55,31,328);
      algoritmo.sort(desordenado, desordenado.size(), 0);
      assertEquals(ordenado,desordenado);
	}
          @Test
 	 public void testEvalute2() {
	
     radixSort  algoritmo = new radixSort();
      Vector<Integer> ordenado = new Vector<Integer>();
      Collections.addAll(ordenado, 1, 2, 3, 4, 5,6,7);
      Vector<Integer> desordenado = new Vector<Integer>();
      Collections.addAll(desordenado, 7, 6, 5, 4, 3,2,1);
      algoritmo.sort(desordenado, desordenado.size(), 0);
      assertEquals(ordenado,desordenado);
	}  @Test
         public void testEvalute3() {
	
     radixSort  algoritmo = new radixSort();
      Vector<Integer> ordenado = new Vector<Integer>();
      Collections.addAll(ordenado, 1, 2, 3, 4, 5,6,7);
      Vector<Integer> desordenado = new Vector<Integer>();
      algoritmo.sort(desordenado, 0, 0);
    
	}
         
         	  @Test
         public void testEvalute4() {
	
     radixSort  algoritmo = new radixSort();
      Vector<Integer> ordenado = new Vector<Integer>();
      Collections.addAll(ordenado, 1, 2, 3, 4, 5,6,7);
      Vector<Integer> desordenado = new Vector<Integer>();
      algoritmo.sort(null, desordenado.size(), 0);
    
	}
         
}