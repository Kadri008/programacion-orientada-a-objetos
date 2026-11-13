package encapsulamiento;

public class MainAprendiz {
    public static void main(String[] args) {
        Aprendiz a = new Aprendiz("1092545712", "Karoll Torres", 18, 4.9);

        a.setEdad(18);
        a.setNotaFinal(4.9);

        System.out.println("Aprendiz: " + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nota: " + a.getNotaFinal());
        System.out.println("Aprobo? " + (a.aprobo() ? "Si" : "No"));
    }
}

