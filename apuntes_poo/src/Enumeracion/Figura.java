package Enumeracion;

public enum Figura {

    CORAZON("Corazones"), DIAMANTE("Diamante"), ESPADA("Picas"), TREBOL("Trébol");

    String toString;

    Figura(String toString) {
        this.toString = toString;

    }

    @Override
    public String toString(){
        return "XD";
    }
}
