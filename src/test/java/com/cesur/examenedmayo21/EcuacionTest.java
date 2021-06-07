package com.cesur.examenedmayo21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class EcuacionTest {
    
    private Ecuacion e;
    
    public EcuacionTest() {
        
    }
        
    @Test
    @DisplayName("Evaluar la ecuación para un valor")
    public void testEvaluar() {
        System.out.println("evaluar");
   
        /* Completar */
        Ecuacion e = new Ecuacion(1, 2, 3);
        System.out.println("evaluar");
        assertTrue(e.evaluar(1) != 0);
        assertTrue(e.evaluar(1) > 0);
        assumeTrue(e.evaluar(2) > 0);
        
        assertEquals(e.evaluar(1), 6);
        assertEquals(e.evaluar(2), 11);
        assertEquals(e.evaluar(0), 3);

 

        assertFalse(e.evaluar(0) < -1);
    }



    
 
    
    @Test
    @DisplayName("Resolver ecuación de segundo grado")   
    public void testResolver() {
        System.out.println("Resolver ecuación");
        e = new Ecuacion(1,0,0);        
        e.resolver();
        /* Completar */
        Ecuacion e = null;
        Integer resultado = null;
         System.out.println("Ecuación sin solución");
        e = new Ecuacion(1.0,1.0,1.0);
        resultado= e.resolver();
        
        assertEquals(resultado,0);
        assertNull(e.getSolucion1());
        assertNull(e.getSolucion2());
        
        System.out.println("Ecuación con una única solución");
        e = new Ecuacion(1.0,-2.0,1.0);
        resultado = e.resolver();
        
        assertEquals(resultado,1);
        assertEquals(e.getSolucion1(),1.0,0.001);
        assertNull(e.getSolucion2());
        
        
       
        System.out.println("Ecuación básica de 2 soluciones");
        e = new Ecuacion(5.0,-20.0,10.0);
        resultado = e.resolver();
        
        assertEquals(resultado,2);
        assertEquals(e.getSolucion1(),3.0,0.001);
        assertEquals(e.getSolucion2(),1.0,0.001);
        
        System.out.println("Ecuación sin termino independiente");
        e = new Ecuacion(6.0,-6.0,0.0);
        resultado = e.resolver();        

        assertEquals(resultado,2);
        assertEquals(e.getSolucion1(),1.0,0.001);
        assertEquals(e.getSolucion2(),0.0,0.001);
        
        System.out.println("Sin ecuación");
        e = new Ecuacion(0.0,0.0,5.0);
        resultado = e.resolver();        

        assertEquals(resultado,0);
        assertNull(e.getSolucion1());
        assertNull(e.getSolucion2());  
        
    
        }
 
}

