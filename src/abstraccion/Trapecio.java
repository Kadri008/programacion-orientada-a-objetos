package abstraccion;

public class Trapecio extends Figura{
    private double Base;
    private double base;
    private double altura;

    public  Trapecio(double Base, double base, double altura){
        super("Trapecio");
        this.Base = Base;
        this.base = base;
        this.altura = altura;

    }

    @Override
    public double calcularArea() {
        return (Base + base * altura) / 2;
    }
}
