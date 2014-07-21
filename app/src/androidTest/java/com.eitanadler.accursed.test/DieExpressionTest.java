package com.eitanadler.accursed.test;

import android.test.AndroidTestCase;

import com.eitanadler.accursed.dice.DieExpression;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by eax on 7/20/14.
 */
@RunWith(RobolectricTestRunner.class)
public class DieExpressionTest extends AndroidTestCase {

    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test_expression() {
        DieExpression de = new DieExpression("1d6");
        assertEquals(de.getExpression(), "1d6");
    }

    public void test_reject_invalid_expression() {
        exception.expect(DieExpression.InvalidDieExpression.class);
        DieExpression de = new DieExpression("1d");
    }
}
