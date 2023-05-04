package main;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testGetterSetter() {
        Square sq = new Square();
        sq.setSide(20);
        Assert.assertEquals(20, sq.getSide());
    }

    @Test
    public void testGetArea() {
        Square sq = new Square();
        sq.setSide(20);
        Assert.assertEquals(400, sq.getArea());
    }
}
