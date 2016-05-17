package io.zihaocastine;

import org.junit.Assert;
import org.junit.Test;
import static io.zihaocastine.Calculator.*;
/**
 * Created by zihaocastine on 5/17/16.
 */
public class CalculatorSpec {
    @Test
    public void testAdd(){
        int expectedValue=4;
        Assert.assertEquals(expectedValue, add(2,2));
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(-1, subtract(2,3));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(20, multiply(4,5));
    }

    @Test(expected = DivisionByZeroException.class)
    public void testDivideByZero() throws DivisionByZeroException {
        divide(1,0);
    }

    @Test
    public void testDivide() throws DivisionByZeroException {
        Assert.assertEquals(2.5,divide(5,2),0);
    }

    @Test
    public void testSquareRoot() throws ComplexNumberException {
        Assert.assertEquals(4, squareRoot(16),0);
        Assert.assertEquals(0, squareRoot(0),0);
    }

    @Test(expected = ComplexNumberException.class)
    public void testSquareRootException() throws ComplexNumberException {
        squareRoot(-1);
    }






}
