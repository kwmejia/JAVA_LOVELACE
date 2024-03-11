import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*        Libro objLibro = new Libro("Cien años de soledad","Grabiel Garcia",
                "01-05-1967",true);

        System.out.println(objLibro.getTitulo());

        objLibro.setTitulo("El rastro de tu en sangre en la nieve");

        System.out.println(objLibro.getTitulo());

        System.out.println(objLibro);

        objLibro.cambiarEstado();
        System.out.println(objLibro);*/

        Scanner objScanner = new Scanner(System.in);
        int id= 0;
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = objScanner.nextLine();

        System.out.println("Ingrese el cargo del empleado: ");
        String cargo = objScanner.nextLine();

        System.out.println("Ingrese el salario del empleado: ");
        double salario = objScanner.nextDouble();

        Empleado objEmpleado = new Empleado(nombre,cargo,salario,id);

        id++;
        System.out.println(objEmpleado.toString());

        System.out.println("Ingrese el porcentaje del salario a aumentar:");
       double porcentaje = objScanner.nextDouble();

       objEmpleado.aumentarSalario(porcentaje);

        System.out.println(objEmpleado.toString());

    }
}