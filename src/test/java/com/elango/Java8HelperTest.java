package com.elango;

import org.junit.Test;

import junit.framework.Assert;

public class Java8HelperTest {
    @Test
    public void testTest1() {
        Java8Helper helper = new Java8Helper();
        Assert.assertEquals(1, helper.test1(true));
        Assert.assertEquals(0,helper.test1(false));
    }
}