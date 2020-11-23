/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rt9.punto2;

import javax.swing.JOptionPane;

public class Opreaciones {
    
    public int SecuestrarUnicornio(int F,int V,String N){
    int VU=200;
    int PU=43;
      while(V!=0||VU!=0){
          JOptionPane.showMessageDialog(null,"Realizando ataque.....");
          VU=VU-F;
          JOptionPane.showMessageDialog(null,"La vida del unicornio es: "+VU);
          JOptionPane.showMessageDialog(null,"Defenza del unicornio");
          V=V-PU;
          JOptionPane.showMessageDialog(null,"Tu vida restante es: "+V);
          if(V<=0){
              JOptionPane.showMessageDialog(null,"El unicornio escapo");
             System.exit(0);
          }else if(VU<=0){
              JOptionPane.showMessageDialog(null,"Has logrado secuestrar al unicornio");
               System.exit(0);
          }
      }
      return 0;
    }
}
