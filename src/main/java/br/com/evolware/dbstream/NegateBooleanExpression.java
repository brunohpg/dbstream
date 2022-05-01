package br.com.evolware.dbstream;

public class NegateBooleanExpression extends BooleanExpression {

    private final BooleanExpression expr;

    public NegateBooleanExpression(BooleanExpression expr) {
        this.expr = expr;
    }

    public String toString() {
        return super.toString() + "!" + expr;
    }
}
