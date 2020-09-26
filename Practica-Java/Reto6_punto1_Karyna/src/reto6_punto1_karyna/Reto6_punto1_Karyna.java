/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto6_punto1_karyna;
import javax.swing.JOptionPane;
/**
 *
 * @author Karyna
 */
public class Reto6_punto1_Karyna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres[];
        int contador=1;
        int contador2=1;
        int cantidaddatos=Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de datos (nombres) que desea ingresar"));
        nombres=new String[cantidaddatos];
        for(int i=0;i<cantidaddatos;i++){
            
            nombres[i]=JOptionPane.showInputDialog("Ingresa el nombre numero "+contador);
            contador++;
        }
    for(int y=0;y<cantidaddatos;y++){
        JOptionPane.showMessageDialog(null,"Nombre ingresado numero "+contador2+"= "+nombres[y]);
    contador2++;
    }
    }
}
