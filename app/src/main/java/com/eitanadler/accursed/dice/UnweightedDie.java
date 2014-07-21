package com.eitanadler.accursed.dice;

import java.util.List;

/**
 * Created by eax on 7/20/14.
 */
public class UnweightedDie {

    /* Most general:
           support arbitrary sides with arbitrary weights
       Middle
            support arbitrary list of sides with fixed weight
            support N sided die starting from K skipping every T values
            support N sided die starting from K
       Most Specific:
            support N sided die starting from 1
     */

    protected List<String> sides;

    protected Integer min_value;

    public UnweightedDie(List<Integer> sides) {
        for (Integer s : sides) {
            this.sides.add(0, s.toString());
        }
    }

    public Double getExpectedValue() {
        return (sides.doubleValue() / 2) + .5;
    }
}
