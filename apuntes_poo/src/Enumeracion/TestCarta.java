package Enumeracion;

public class TestCarta {

    public static void main(String[] args){
        Carta c1 = new Carta(10, Figura.CORAZON);
        Figura d = Figura.DIAMANTE;
        Carta c2 = new Carta(10, Figura.ESPADA);
        Carta c3 = new Carta(10, Figura.TREBOL);
        Carta c4 = new Carta(10, d);
        Figura d1 = Figura.DIAMANTE;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(d == Figura.DIAMANTE);
        System.out.println(d == d1);


    }
}
