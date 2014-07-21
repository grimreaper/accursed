package com.eitanadler.accursed.test;

import android.test.AndroidTestCase;

import com.eitanadler.accursed.dice.DieExpression;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by eax on 7/20/14.
 */
@RunWith(RobolectricTestRunner.class)
public class DieExpressionTest extends AndroidTestCase{

    public void test_expression() {
        DieExpression de = new DieExpression("1d6");
        assertEquals(de.getExpression(), "1d6");
    }

    public void test_reject_invalid_expression() {
        try {
            DieExpression de = new DieExpression("1d");
            fail("InvalidDieExpression not thrown");
        }
        catch (DieExpression.InvalidDieExpression exception) {
            // swallow
        }
    }
}
