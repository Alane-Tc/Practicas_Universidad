package AlanTamez;

class Operacion{
    int numero1= 30;
    int numero2= 5;
//-------------------

 //Metodo suma
 public int suma(){
   return numero1+numero2;
 }
 //Metodo Resta
 public int resta(){
     return numero1-numero2;
 }
 //Metodo Multiplicacion
public int multiplicacion(){
     return numero1*numero2;
}
    //Metodo Division
    public float Division(){

     return numero1/numero2;
 }
 public String Mostrar_Resultado(){
     System.out.println("*****RESULTADOS*****");
     System.out.println("La Suma Es: " + suma());
     System.out.println("La Resta Es: " +resta());
     System.out.println("La Multiplicación Es: " +multiplicacion());
     System.out.println("La División Es: " + Division());
     return "";
 }
}

public class Main {
    public static void main(String[] args) {
        Operacion Op = new Operacion();
        System.out.println(Op.Mostrar_Resultado());
    }
}
