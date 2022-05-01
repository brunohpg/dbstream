package br.com.evolware.dbstream;

import java.util.function.Function;

/**
 * A view os some data of database.
 */
public class DataStore<T> {

    private DataStore parent;

    private String table;
    private String[] selectedFields;

    public DataStore<T> filter(Function<ExpressionBuilder, BooleanExpressionLink> exprFilter) {

        return null;

    }

    public DataStore<T> columns(String... columns) {

    }


}
