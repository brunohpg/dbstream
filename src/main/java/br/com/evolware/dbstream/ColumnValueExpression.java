package br.com.evolware.dbstream;

public class ColumnValueExpression extends ValueExpression {

    private final String column;

    public ColumnValueExpression(ExpressionLink expressionLink, String column) {
        super(expressionLink);
        this.column = column;
    }

    public String toString() {
        return super.toString() + " `" + column + "`";
    }

}
