package com.eitanadler.accursed.dice;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eax on 7/20/14.
 */
public class DieSet extends AbstractList<UnweightedDie> {

    private List<UnweightedDie> underlying_list;

    protected List<UnweightedDie> DieExpressionToDieList(DieExpression de) {
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

    public DieSet(DieExpression de) {
        underlying_list = DieExpressionToDieList(de);
    }

    @Override
    public void add(int location, UnweightedDie ud) {
        underlying_list.add(location, ud);
    }

    @Override
    public void clear() {
        underlying_list.clear();
    }

    @Override
    public int size() {
        return underlying_list.size();
    }

    @Override
    public UnweightedDie get(int location) {
        return underlying_list.get(location);
    }

    @Override
    public UnweightedDie set(int location, UnweightedDie ud) {
        return underlying_list.set(location, ud);
    }

    @Override
    public UnweightedDie remove(int location) {
        return underlying_list.remove(location);
    }

    public double getExpectedValue() {
        Double ev = 0.0;
        for (UnweightedDie e : underlying_list) {
            ev += e.getExpectedValue();
        }
        return ev;
    }

    @Override
    public String toString() {
        return "DieSet{" +
                "underlying_list=" + underlying_list +
                '}';
    }
}
