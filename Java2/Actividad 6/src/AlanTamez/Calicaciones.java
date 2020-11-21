package AlanTamez;

import java.util.Scanner;

public class Calicaciones {
    Scanner ent = new Scanner(System.in);
    private String nombre_Alumno;
    private float promedio=0;
    private int[] Cal = new int[5];

     void Digitar_Nombres(){
        System.out.print("Nombre del alumno: ");
        nombre_Alumno=ent.nextLine();
    }

     void Calcular_Promedio(){
        for (int contador=0; contador<5; contador++){
            System.out.print("Calificacion "+(contador+1)+" : ");
            Cal[contador]=ent.nextInt();
            promedio+=Cal[contador]/5;
        }
    }

      String calificacion(){
            if (promedio<=50){
                System.out.print("Calificacion: F");
            }else if (promedio>=51 && promedio<=60){
                System.out.print("Calificacion: E");
            }else if (promedio>=61 && promedio<=70){
                System.out.print("Calificacion: D");
            }else if (promedio>=71 && promedio<=80){
                System.out.print("Calificacion: C");
            }else  if (promedio>=81 && promedio<=90){
                System.out.print("Calificacion: B");
            }else if (promedio>=91 && promedio<=100){
                System.out.print("Calificacion: A");
            }
            return "";
    }

       void Imprimir_Resultados(){
        System.out.println("---------------------------------------------------");
        System.out.println("Nombre del estudiante: "+nombre_Alumno);
        System.out.println("Calificacion 1: "+Cal[0]);
        System.out.println("Calificacion 2: "+Cal[1]);
        System.out.println("Calificacion 3: "+Cal[2]);
        System.out.println("Calificacion 4: "+Cal[3]);
        System.out.println("Calificacion 5: "+Cal[4]);
        System.out.println("El promedio: "+promedio);
        System.out.println(calificacion());
    }


}





