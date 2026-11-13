package encapsulamiento;

public class Aprendiz {
    private String documento;
    private String nombre;
    private int edad;
    private double notaFinal;

    public Aprendiz(){

    }
    public Aprendiz(String documento, String nombre, int edad, double notaFinal){
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }
    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNotaFinal(){ return notaFinal; }

    public void setEdad(int edad) {
        if (edad >=0 && edad <=100){
            this.edad = edad;
        } else {
            System.out.println("Edad invalida. Debe estar entre 0 y 100.");
        }

    }
    public void setNotaFinal(double notaFinal) {
       if (notaFinal >= 0.0 && notaFinal <= 5.0 ) {
           this.notaFinal = notaFinal;
       } else {
           System.out.println("Nota invalida. Debe estar entre 0.0 y 5.0");
       }
    }
    public boolean aprobo (){
        return notaFinal >= 3.5;
    }
}
