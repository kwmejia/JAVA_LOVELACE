import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*
        * 1. Agregar
        * 2. Eliminar
        * 3. Buscar por nombre
        * 4. Buscar por categoria
        * 5. Listar inventario
        * 6. Salir
        * */

        ProductoEspecifico objProducto1 = new ProductoEspecifico(1, "Lapiz",
                2000, "Papeleria", "Big");

        ProductoEspecifico objProducto2 = new ProductoEspecifico(2, "cuaderno",
                6000, "Cuaderno", "Norma");


        Inventario objInventario = new Inventario();
        objInventario.agregarProducto(objProducto1);
        objInventario.agregarProducto(objProducto2);

        System.out.println("Antes de eliminar");
        objInventario.listarProductos();


        objInventario.eliminarProducto(2);
        System.out.println("Despues de eliminar");
        objInventario.listarProductos();


        if (objInventario.buscarPorNombre("lapiz232") == null) {
            System.out.println("No se encontró");
        } else {
            System.out.println(objInventario.buscarPorNombre("lapiz"));
        }


    }
}