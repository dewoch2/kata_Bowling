package com.dewoch;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by boris on 14/01/2017.
 */
public class BowlingTest {

    @Test
    public void should_be_0() {

        Assert.assertEquals(0,  BowlingLineCalculator.calculate("--------------------"));

    }

    @Test
    public void should_be_10() {

        Assert.assertEquals(10,  BowlingLineCalculator.calculate("1-1-1-1-1-1-1-1-1-1-"));

    }

    @Test
    public void should_be_300() {

        Assert.assertEquals(300,  BowlingLineCalculator.calculate("XXXXXXXXXXXX"));

    }

    @Test
    public void should_be_100() {

        Assert.assertEquals(100,  BowlingLineCalculator.calculate("-/-/-/-/-/-/-/-/-/-/-"));

    }

    @Test
    public void should_be_190() {

        Assert.assertEquals(190,  BowlingLineCalculator.calculate("9/9/9/9/9/9/9/9/9/9/9"));

    }

    @Test
    public void should_be_200() {

        Assert.assertEquals(200,  BowlingLineCalculator.calculate("XX1/1/1/9/9/9/XXXX"));

    }

    @Test
    public void should_be_90() {

        Assert.assertEquals(90,  BowlingLineCalculator.calculate("X4-7/2-X1-7/X--3/6"));

    }
}
