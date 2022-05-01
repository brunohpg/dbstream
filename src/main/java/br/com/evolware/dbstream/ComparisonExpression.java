package br.com.evolware.dbstream;

public class ComparisonExpression extends BooleanExpression {

    private final Expression leftExpr;
    private final ComparisonOperator operator;
    private final Expression rightExpr;

    public ComparisonExpression(ExpressionLink expressionLink, Expression leftExpr, ComparisonOperator operator, Expression rightExpr) {
        super(expressionLink);
        this.leftExpr = leftExpr;
        this.operator = operator;
        this.rightExpr = rightExpr;
    }

    public String toString() {
        return super.toString() + "(" + leftExpr + " " + operator + " " + rightExpr + ")";
    }

}
