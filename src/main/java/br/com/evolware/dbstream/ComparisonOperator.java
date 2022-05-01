package br.com.evolware.dbstream;

public enum ComparisonOperator {

    EQUALS("=");

    private final String str;

    ComparisonOperator(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }
}
