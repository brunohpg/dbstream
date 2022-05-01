package br.com.evolware.dbstream;

import java.util.function.Function;

public class ExpressionBuilder {

    private final ExpressionLink expressionLink;

    public ExpressionBuilder() {
        expressionLink = null;
    }

    public ExpressionBuilder(ExpressionLink expressionLink) {
        this.expressionLink = expressionLink;
    }

    public BooleanExpression value(boolean value) {
        return new PrimitiveBooleanExpression(expressionLink, value);
    }

    public PrimitiveValueExpression value(Object value) {
        return new PrimitiveValueExpression(expressionLink, value);
    }

    public ColumnValueExpression column(String name) {
        return new ColumnValueExpression(expressionLink, name);
    }

    public BooleanExpression not(Function<ExpressionBuilder, BooleanExpression> lBuilder) {
        return lBuilder.apply(new ExpressionBuilder(expressionLink));
    }

    public Expression expr(Function<ExpressionBuilder, Expression> lBuilder) {
        return lBuilder.apply(new ExpressionBuilder(expressionLink));
    }
}
