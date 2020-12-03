package tecmilenio.alantamez;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner entrada = new Scanner(System.in);
    int menu;
    boolean continue_software = true;
    AddressBook contact = new AddressBook();

    private void showMenu(){
        System.out.println("\t Bienvenid@ a My Friends" +
                "\n Selecciona una opción"+"\n 1- Mostrar Contactos"+
                "\n 2- Crear Contacto"+ "\n 3- Eliminar Contacto");
    }
    
    public void Menu() throws IOException {

        do{
            showMenu();
            System.out.print("Digite la opción: ");
            menu = entrada.nextInt();
            div();
            switch (menu){
                case 1:
                    System.out.println("Eligió Mostrar Contactos");
                    showContact();
                    div();
                    break;

                case 2:
                    System.out.println("Eligió Crear Contactos");
                    addContact();
                    div();
                    break;

                case 3:
                    System.out.println("Eligió Eliminar Contactos");
                    removeContact();
                    div();
                    break;

                default:
                    System.out.println("Opción no valida");
                    continue_software = false;
                    break;
            }

        }while (continue_software);

    }

    private void showContact() throws IOException {
        contact.list();
    }

    private void addContact() throws IOException {
        System.out.print("¿Cuál es su nombre?: ");
        var name_person = entrada.next();
        System.out.print("¿Cuál es su Apellido?: ");
        var lastname_person = entrada.next();
        System.out.print("¿Cuál es su Teléfono: ");
        var phone_person = entrada.next();
        contact.create(name_person,phone_person, lastname_person);
    }

    private void removeContact() throws IOException {
        System.out.print("¿Cuál es su Teléfono: ");
        var remove_person = entrada.next();
        contact.delete(remove_person);
    }

    private void div(){
        System.out.println("-----------------------------");
    }

}
