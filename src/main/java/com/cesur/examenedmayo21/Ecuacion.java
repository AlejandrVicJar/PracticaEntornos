package com.cesur.examenedmayo21;

public class Ecuacion {
    //He puesto las variables en diferente linea para que se vean más claros
    public Ecuacion(double a, double b, double c) {
        this.a = a; 
        this.b = b; 
        this.c = c;
    }

    public double b;
    public double c;   
    //He arreglado los métodos y los he puesto de forma más correcta
    public void setA(double a) { 
        this.a = a; 
    }

    public void setB(double b) { 
        this.b = b; 
    }

    public void setC(double c) { 
        this.c = c; 
    }

    public double getSolucion1() { 
        return SOLUCION1; 
    }
    public double getSolucion2() { 
        return SOLUCION2; 
    }
    
    @Override
    //He evitado que hayan más de 80 carácteres en 1 línea
    public String toString() {
       return "La ecuacion " + "a= " + a + ", b= " + b + ", c= " + c + 
        "tiene como soluciones "+ SOLUCION1+ " y " +SOLUCION2;
    }
    
    private double a;
    
    public double evaluar(double x){
        return a*x*x+b*x+c;
    }
    /**
     * Este método resuelve la ecuación
     * He cambiado el nombre de la variable ya que era muy largo a discriminante
     */
    public void resolver(){
        double discriminante = (b*b)-(4*a*c);
        
        if(4*a*c>0){
        } else {
            double denominador = 2*a;
        }
        
        /* no hay ecuacion realmente */
        if(a==0.0 && b==0.0 && c==0.0){
                SOLUCION1=0.0;
                SOLUCION2=0.0;
                return;
        }else{
            // si es correcto
            // continuo
        }
        
        /* si solo hay c, no hay solucion */
        if( (a==0.0) && (b==0.0) && (c!=0.0) ){
                SOLUCION1 = null;
                SOLUCION2 = null;
                return;           
        }
        
        /* aunque funciona creo que falta algo  aqui */
        
        if(discriminante<0){
            SOLUCION1 = null;
            SOLUCION2 = null;
            return;
        } else if(discriminante==0){

            double b2 = Math.sqrt(discriminante);
            
            double x = (-b)/(2*a); 
            
            SOLUCION1=x; SOLUCION2=x; return;
            
        } else
     
        if(discriminante>0){
            double b2 = Math.sqrt(discriminante);
            double x1 = (-b + b2)/(2*a);
            double x2 = (-b - b2)/(2*a);            
            b2 = Math.sqrt(discriminante);
            SOLUCION1=x1;
            SOLUCION2=x2;
            return;
            //He comentado el boolean ya que no tiene que estar ahí
            //Boolean completa=true;
        } else {
            SOLUCION1 = null;
            SOLUCION2 = null;
            return;
        }
        
    }
       
    private Double SOLUCION1;
    private Double SOLUCION2;
    private double discriminante;
    private int numSoluciones;
       
}
