/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.Date;
import javax.swing.JOptionPane;
public class Seleccion {
    public static void main(String[] args) {
      String Opcion;
       Integer S;
      
        do{   
                   S= Integer.parseInt(JOptionPane.showInputDialog("Tipos de conversiones\n"+
                           "1-Decimal (A) Binario\n"+"2-Decimal (A) Octal\n"+"3-Decimal (A) Hexadecimal\n"+"4-Binario (A) Decimal\n"+"5-Octal (A) Decimal\n"+"6-Hexadecimal (A) Decimal\n"));
                   Operaciones O = new Operaciones();
                   switch(S){
                       case 1:
                           //TERMINAR 
                       break;
                       
                       case 2:
                           int B=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero\n"));
                          O.DOS(B);
                          JOptionPane.showMessageDialog(null,"octal es: "+O.B);
                       break;
                               case 3:
                                  int C= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero\n"));
                                        O.TRES(C);
                                          JOptionPane.showMessageDialog(null,"hexadecimal es: "+O.B);
                                               break;
                       
                                                     case 4:
                                                       Long D= Long.parseLong(JOptionPane.showInputDialog("Ingresa el numero\n"));
                                                         O.CUATRO(D);
                                                            JOptionPane.showMessageDialog(null,"decimal es: "+O.a);
                                                                 break;
                       
                                                                   case 5:
                                                                        int Nro= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero\n"));
                                                                             O.CINCO(Nro);
                                                                                 JOptionPane.showMessageDialog(null,"decimal es: "+O.A);
                                                                                   break;
                                                                                     case 6:
                                                                                         //TERMINAR
                                                                                       break;
                           
                                             }Opcion= String.format(JOptionPane.showInputDialog("Otra consulta?_Si_No"));
                                                       }while("SI".equals(Opcion)||"si".equals(Opcion));
    }
}
