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

    @Test(expected = DivisionByZeroException.class)
    public void testDivide() throws DivisionByZeroException {
        Calculator c= new Calculator();
        divide(1,0);
    }


}
