package com.eitanadler.accursed.dice;

import com.eitanadler.accursed.BuildConfig;

import java.util.LinkedList;
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

    public UnweightedDie(Integer sides) {
        if (BuildConfig.DEBUG && !this.sides.isEmpty()) { throw new AssertionError(); }
        List<Integer> list = new LinkedList<Integer>();
        for (; sides > 0; sides--) {
            addSide(sides, 1);
        }
    }
}
