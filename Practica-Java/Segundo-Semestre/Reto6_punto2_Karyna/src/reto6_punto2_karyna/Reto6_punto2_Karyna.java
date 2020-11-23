/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto6_punto2_karyna;

/**
 *
 * @author Karyna
 */
public class Reto6_punto2_Karyna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String Tabla[][]={{"Productos ","Enero/Marzo ","Abril/Junio ","Julio/Septiembre ","Octubre/Diciembre "},{"Chocolate ","    111 ","        483 ","         471 ","              427 "},{"Vinilla ","      192","         500 ","         355 ","              158 "},{"Fresa         ","289 ","        470 ","         474 ","              160 "},{"Oreo          ","415         ","114          ","161               ","308 "}};
   for(int i=0;i<=4;i++){
       for(int y=0;y<=4;y++){
           System.out.print(Tabla[i][y]);
       }
     System.out.print("\n");
   }
   //otra opcion que podria implementarse para imprimir
    //for(int y=0;y<=cantidad;y++){
   //  JOptionPane.showMessageDialog(null,"Los nombres agregados fueron "+nombres[y]);
   System.out.println("El trimestre en el cual se vendio mas el sabor chocolate es Abril / Junio  con:"+Tabla[1][2]);
   System.out.println("El trimestre en el cual se vendio mas el sabor vainilla es Abril / Junio  con:"+Tabla[2][2]); 
    System.out.println("El trimestre en el cual se vendio mas el sabor fresa es Julio / Septiembre  con:"+Tabla[3][3]);
     System.out.println("El trimestre en el cual se vendio mas el sabor oreo es Enero / Marzo  con:              "+Tabla[4][1]);
    }
 
}
