package com.eitanadler.accursed.dice;

import java.util.List;

/**
 * Created by eax on 7/20/14.
 */
public class UnweightedDie extends BaseDie {

    /* Most general:
           support arbitrary sides with arbitrary weights
       Middle
            support arbitrary list of sides with fixed weight
            support N sided die starting from K skipping every T values
            support N sided die starting from K
       Most Specific:
            support N sided die starting from 1
     */

    public UnweightedDie(List<Integer> sides) {
        for (Integer s : sides) {
            addSide(s, 1);
        }
    }
}
