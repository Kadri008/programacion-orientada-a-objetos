package herencia;

public class Vendedor extends Empleado{
    private double comision;

    public Vendedor (String nombre, String documento, double salarioBase, double comision) {
        super("Julian","123456789", 2340000);
        this.comision = comision;

    }
    public double calcularSalario(){
        return salarioBase + comision;
    }

}
