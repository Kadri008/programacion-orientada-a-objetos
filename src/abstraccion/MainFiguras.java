package abstraccion;

public class MainFiguras {
    static void main(String[] args) {

        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(4, 6);
        Cuadrado cu = new Cuadrado(3);
        Rectangulo r = new Rectangulo(6, 12);
        Rombo ro = new Rombo(12,54);
        Pentagono p = new Pentagono(32, 59);
        Hexagono h = new Hexagono(97, 41);
        Trapecio tr = new Trapecio(45, 67, 23);
        Paralelogramo pa = new Paralelogramo(32, 67);



        c.mostrar();
        t.mostrar();
        cu.mostrar();
        r.mostrar();
        ro.mostrar();
        p.mostrar();
        h.mostrar();
        tr.mostrar();
        pa.mostrar();
        System.out.println("--" );
    }
}
