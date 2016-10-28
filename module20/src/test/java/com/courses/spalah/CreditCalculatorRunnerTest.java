package com.courses.spalah;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by Roman on 26.10.2016.
 */
@RunWith(JUnit4.class)
public class CreditCalculatorRunnerTest {
    @Test
    public void testRunCreditCalculator() {
        String [] args = new String [0];
        CreditCalculatorRunner.main(args);
        assertEquals(true,CreditCalculatorRunner.isOk);
    } 
}
