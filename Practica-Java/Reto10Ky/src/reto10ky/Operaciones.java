/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto10ky;

import java.util.Random;

public class Operaciones {
Random Rd=new Random(System.currentTimeMillis());

String color;
int rapidez=1+Rd.nextInt(300);
int poder=1+Rd.nextInt(100);
int Color;
int Rapidez;
int Poder;

public void Color(){
    Color=1+Rd.nextInt(4);
    
    
    switch(Color){
        case 1:
            color="Rosa";
            break;
        case 2:
            color="Azul";
            break;
        case 3:
            color="Morado";
            break;
        case 4:
            color="Verde";
        
    }
}


public void disminuirRapidez(){
    Rapidez=rapidez-Rd.nextInt(30);
}


public void aumentarPoder(){
    Poder=poder-Rd.nextInt(10);
}

public void Imprimir(){
    System.out.println("El color del unicornio es="+color);
        System.out.println("Su rapidez inicial es="+rapidez);
            System.out.println("Su poder inicial es="+poder);
                System.out.println("Su rapidez disminuyo a="+Rapidez);
                    System.out.println("Su poder aumento a="+Poder);




}





    }   

