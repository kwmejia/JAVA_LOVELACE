import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Scanner objScan = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = objScan.nextLine();

        System.out.println("Ingresa tu edad");
        byte edad = objScan.nextByte();

        System.out.println("Ingresa tu estatura");
        float estatura = objScan.nextFloat();

        System.out.println("Nombre: " + nombre +
                " Edad: " + edad +
                " Estatura: " + estatura);

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }


        if (estatura >= 1.80) {
            System.out.println("Eres una persona de  alta estatura");
        } else if (estatura >= 1.60 && estatura < 1.80) {
            System.out.println("Eres una persona con estatura promedio");
        } else {
            System.out.println("Eres una persona con estatura baja");
        }
    }
}