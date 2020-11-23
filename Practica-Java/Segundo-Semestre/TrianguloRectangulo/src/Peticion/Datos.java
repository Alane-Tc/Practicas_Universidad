/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peticion;
import javax.swing.JOptionPane;
public class Datos {
    public static void main(String[] args) {
        Float CatetoO = Float.parseFloat(JOptionPane.showInputDialog("Digita el valor del cateto Opuesto"));
         Float CatetoA = Float.parseFloat(JOptionPane.showInputDialog("Digita el valor del cateto Adyacente"));
           Formula F = new Formula();
              F.Resultado(CatetoO,CatetoA);
                 JOptionPane.showMessageDialog(null,"El resultado del valor de la hipotenusa es: "+F.rp);
    }}
 