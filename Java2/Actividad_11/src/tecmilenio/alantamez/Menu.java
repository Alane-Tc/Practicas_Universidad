package tecmilenio.alantamez;

import java.util.Scanner;

public class Menu {
    Scanner ent = new Scanner(System.in);

    int menu =0;
    double Ulado;
    double Altura;
    int calc;

    private void ShowMenu(){
        System.out.println("\t Bienvenid@ Usuario!" +
                "\n Selecciona una Figura"+"\n 1- Círculo"+
                "\n 2- Cuadrado."+ "\n 3- Triángulo"+
                "\n 4- Romboide"+
                "\n 5- Salir del programa");
    }

    private void ask(){
        System.out.print("Digite una opcion: ");
         menu = ent.nextInt();
    }


    public void Show_Switch(){
        ShowMenu();
        ask();
       switch (menu){
           case 1:
              division();
               System.out.println("Eligió el círculo");
              askCalculate();
               if (calc ==1){
                   division();
                   messageArea();
                   System.out.print("Digite el radio del círculo: ");
                    Ulado = ent.nextDouble();
                    showAreaCircle();
               }else if (calc == 2){
                   division();
                   messagePerimeter();
                   System.out.print("Digite el radio del circulo: ");
                   Ulado = ent.nextDouble();
                   showPerimeterCircle();
               }else if (calc >2){
                   System.out.println("Esta opción no existe ");
               }
               break;
//-------------------------------------------
           case 2:
               division();
               System.out.println("Eligió el cuadrado");
               askCalculate();
               if (calc ==1){
                   division();
                   messageArea();
                   System.out.print("Digite el lado del cuadrado: ");
                   Ulado = ent.nextDouble();
                   showAreaSquare();
               }else if (calc == 2){
                   division();
                   messagePerimeter();
                   System.out.print("Digite el lado del cuadrado: ");
                   Ulado = ent.nextDouble();
                   showPerimeterSquare();
               }else if (calc >2){
                   System.out.println("Esta opción no existe ");
               }
               break;
//-------------------------------------------
           case 3:
               division();
               System.out.println("Eligió el triángulo");
               askCalculate();
               if (calc ==1){
                   division();
                   messageArea();
                   System.out.print("Digite la Base del triángulo: ");
                   Ulado = ent.nextDouble();
                   System.out.print("Digite la Altura del triángulo: ");
                   Altura = ent.nextDouble();
                   showAreaTriangle();
               }else if (calc == 2){
                   division();
                   messagePerimeter();
                   System.out.print("Digite el Lado del triángulo: ");
                   Ulado = ent.nextDouble();
                   showPerimeterTriangle();
               }else if (calc >2){
                   System.out.println("Esta opción no existe ");
               }
               break;
//-------------------------------------------
           case 4:
               division();
               System.out.println("Eligió el romboide");
               askCalculate();
               if (calc ==1){
                   division();
                   messageArea();
                   System.out.print("Digite la base del romboide: ");
                   Ulado = ent.nextDouble();
                   System.out.print("Digite la altura del romboide: ");
                   Altura = ent.nextDouble();
                   showAreaHexagon();
               }else if (calc == 2){
                   division();
                   messagePerimeter();
                   System.out.print("Digite la base del romboide: ");
                   Ulado = ent.nextDouble();
                   System.out.print("Digite la altura del romboide: ");
                   Altura = ent.nextDouble();
                   showPerimeterHexagon();
               }else if (calc >2){
                   System.out.println("Esta opción no existe ");
               }
               break;
//-------------------------------------------
           case 5:
               break;

           default:
               System.out.println("No existe esta opcion");
               break;
       }
    }

    private void division(){
        System.out.println("------------------------------------------------------");
    }

    private void messageArea(){
        System.out.println("Eligió Calcular El Área");
    }

    private void messagePerimeter(){
        System.out.println("Eligió Calcular El Perímetro");
    }

    private void askCalculate(){
        System.out.print("Digite (1) Si quiere calcular área o digite (2) Si quiere calcular el perimetro: ");
         calc = ent.nextInt();
    }

    private void showAreaCircle(){
        Cicle circle = new Cicle(Ulado);
        System.out.println("Área del círculo: "+circle.getArea());
    }

    private void showPerimeterCircle(){
        Cicle circle = new Cicle(Ulado);
        System.out.println("Perímetro del circulo: "+ circle.getPerimeter());
    }

    private void showAreaSquare(){
        Square square = new Square(Ulado);
        System.out.println("Área del cuadrado "+square.getArea());
    }

    private void showPerimeterSquare(){
        Square squere = new Square(Ulado);
        System.out.println("Perímetro del cuadrado "+squere.getPerimeter());
    }

    private void showAreaTriangle(){

        Triangle triangle = new Triangle(Ulado ,Altura);
        System.out.println("Área del Triangulo Equilatero "+triangle.getArea());
    }

    private void showPerimeterTriangle(){
        Triangle triangle = new Triangle(Ulado,Altura);
        System.out.println("Perímetro del Triangulo Equilatero "+triangle.getPerimeter());
    }

    private void showAreaHexagon(){
        Rhomboid rhomboid = new Rhomboid(Ulado, Altura);
        System.out.println("Área del romboide: "+rhomboid.getArea());
    }

    private void showPerimeterHexagon(){
        Rhomboid rhomboid = new Rhomboid(Ulado, Altura);
        System.out.println("Perímetro del romboide: "+rhomboid.getPerimeter());
    }
}
