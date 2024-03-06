import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Tabla de Multiplicar: Utiliza un bucle for anidado para imprimir la tabla de multiplicar
        del 1 al 10.*/

/*        for(int i =1; i<=10; i++){
            System.out.println("\nTABLA DEL "+i);

            for (int j = 1; j <=10; j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }*/


       /* Sistema de Menú Interactivo: Desarrolla un sistema de menú interactivo que muestre
        diferentes opciones al usuario (por ejemplo, 1. Ver saldo 2. Depositar dinero 3. Retirar
        dinero 4. Salir). Utiliza un bucle para permitir al usuario interactuar con el menú hasta que
        elija salir.*/

        String option = "";
        double saldo = 0;

        do {

            option = JOptionPane.showInputDialog(null,
                    "MENU DE OPCIONES\n" +
                            "1. Ver saldo\n" +
                            "2. Depositar dinero\n" +
                            "3. Retirar dinero\n" +
                            "4. Salir\n\n" +
                            "Ingresa una opción: ");

            switch (option) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Tu saldo es de:" + saldo);
                    break;
                case "2":
                    String dinero = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero a depositar: ");

                    try {
                        //Convertir o castear de String a double
                        double dineroGuardar = Double.parseDouble(dinero);

                        saldo += dineroGuardar;

                        JOptionPane.showMessageDialog(null,"Dinero depositado correctamente");

                    } catch (Exception error){
                        JOptionPane.showMessageDialog(null,"Caracteres no válidos");
                    }

                    break;


                case "3":
                    try{

                        double retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero a retirar: ")) ;
                        //Validar si tiene saldo dispible
                        if (retiro > saldo){
                            JOptionPane.showMessageDialog(null,"Saldo insuficiente.");
                        }else{
                            saldo -= retiro;
                            JOptionPane.showMessageDialog(null,
                                    "Dinero retirado correctamente, tu saldo es: "+ saldo);
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null,"Caracteres no válidos");

                    }
                    break;
            }

        } while (!option.equals("4"));


    }
}