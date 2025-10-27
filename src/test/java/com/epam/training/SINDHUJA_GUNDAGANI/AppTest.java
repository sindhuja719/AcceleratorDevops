package com.epam.training.SINDHUJA_GUNDAGANI;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

/**
 * Unit test for simple App.
 */
public class AppTest{
    @Test(priority = 1)
    public void testGreetings()
    {
        Assert.assertEquals("Hello, Learner welcome this is the sample project",App.greetings("Learner"));
    }
    @Test(priority = 2)
    public void testName()
    {
        Assert.assertEquals("Devops Learner!",App.user("Devops Learner"));
    }
}
