package main;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testGetterSetter() throws Exception {
        Square sq = new Square();
        sq.setSide(20);
        Assert.assertEquals(20d, sq.getSide(), 0.001);
    }

    @Test
    public void testGetArea() throws Exception {
        Square sq = new Square();
        sq.setSide(20);
        Assert.assertEquals(400d, sq.getArea(), 0.0001);
    }
}
