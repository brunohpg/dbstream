package br.com.evolware.dbstream;

public class PrimitiveValueExpression extends ValueExpression {

    private final Object value;

    public PrimitiveValueExpression(ExpressionLink expressionLink, Object value) {
        super(expressionLink);
        this.value = value;
    }

    public String toString() {
        return super.toString() + value;
    }

}
