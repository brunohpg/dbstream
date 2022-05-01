package br.com.evolware.dbstream;

import org.junit.jupiter.api.Test;

public class ExpressionTest {

    @Test
    public void buildExpressions() {
        ExpressionBuilder expr = new ExpressionBuilder();

        BooleanExpression booleanExpression =
                expr.value(true).and()
                        .value("10").add(20).eq(eb -> eb.column("abc")).and()
                        .value("2").eq(3)
                        .not();

        System.out.println(booleanExpression.toString());
    }

}
