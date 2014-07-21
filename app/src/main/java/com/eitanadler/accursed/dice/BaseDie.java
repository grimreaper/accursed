package com.eitanadler.accursed.dice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by eax on 7/20/14.
 */
public abstract class BaseDie {
    protected Map<Integer, Integer> sides = new HashMap<Integer, Integer>();
    protected Integer max_weight = new Integer(0);

    protected void addSide(Integer value, Integer weight) {
        this.sides.put(value, weight);
        this.max_weight += weight;
    }

    protected Double getExpectedValue() {
        Double ev = 0.0;
        for (Map.Entry<Integer,Integer> s: sides.entrySet()) {
            ev += s.getKey() * s.getValue()/max_weight;
        }
        return ev;
    }

    @Override
    public String toString() {
        return "BaseDie{" +
                "sides=" + sides +
                ", max_weight=" + max_weight +
                '}';
    }
}
