package br.com.evolware.dbstream;

public abstract class BooleanExpression extends Expression {

    private final ExpressionLink expressionLink;

    public BooleanExpression() {
        this.expressionLink = null;
    }

    public BooleanExpression(ExpressionLink expressionLink) {
        this.expressionLink = expressionLink;
    }

    private ExpressionBuilder operate(BooleanOperator operator) {
        BooleanExpressionLink link = new BooleanExpressionLink(this, operator);
        return new ExpressionBuilder(link);
    }

    public ExpressionBuilder and() {
        return operate(BooleanOperator.AND);
    }

    public ExpressionBuilder or() {
        return operate(BooleanOperator.OR);
    }

    public ExpressionBuilder xor() {
        return operate(BooleanOperator.XOR);
    }

    public BooleanExpression not() {
        return new NegateBooleanExpression(this);
    }

    public String toString() {
        return expressionLink == null ? "" : expressionLink.toString();
    }
}
