public class Empleado {

    private String nombre;
    private String cargo;

    private  double salario;
    private int id;

    public Empleado(String nombre, String cargo, double salario, int id) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void aumentarSalario(double porcentaje){
        this.salario += (this.salario * porcentaje)/100;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }
}
