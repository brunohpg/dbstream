package br.com.evolware.dbstream;

public enum BooleanOperator {

    AND("&&"),
    OR("||"),
    XOR("^");

    private final String str;

    BooleanOperator(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }
}
