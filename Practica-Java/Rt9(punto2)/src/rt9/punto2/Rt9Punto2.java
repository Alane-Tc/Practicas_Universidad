/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rt9.punto2;
import javax.swing.JOptionPane;
import java.util.Random;
public class Rt9Punto2 {

    public static void main(String[] args) {
     Random Rd = new Random(System.currentTimeMillis());
      
      String Nombre=String.format(JOptionPane.showInputDialog("Ingresa tu nombre"));
      int NivelFuego=Rd.nextInt(70);
      int NivelVida=Rd.nextInt(300);
      Opreaciones op=new Opreaciones();  
        op.SecuestrarUnicornio(NivelFuego, NivelVida, Nombre);
    }
    
}
