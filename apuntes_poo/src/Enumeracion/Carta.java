package Enumeracion;

public class Carta {

    private int numero;
    private Figura figura;

    public Carta(int numero, Figura figura){
        this.numero = numero;
        this.figura = figura;
    }

    @Override
    public String toString(){
        return this.numero + " de " + this.figura;
    }

}

