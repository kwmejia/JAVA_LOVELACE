public class ProductoEspecifico extends Producto{

    private String categoria;
    private  String marca;

    public  ProductoEspecifico(int id, String nombre,
                               double precio, String categoria, String marca){
        super(id, nombre, precio);
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
