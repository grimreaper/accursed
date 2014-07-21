package com.eitanadler.accursed.dice;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by eax on 7/20/14.
 */
public class DieExpression {

    public static class InvalidDieExpression extends IllegalArgumentException {};

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
        DieExpression.validateDieExpression(expression);
        this.expression = expression;

    }

    static protected void validateDieExpression(@NotNull String expr) {
        String[] dice_split = expr.split("\\+");
        for (String die : dice_split) {
            String[] die_specifics = expr.split("d");
            try {
                Integer amt = Integer.parseInt(die_specifics[0]);
                Integer val = Integer.parseInt(die_specifics[1]);
            }
            catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                throw new DieExpression.InvalidDieExpression();
            }
        }
    }

    static public List<UnweightedDie> DieExpressionToDieList(DieExpression de) {
        //TODO: implement error handling
        List<UnweightedDie> ls = new ArrayList<UnweightedDie>();
        String expr = de.getExpression();
        String[] dice_split = expr.split("\\+");
        for (String die : dice_split) {
            String[] die_specifics = expr.split("d");
            Integer amt = Integer.parseInt(die_specifics[0]);
            Integer val = Integer.parseInt(die_specifics[1]);
            UnweightedDie ud = new UnweightedDie(val);
            while (amt-- > 0) {
                ls.add(ud);
            }
        }
        return ls;
    }


}
