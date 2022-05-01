package br.com.evolware.dbstream;

public enum Operator {

    ADD("+");

    private final String str;

    Operator(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }

}
