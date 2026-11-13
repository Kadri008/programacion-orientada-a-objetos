package herencia;

public class Mainveterinaria {
    static void main(String[] args) {
        Perro firulais = new Perro("firulais",4);
        Gato kitty = new Gato("kitty", 1);
        Pajaro oli = new Pajaro("oli",5);


        firulais.comer();
        firulais.hacerSonido();
        firulais.perseguirCola();

        System.out.println("----");

        kitty.comer();
        kitty.dormir();
        kitty.hacerSonido();
        kitty.ronronear();

        System.out.println("----");

        oli.hacerSonido();
        oli.volar();
    }

        }



