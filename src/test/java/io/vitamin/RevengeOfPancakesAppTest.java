package io.vitamin;


import org.junit.Assert;
import org.junit.Test;

public class RevengeOfPancakesAppTest {

    @Test
    public void testFlips(){
        RevengeOfPancakesApp app = new RevengeOfPancakesApp();
        Assert.assertEquals(1, app.flipper("-"));
        Assert.assertEquals(0, app.flipper("+"));
        Assert.assertEquals(1, app.flipper("-+"));
        Assert.assertEquals(2, app.flipper("+-"));
        Assert.assertEquals(0, app.flipper("+++"));
        Assert.assertEquals(1, app.flipper("---"));
        Assert.assertEquals(3, app.flipper("--+-"));
    }
}
