
package rt9;

import javax.swing.JOptionPane;
public class Rt9 {

    public static void main(String[] args) {
      
   //Variables declaradas: ----------------------------------------------------------------------------------------------------------------------------------------->
   String NombreMascota;
   String Alimento;
   int VidaMascota; 
   int NoComida=0;
   int Comida=0;
   char Digito;
   boolean Comprobante;
   
   //Asignacion de valores a las variables: ------------------------------------------------------------------------------------------------------------------------>
   
   NombreMascota=String.format(JOptionPane.showInputDialog("Cual sera el nombre de tu mascota digital?"));
   VidaMascota=Integer.parseInt(JOptionPane.showInputDialog("Cuanta vida tendra tu mascota?"));
   Alimento=String.format(JOptionPane.showInputDialog("Dame de comer letras, si me das numeros me lastimas"));
  
   
   //Se crea un ciclo for para comprobar que cada caracter de la cadena string sea una letra y no un numero: ------------------------------------------------------->
        
   for(int x=0;x<Alimento.length();x++){
           
   Digito=Alimento.charAt(x);
   Comprobante= Character.isDigit(Digito);
   //Si es comida de cumple el if: --------------------------------------------------------------------------------------------------------------------------------->
   
   if(Comprobante==false){
   JOptionPane.showMessageDialog(null,"Gracias por alimentarme");
   Comida++;
   VidaMascota=VidaMascota+20; 
   //Si no es comida se cumple el else if: ------------------------------------------------------------------------------------------------------------------------->
   
   }else if(Comprobante==true){
      NoComida++;
   VidaMascota=VidaMascota-33;
   JOptionPane.showMessageDialog(null,"No es comida!"); 
   }
     }
   //Se comprueba que hayan sido mas alimentos que cosas diferentes, para poder mandar el mensaje correspondiente:-------------------------------------------------->
   
    if (NoComida>Comida){
    JOptionPane.showMessageDialog(null,"Oye cuidame!, COMIDA="+Comida+" NO COMIDA="+NoComida);
    }else if(Comida>NoComida){
    JOptionPane.showMessageDialog(null,"Gracias por cuidarme!, COMIDA="+Comida+" NO COMIDA="+NoComida);
    }else if(Comida==NoComida){
    JOptionPane.showMessageDialog(null,"Eres bueno pero debes mejorar!, COMIDA="+Comida+" NO COMIDA="+NoComida);
        } 
      //Finaliza el programa arrojando los resultados del cuidado de la mascota: ----------------------------------------------------------------------------------->
    }
    
}
