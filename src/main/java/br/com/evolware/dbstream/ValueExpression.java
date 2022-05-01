package br.com.evolware.dbstream;

import java.util.function.Function;

public abstract class ValueExpression extends Expression {

    private final ExpressionLink expressionLink;

    public ValueExpression() {
        expressionLink = null;
    }

    public ValueExpression(ExpressionLink expressionLink) {
        this.expressionLink = expressionLink;
    }

    public BooleanExpression eq(Object primitiveValue) {
        return new ComparisonExpression(null, this, ComparisonOperator.EQUALS,
                new PrimitiveValueExpression(null, primitiveValue));
    }

    public BooleanExpression eq(Function<ExpressionBuilder, ValueExpression> exprBuilder) {
        ValueExpression expr = exprBuilder.apply(new ExpressionBuilder());
        return new ComparisonExpression(null, this, ComparisonOperator.EQUALS, expr);
    }

    public ValueExpression add(Number primitiveValue) {
        return new OperationValueExpression(null, this, Operator.ADD,
                new PrimitiveValueExpression(null, primitiveValue));
    }

    public String toString() {
        return expressionLink == null ? "" : expressionLink.toString();
    }

}
