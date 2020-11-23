
package maquinaboletos;


public class TipoBoleto {
   char Niño;
   char Adulto;
   char AdultoMayorCredencial;
   char Abuelo; 
  
 public void BNiño (){
 System.out.println("El Boleto Del Niño Tiene Precio De $70MX"+this.Niño);
 }  
 public void BAdulto(){
 System.out.println("El Boleto De Adulto Tiene Precio De $100MX"+this.Adulto);     
 } 
public void BAdultoCredencial(){
System.out.println("Los Adultos Que Tienen La Credencial INAPAM Tiene Precio De $50MX"+this.AdultoMayorCredencial);    
}   
public void BAdultoSinCredencial(){
System.out.println("Adulto Mayor Sin Credencial Cuestan Lo Mismo Que Uno De Niño."+this.Abuelo);    
}   
    
}
