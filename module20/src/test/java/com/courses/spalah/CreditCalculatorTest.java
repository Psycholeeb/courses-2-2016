package com.courses.spalah;

import main.java.com.courses.spalah.SimpleCalculator;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Roman on 26.10.2016.
 */
@RunWith(JUnit4.class)
public class CreditCalculatorTest {
    @Test
    public void testgetEffectiveRate() {
        CreditCalculator calculator = new CreditCalculator(1000000,0.3,36,0.01,0.001);
        assertEquals(0.3790, calculator.getEffectiveRate(),0.001);
    }

    @Test
    public void testgetOverpayment() {
        CreditCalculator calculator = new CreditCalculator(1000000,0.3,36,0.01,0.001);
        assertEquals(584256.76, calculator.getOverpayment(),1);
    }

    @Test
    public void testgetAnnuityPay() {
        CreditCalculator calculator = new CreditCalculator(1000000,0.3,36,0.01,0.001);
        assertEquals(42451.58, calculator.getAnnuityPay(),1);
    }
}

//