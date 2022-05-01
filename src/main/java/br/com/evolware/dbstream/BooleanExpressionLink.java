package br.com.evolware.dbstream;

public class BooleanExpressionLink extends ExpressionLink {

    private final BooleanOperator operator;

    public BooleanExpressionLink(Expression leftExpression, BooleanOperator operator) {
        super(leftExpression);
        this.operator = operator;
    }

    public BooleanOperator getOperator() {
        return operator;
    }

    public String toString() {
        return getLeftExpression() + " " + operator.toString() + " ";
    }
}
