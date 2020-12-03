package tecmilenio.alantamez;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    List<String> strings = new ArrayList<>();
    public static void main(String[] args) {
        Main main = new Main();
        main.loadStrings(
                "CapitanAmerica",
                "Spiderman",
                "IronMan",
                "AntMan",
                "BlackPanther",
                "Hulk",
                "Thor",
                "Thanos",
                "Groot",
                "SilverSurfer");

        int menuInit = Integer.parseInt(JOptionPane.showInputDialog("\t Bienvenid@" +
                "\n Selecciona una opción"+"\n 1- Ordenar Lista Por Orden Alfabético"+
                "\n 2- Ordenar Lista Por Longitud"));
        if (menuInit == 1){
            //Alphabetic
            var sortAlphabeticByAnonymousClass = main.sortAlpabheticAnonymousClass();
            var sortAlphabeticByLamda = main.sortAlpabheticLambaFunction();
            var sortAlphabeticByReference = main.sortAlpabheticReference();
            main.alphabeticAnonymousClass();
            main.Div();
            main.showList(sortAlphabeticByAnonymousClass);
            main.Div();
            main.alphabeticLamba();
            main.showList(sortAlphabeticByLamda);
            main.Div();
            main.alphabetiReference();
            main.showList(sortAlphabeticByReference);
        }else if (menuInit == 2){
            //Lengtht
            var sortLenghtAnonymousClass = main.sortLenghtAnonymousClass();
            var sortLenghtLambaFunction = main.sortLenghtLambaFunction();
            var sortLenghtReference = main.sortLenghtReference();
            main.Div();
            main.lengthAnonymousClass();
            main.showList(sortLenghtAnonymousClass);
            main.Div();
            main.lengthLamba();
            main.showList(sortLenghtLambaFunction);
            main.Div();
            main.lengthReference();
            main.showList(sortLenghtReference);
        }else if (menuInit >=3){
            JOptionPane.showMessageDialog(null,"Lo sentimos esta opcion no existe");
        }

    }

    public void alphabeticAnonymousClass(){
        System.out.println("Orden alfabético: Clase anónima");
    }

    public void alphabeticLamba(){
        System.out.println("Orden alfabético: Expreción Lambda");
    }

    public void alphabetiReference(){
        System.out.println("Orden alfabético: Método De Referencia.");
    }

    public void Div(){
        System.out.println("----------------------------------------");
    }

    public void lengthAnonymousClass(){
        System.out.println("Longitud: Clase anónima");
    }

    public void lengthLamba(){
        System.out.println("Longitud: Expreción Lambda");
    }

    public void lengthReference(){
        System.out.println("Longitud: Método De Referencia.");
    }

    public void loadStrings(String...strings){
        for (var string : strings) this.strings.add(string);
    }

    public List<String> sortAlpabheticAnonymousClass(){
        List<String> strings = this.strings;
        Collections.sort(strings ,new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareToIgnoreCase(str2);
            }
        });
        return strings;
    }

    public List<String> sortAlpabheticLambaFunction(){
        List<String> strings = this.strings;
        strings.sort((str1,str2) -> str1.compareToIgnoreCase(str2));
        return  strings;
    }

    public List<String> sortAlpabheticReference(){
        List<String> strings = this.strings;
        SortAlphabetic sortAlphabetic = new SortAlphabetic();
        Collections.sort(strings,sortAlphabetic::compare);
        return  strings;
    }

    public List<String> sortLenghtAnonymousClass(){
        List<String> strings = this.strings;
        strings.sort( new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        });
        return strings;
    }

    public List<String> sortLenghtLambaFunction(){
        List<String> strings = this.strings;
        Collections.sort(strings,(str1,str2) ->  str1.length() - str2.length());
        return  strings;
    }

    public List<String> sortLenghtReference(){
        List<String> strings = this.strings;
        SortLenght sortLenght = new SortLenght();
        strings.sort(sortLenght::compare);
        return  strings;
    }


    public void showList(List<String> list){
        list.forEach(System.out::println);
    }
}

class SortAlphabetic implements Comparator{

    public static int sort(Object o, Object o1) {
        return o.toString().compareToIgnoreCase(o1.toString());
    }

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareToIgnoreCase(o2.toString());
    }
}

class SortLenght implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().length() - o2.toString().length();
    }
}



