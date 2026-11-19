package abstraccion;

public class Rombo extends Figura{
    private double Diagonal;
    private double diagonal;

    public Rombo(double Diagonal, double diagonal) {
        super("Rombo");
        this.Diagonal = Diagonal;
        this.diagonal =  diagonal;
    }

    @Override
    public double calcularArea() {
        return (Diagonal * diagonal) / 2;
    }
}
