/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto10ky.p2;
import java.util.Random;

public class Personal {
    int Ojos;
    String Piel;
    float Altura;
    int NvlCrear;
    int NvlReparar;
    int NvlDestructivo;
    Random Aleatorio=new Random(System.currentTimeMillis());
    public void definirOjos(){
        Ojos=1+Aleatorio.nextInt(2);
    }
    public void definirPiel(){
        int piel=1+Aleatorio.nextInt(2);
        switch(piel){
            case 1:
                Piel="Amarrilla";
                break;
            case 2:
                Piel="Morado";
        }
    }
    public void definirAltura(){
        Altura=1.45f+Aleatorio.nextFloat();
    }
    public void Crear(){
        NvlCrear=1+Aleatorio.nextInt(5);
    }
    public void Reparar(){
        NvlReparar=1+Aleatorio.nextInt(5);
    }
    public void Destructivo(){
        NvlDestructivo=1+Aleatorio.nextInt(5);
    }
    public void Imprimir(){
        System.out.println("Cantidad de ojos="+Ojos);
                System.out.println("Color de piel="+Piel);
                        System.out.println("Altura="+Altura);
                                System.out.println("Nivel de creacion="+NvlCrear);
                                        System.out.println("Nivel de reparacion="+NvlReparar);
                                                System.out.println("Nivel destructivo="+NvlDestructivo);
        
    }
}
