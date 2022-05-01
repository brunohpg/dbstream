package br.com.evolware.dbstream;

public class OperationValueExpression extends ValueExpression {

    private final Expression leftExpr;
    private final Operator operator;
    private final Expression rightExpr;

    public OperationValueExpression(ExpressionLink expressionLink, Expression leftExpr, Operator operator, Expression rightExpr) {
        super(expressionLink);
        this.leftExpr = leftExpr;
        this.operator = operator;
        this.rightExpr = rightExpr;
    }

    public String toString() {
        return super.toString() + "(" + leftExpr + " " + operator + " " + rightExpr + ")";
    }
}
