package com.eitanadler.accursed.android_tests;

import android.test.InstrumentationTestCase;

import com.eitanadler.accursed.dice.UnweightedDie;

/**
 * Created by eax on 7/20/14.
 */
public class UnweightedDieTest extends InstrumentationTestCase {
    public void test_expected_Value() throws Exception {
        final double expected = 3.5;

        UnweightedDie die = new UnweightedDie(6);
        final double reality = die.getExpectedValue();
        assertEquals(expected, reality);
    }
}
