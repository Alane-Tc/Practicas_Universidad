/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto11karina2;

public class Reto11Karina2 {

    public static void main(String[] args) {
        // TODO code application logic here
Principe Prn=new Principe();
Prn.IngresoPrincipe("Augusto",23,1.85);
Prn.Busqueda("Augusto",23,1.85);
if(Prn.T==true){
    System.out.println("Principe encontrado");
    System.exit(0);
}else
{System.out.println("Seguiremos buscando");
Prn.Busqueda("Guillermo",33,1.75);}
if(Prn.T==true){
    System.out.println("Principe encontrado");
    System.exit(0);
}else
    System.out.println("El principe no se encuentra en este grupo de personas");
    
    
    
    
    }
     
}
