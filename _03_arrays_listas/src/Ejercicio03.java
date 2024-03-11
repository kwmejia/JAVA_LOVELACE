import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
      /*  3. Sistema de Reservas: Desarrolla un programa para un teatro para gestionar las
        reservas de asientos. El teatro tiene 5 filas con 10 asientos cada una. Utiliza un
        arreglo bidimensional de boolean donde true representa un asiento ocupado y false
        uno disponible. El sistema debe permitir:
         Reservar y cancelar asientos.
         Mostrar los asientos disponibles.
         Contabilizar el total de asientos ocupados y disponibles.*/

        //Matriz para guardar la lista de los asientos del teatro
        //Guardará 10 asientos por cada fila (en total 5 filas)
        boolean[][] listaAsientos = new boolean[5][10];

        //Creamos nuestro objeto Scanner para poder obtener informacion de la consola
        Scanner objScanner = new Scanner(System.in);

        int option = 0;

        do {
            //NextLine o Next sin asignar a una variable cumple la función de limpiar el bufer de entrada
            objScanner.nextLine();
            System.out.println("\nENTER PARA CONTINUAR ...");
            objScanner.nextLine();

            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Reservar asiento.");
            System.out.println("2. Cancelar asiento.");
            System.out.println("3. Mostrar asientos disponibles.");
            System.out.println("4. Contabilizar el total de asientos ocupados y disponibles.");
            System.out.println("5. Salir.");
            System.out.println("Ingresa una opción: ");

            option = objScanner.nextInt();

            switch (option) {
                case 1: //Reservar asientos
                    System.out.println("Ingresa la fila (1-5)");
                    int fila = objScanner.nextInt() - 1;
                    System.out.println("Ingresa el número del asiento (1-10)");
                    int asiento = objScanner.nextInt() - 1;

                    //Preguntar si ese asiento está disponible
                    if (!listaAsientos[fila][asiento]) {
                        listaAsientos[fila][asiento] = true;
                        System.out.println("Asiento reservado correctamente😁.");
                    } else {
                        System.out.println("Asiento no disponible 😒");
                    }
                    break;

                case 2: //Cancelar una reserva
                    System.out.println("Ingresa la fila (1-5)");
                    fila = objScanner.nextInt() - 1;
                    System.out.println("Ingresa el número del asiento (1-10)");
                    asiento = objScanner.nextInt() - 1;

                    if (listaAsientos[fila][asiento]) {
                        listaAsientos[fila][asiento] = false;
                        System.out.println("Reserva cancelada correctamente 😁");
                    } else {
                        System.out.println("El asiento ya está disponible 👍");
                    }
                    break;

                case 3: //Lista de asientos disponibles
                    System.out.println("Lista de asientos disponibles (fila-asiento)");
                    for (int i = 0; i < listaAsientos.length; i++) {

                        System.out.print((i+1)+"\t");

                        System.out.print("\n"+ (i+1));
                        for (int j = 0; j < listaAsientos[i].length; j++) {

                            //Si el asiento es falso = esta disponible
                            if (!listaAsientos[i][j]) {
                                System.out.print("✅\t");
                            } else {
                                System.out.print("❌\t");
                            }
                        }
                    }
                    break;


                case 4: //Contabilizar total disponibles y reservadas
                    int disponibles = 0, reservadas = 0;

                    for (boolean[] filaAsiento : listaAsientos) {
                        for (boolean asientoDisponible : filaAsiento) {
                            if (!asientoDisponible) {
                                disponibles++;
                            } else {
                                reservadas++;
                            }
                        }
                    }

                    System.out.println("Asientos diponibles:" + disponibles);
                    System.out.println("Asientos reservados:" + reservadas);
                    break;
            }

        } while (option != 5);


    }
}
