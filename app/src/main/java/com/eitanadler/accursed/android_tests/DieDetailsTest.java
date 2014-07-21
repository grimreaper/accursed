package com.eitanadler.accursed.android_tests;

import android.test.InstrumentationTestCase;

import com.eitanadler.accursed.activities.DiceDetails;

/**
 * Created by eax on 7/20/14.
 */
public class DieDetailsTest extends InstrumentationTestCase {
    public void test_basics() throws Exception {
        DiceDetails dice_details = new DiceDetails();
        assertNotNull(dice_details);
    }
}
