/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karynap1;
import javax.swing.JOptionPane;
/**
 *
 * 
 */
public class KarynaP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   double contador=1;
        String arregloString[];
        char arregloChar[];
       
       
        int cantidad= Integer.parseInt(JOptionPane.showInputDialog("Cuantos nombre deseas ingresar en el arreglo string?"));
        arregloString=new String[cantidad];
        arregloChar=new char[cantidad];
        
        for(int i=0;i<cantidad;i++){
            arregloString[i]=JOptionPane.showInputDialog("Ingresa el nombre de la persona num: "+contador+" en el arreglo string");
            int x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la persona, en arreglo char"));
            char n=(char)x;
            arregloChar[i]=n;
            contador++;
        }
     for(int p=0;p<cantidad;++p){
     JOptionPane.showMessageDialog(null,"El nombre de la persona es: "+arregloString[p]);
     JOptionPane.showMessageDialog(null,"La edad de la persona es: "+arregloChar[p]);
     
     }
      JOptionPane.showMessageDialog(null,"La cantidad de datos ingresados fueron: "+cantidad*2);
     }
    
    }

    

