package br.com.evolware.dbstream;

public class PrimitiveBooleanExpression extends BooleanExpression {

    private final boolean value;

    public PrimitiveBooleanExpression(ExpressionLink expressionLink, boolean value) {
        super(expressionLink);
        this.value = value;
    }

    public String toString() {
        return super.toString() + value;
    }
}
