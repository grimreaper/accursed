package com.eitanadler.accursed.dice;

import org.jetbrains.annotations.NotNull;


/**
 * Created by eax on 7/20/14.
 */
public class DieExpression {

    @NotNull
    protected String expression;

    @NotNull
    @Override
    public String toString() {
        return "DieExpression{" +
                "expression='" + expression + '\'' +
                '}';
    }


    public String getExpression() {
        return expression;
    }

    public DieExpression(@NotNull String expression) {
        this.expression = expression;
    }
}
