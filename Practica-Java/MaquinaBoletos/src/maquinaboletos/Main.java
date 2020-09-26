

package maquinaboletos;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
TipoBoleto Persona= new TipoBoleto();       
Scanner sc = new Scanner(System.in);   
char TipoBoleto; 
char boleto = 's';

System.out.println("***********************************************************");        
System.out.println("\tBIENVENIDO A LA FERIA DEL MEZQUITAL");        
System.out.println("***********************************************************");  
//do while 
do
{
System.out.println("Seleccione Que Tipo De Boleto Desea");
System.out.println("Precione La Tecla a Si Desea Un Boleto De Adulto");   
System.out.println("Precione La Tecla n Si Desea Un Boleto De Niño");    
System.out.println("Precione La Tecla i Si Tienes Credencial (Solo adultos)");
System.out.println("Precione La Tecla b Si Desea Un Boleto Para Ancianos");
System.out.print("¿Cual Boleto Desea?: ");
TipoBoleto=sc.next().charAt(0);
if(TipoBoleto=='a'){
System.out.println("");     
Persona.BAdulto();
}
else if (TipoBoleto=='n'){
System.out.println("");    
   Persona.BNiño();
}
if (TipoBoleto=='i'){
System.out.println("");    
  Persona.BAdultoCredencial();
}
else if (TipoBoleto=='b'){
System.out.println("");    
 Persona.BAdultoSinCredencial();
}
System.out.println("");
System.out.print("¿Quieres más Boletos? Presiona s para compar más: ");
boleto=sc.next().charAt(0);
} while (boleto=='s');    
System.out.println("");
System.out.println("GRACIAS POR SU COMPRA DISFRUTE DE LA FERIA");       
    }
}
