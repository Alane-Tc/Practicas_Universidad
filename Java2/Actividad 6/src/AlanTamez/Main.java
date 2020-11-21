package AlanTamez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Calicaciones cl = new Calicaciones();
        cl.Digitar_Nombres();
        cl.Calcular_Promedio();
        cl.Imprimir_Resultados();
    }
}
