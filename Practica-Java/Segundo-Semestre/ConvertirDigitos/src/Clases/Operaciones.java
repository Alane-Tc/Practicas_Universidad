/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.lang.Integer;
public class Operaciones {
    int A;
    Long a;
    String B;
    Long C;
    int Cuadrado;
   public String DOS (int N){
       B=Integer.toOctalString(N);
       return (B);
   }
    public String TRES(int N){
        B= Integer.toHexString(N).toUpperCase();
        return (B);
    }
    public Long CUATRO(Long N){
       while(N!=0){
        C=N%10;
        a=a+C * (int)Math.pow(2,Cuadrado);
        Cuadrado++;
        N=N/ 10;
     }
       return (a);}   
     
    public int CINCO(int N){
        String numero= Integer.toString(N);
        A= Integer.parseInt(numero,8);
        return (A);
    }}
    

