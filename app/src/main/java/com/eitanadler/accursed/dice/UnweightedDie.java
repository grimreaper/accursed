package com.eitanadler.accursed.dice;

/**
 * Created by eax on 7/20/14.
 */
public class UnweightedDie {
    Integer sides;


    public UnweightedDie(Integer sides) {
        this.sides = sides;
    }

    public Integer getSides() {
        return sides;
    }

    public Double getExpectedValue() {
        return (sides.doubleValue() / 2) + .5;
    }
}
