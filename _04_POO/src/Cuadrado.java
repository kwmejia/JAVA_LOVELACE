public class Cuadrado extends Rectangulo{


    public Cuadrado(double lado){
        super(lado,lado);
    }

    @Override
    public String perimetro() {
        return "el perimetro es:"+ super.perimetro();
    }


}
