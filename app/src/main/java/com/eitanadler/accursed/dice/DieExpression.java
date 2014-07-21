package com.eitanadler.accursed.dice;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by eax on 7/20/14.
 */
public class DieExpression {

    public static class InvalidDieExpression extends IllegalArgumentException {};

    protected String expression;

    @NotNull
    @Override
    public String toString() {
        return "DieExpression{" +
                "expression='" + expression + '\'' +
                '}';
    }

    @NotNull
    public String getExpression() {
        return expression;
    }

    public DieExpression(@NotNull String expression) {
        DieExpression.validateDieExpression(expression);
        this.expression = expression;

    }

    /**
     *
     * @param expr a full die expression
     * @return a list of partial die expressions
     */
    protected static String[] getDieParts(@NotNull String expr) {
        return expr.split("\\+");
    }

    /**
     *
     * @param dieexpr a single die expression
     * @return a list of the die expression parts.
     */
    protected static Integer[] getDieValues(@NotNull String dieexpr) {
        Integer[] ret = new Integer[2];
        String[] die_specifics = dieexpr.split("d");
        try {
            ret[0] = Integer.parseInt(die_specifics[0]);
            ret[1] = Integer.parseInt(die_specifics[1]);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new DieExpression.InvalidDieExpression();
        }
        return ret;
    }

    protected static void validateDieExpression(@NotNull String expr) {
        String[] dice_split = getDieParts(expr);
        for (String die : dice_split) {
            getDieValues(die);
        }
    }

    @NotNull
    public static List<UnweightedDie> DieExpressionToDieList(@NotNull DieExpression de) {
        //TODO: implement error handling
        List<UnweightedDie> ls = new ArrayList<UnweightedDie>();
        String expr = de.getExpression();
        String[] dice_split = getDieParts(expr);
        for (String die : dice_split) {
            Integer[] val = getDieValues(die);
            UnweightedDie ud = new UnweightedDie(val[0]);
            while (val[1]-- > 0) {
                ls.add(ud);
            }
        }
        return ls;
    }


}
