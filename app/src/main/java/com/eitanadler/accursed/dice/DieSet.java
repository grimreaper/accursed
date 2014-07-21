package com.eitanadler.accursed.dice;

import java.util.AbstractList;
import java.util.List;

/**
 * Created by eax on 7/20/14.
 */
public class DieSet extends AbstractList<UnweightedDie> {

    private List<UnweightedDie> underlying_list;

    public DieSet(DieExpression de) {
        //TODO: implement creation of DieSet from a DieExpression
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

    @Override
    public String toString() {
        return "DieSet{" +
                "underlying_list=" + underlying_list +
                '}';
    }
}
