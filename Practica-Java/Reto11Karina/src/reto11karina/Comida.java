/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto11karina;

public class Comida {
    public boolean esPicantes;
    private int nivelSabor=10;
    private int nivelPicante=1;
    String nombre;
    private String ingredientes[]={"\n-Tortilla"+"\n-Frijoles"+"\n-Queso"+"\n-Carne"+"\n-Crema"+"\n-Salsa"};
    
    
    public void mostrarIngredientes(){
        System.out.println("Burrito\n"+"\nNivel de sabor: "+nivelSabor+"\n"+"\nIngredientes: ");
      
    for(int x=0;x<ingredientes.length;x++){
        System.out.println(ingredientes[x]);
       
    }
   System.out.println("");
    }
    
   public boolean esPicante(){
      if(nivelPicante<=3){
          esPicantes=false;
         return(esPicantes);
      }
      else
         return(esPicantes);
   } 
   public void ImprimirP(){
       if(esPicantes=false){
           System.out.println("No es picante");
       }else
           System.out.println("Si es picante");
   }
}
