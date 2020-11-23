/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto11karina2;

public class Principe {
    String nombre;
    int edad;
    double altura;
    boolean T;
    
    public void IngresoPrincipe(String N,int E,double A){
        this.nombre=N;
        this.edad=E;
        this.altura=A;
    }
    public boolean Busqueda(String N,int E, double A){
        if(this.nombre.equals(N)&&this.edad==E&&this.altura==A){
            this.T=true;
            return(T);
        }
        else{
            this.T=false;
        return(T);}
    
}
}