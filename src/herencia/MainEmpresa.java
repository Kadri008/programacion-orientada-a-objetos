package herencia;

public class MainEmpresa {
    static void main(String[] args) {
        Vendedor v = new Vendedor("Julian", "123456789", 2340000, 43000);
        Gerente g = new Gerente("Andres", "34567890", 5430000, 540000);

        v.mostrarInfo();
        g.mostrarInfo();
        System.out.println("---");
    }
}
