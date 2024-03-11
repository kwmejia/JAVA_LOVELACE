import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventario objInventario = new Inventario();
        Scanner objScaner = new Scanner(System.in);
        int option = 0 ;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Agregar un nuevo producto");
            System.out.println("2. Buscar un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Listar el inventario");
            System.out.println("5. Salir");


            option = objScaner.nextInt();
        }while (option != 5);
    }
}