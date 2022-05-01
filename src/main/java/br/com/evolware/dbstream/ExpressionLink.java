package br.com.evolware.dbstream;

public abstract class ExpressionLink {

    private final Expression leftExpression;

    public ExpressionLink(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public String toString() {
        return leftExpression + " NO-OP ";
    }
}
