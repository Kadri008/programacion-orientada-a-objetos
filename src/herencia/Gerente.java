package herencia;

public class Gerente extends Empleado{
    protected double bonificacion;

    public Gerente (String nombre, String documento, double salarioBase, double bonificacion){
        super("Andres", "34567890", 5430000);
        this.bonificacion = bonificacion;

    }
    public double calcularSalario(){
        return salarioBase + bonificacion;
    }
}
