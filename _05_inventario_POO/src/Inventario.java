import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaProductos;

    public Inventario(){
        this.listaProductos = new ArrayList<>();
    }

    //Metodos

    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }

    public boolean eliminarProducto(int id){
       return listaProductos.removeIf(producto -> producto.getId() == id);
    }

    public Producto buscarPorNombre(String nombreBuscar){
        for (Producto objProducto: this.listaProductos){
            if (objProducto.getNombre().equalsIgnoreCase(nombreBuscar)){
                return objProducto;
            }
        }
        return null;
    }

    public void listarProductos(){
        for (Producto producto : this.listaProductos){
            System.out.println("ID: "+ producto.getId()
            +" Nombre: "+ producto.getNombre()+ " Precio: "+ producto.getPrecio());
        }
    }

}
