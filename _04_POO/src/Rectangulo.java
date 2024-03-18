public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double perimetro(){
        return  this.ancho*2 + this.alto;
    }

    @Override
    public double calcularArea() {
        return this.ancho * this.alto;
    }
}
