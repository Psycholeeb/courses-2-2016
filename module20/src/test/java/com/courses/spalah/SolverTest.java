package com.courses.spalah;

import com.courses.spalah.HomeWork.Solver;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Татьяна on 02.10.2016.
 */
@RunWith(JUnit4.class)
public class SolverTest {
    Solver solver;
    @Before
    public void init(){
         solver = new Solver();
    }
    @Test
    public void testCalcMonthlyPayment() {
        assertEquals(527.45, solver.calculateMonthlyPayment(20000, 30, 21, 36), 0.01);
    }
    @Test
    public void testCalcOverpayment() {
        assertEquals(4988.23, solver.calculateOverpayment(20000, 30, 21, 36), 0.01);
    }
    @Test
    public void testCalcInitialFee() {
        assertEquals(6000, solver.calculateInitialFee(20000, 30), 0.01);
    }
    @Test
    public void testCalcAmountOfCredit() {
        assertEquals(14000, solver.calculateAmountOfCredit(20000, 30), 0.01);
    }
    @Test
    public void testCalcEffectiveRate() {
        assertEquals(21, solver.calculateEffectiveRate(21), 0.01);
    }
}
