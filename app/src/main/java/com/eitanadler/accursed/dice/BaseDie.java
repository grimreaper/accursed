package com.eitanadler.accursed.dice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by eax on 7/20/14.
 */
public abstract class BaseDie {
    protected Map<Integer, Integer> sides = new HashMap<>();
    protected Integer max_weight = new Integer(0);

    protected void addSide(Integer key, Integer weight) {
        assert(key != 0);
        this.sides.put(key, weight);
        this.max_weight += weight;
    }

    protected Double getExpectedValue() {
        Double ev = 0.0;
        for (Map.Entry<Integer,Integer> s: sides.entrySet()) {
            ev += s.getKey() * (s.getValue()/(double)max_weight);
        }
        return ev;
    }

    @Override
    public String toString() {
        return "BaseDie{" +
                "test=" + sides.get(1) +
                ", sides=" + sides +
                ", max_weight=" + max_weight +
                '}';
    }
}
