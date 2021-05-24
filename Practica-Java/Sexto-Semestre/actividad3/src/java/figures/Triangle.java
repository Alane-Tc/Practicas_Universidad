/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author alant
 */
public class Triangle {

   private int resultado;
   private int resultPerimeter;

    public void area(String baseTriangle, String heightTriangle){
        int re =Integer.parseInt(baseTriangle)* Integer.parseInt(heightTriangle)/2;
        this.setResultado(re);
    }
    
    public void perimeter(String baseTriangle){
        int p = Integer.parseInt(baseTriangle)*3;
        this.setResultPerimeter(p);
    }
    
     
    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
   
     public int getResultPerimeter() {
        return resultPerimeter;
    }

    public void setResultPerimeter(int resultPerimeter) {
        this.resultPerimeter = resultPerimeter;
    }
    
    
}
