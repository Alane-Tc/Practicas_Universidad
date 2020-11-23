/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karynap2;

import javax.swing.JOptionPane;
public class KarynaP2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Select=Integer.parseInt(JOptionPane.showInputDialog("Selecciona el modo de juego deseado\n"+
                "1=FACIL\n"+
                "2=MEDIO\n"+
                "3=DIFICIL"));
        
        switch(Select){
            case 1:
                int vidas=10;
              int contador=1;
             for(int i=0;i<=vidas;i++){
                 String facil[]={"c","a","m","a"};
                 String Respuestas[];
                 Respuestas=new String[4];
                 
                 String Letra=String.format(JOptionPane.showInputDialog("Ingresa una letra"));
                 if("c".equals(Letra)){
                     JOptionPane.showMessageDialog(null,"c-X-X-X");
                     Respuestas[0]=Letra;
                     
                 }else if("a".equals(Letra)){
                     JOptionPane.showMessageDialog(null,"X-a-X-a");
                     Respuestas[1]=Letra;
                     Respuestas[3]=Letra;
                 }else if("m".equals(Letra)){
                     JOptionPane.showMessageDialog(null,"X-X-m-X");
                     Respuestas[2]=Letra;
                 }else{
                     
                     JOptionPane.showMessageDialog(null,"Intentalo de nuevo "+"cantidad de intentos disponibles: "+(vidas-contador));
                 }
             
                 
                 contador++;  
              
             }
                
                break;
            
            case 2:
                
                int vd=10;
              int cont=1;
             for(int i=0;i<=vd;i++){
                 String Medio[]={"c","o","m","p","a","s"};
                 String RespuestasM[];
                 RespuestasM=new String[6];
                 
                 String Letr=String.format(JOptionPane.showInputDialog("Ingresa una letra"));
                 if("c".equals(Letr)){
                     JOptionPane.showMessageDialog(null,"c-X-X-X-X-X");
                     RespuestasM[0]=Letr;
                     
                 }else if("o".equals(Letr)){
                     JOptionPane.showMessageDialog(null,"X-o-X-X-X-X");
                     RespuestasM[1]=Letr;
                 }else if("m".equals(Letr)){
                     JOptionPane.showMessageDialog(null,"X-X-m-X-X-X");
                     RespuestasM[2]=Letr;
                 }else if("p".equals(Letr)){
                     JOptionPane.showMessageDialog(null,"X-X-X-p-X-X");
                     RespuestasM[3]=Letr;
                 }else if("a".equals(Letr)){
                     JOptionPane.showMessageDialog(null,"X-X-X-X-a-X");
                     RespuestasM[4]=Letr;
                 }else if("s".equals(Letr)){
                     JOptionPane.showMessageDialog(null,"X-X-X-X-X-s");
                     RespuestasM[5]=Letr;
                 }
                 else{
                     
                     JOptionPane.showMessageDialog(null,"Intentalo de nuevo "+"cantidad de intentos disponibles: "+(vd-cont));
                 }
             
                 cont++;  
              
             }
                
                break;
                
            case 3:
                 int vda=10;
              int conta=1;
             for(int i=0;i<=vda;i++){
                 String Dificil[]={"c","h","a","l","e","c","o","s"};
                 String RespuestasD[];
                 RespuestasD=new String[8];
                 
                 String L=String.format(JOptionPane.showInputDialog("Ingresa una letra"));
                 if("c".equals(L)){
                     JOptionPane.showMessageDialog(null,"c-X-X-X-X-X-X-X");
                     RespuestasD[0]=L;
                     RespuestasD[5]=L;
                     
                 }else if("h".equals(L)){
                     JOptionPane.showMessageDialog(null,"X-h-X-X-X-X-X-X");
                     RespuestasD[1]=L;
                 }else if("a".equals(L)){
                     JOptionPane.showMessageDialog(null,"X-X-a-X-X-X-X-X");
                     RespuestasD[2]=L;
                 }else if("l".equals(L)){
                     JOptionPane.showMessageDialog(null,"X-X-X-l-X-X-X-X");
                     RespuestasD[3]=L;
                 }else if("e".equals(L)){
                     JOptionPane.showMessageDialog(null,"X-X-X-X-e-X-X-X");
                     RespuestasD[4]=L;
                 }else if("o".equals(L)){
                     JOptionPane.showMessageDialog(null,"X-X-X-X-X-X-o-X");
                     RespuestasD[6]=L;
                 }else if("s".equals(L)){
                     JOptionPane.showMessageDialog(null,"X-X-X-X-X-X-X-s");
                     RespuestasD[7]=L;
                 }
                 
                 
                 else{
                     
                     JOptionPane.showMessageDialog(null,"Intentalo de nuevo "+"cantidad de intentos disponibles: "+(vda-conta));
                 }
             
                 conta++;  
              
             }
                break;
                
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
