public class Libro {

    //Atributos
    private String titulo;
    private String autor;
    private  String fechaPublicacion;
    private  boolean prestado;

    public Libro(String titulo, String autor, String fechaPublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.prestado = prestado;
    }


//Metodos


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    public  void cambiarEstado(){
        this.prestado = !this.prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
