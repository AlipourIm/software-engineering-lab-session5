package main;

import org.junit.Assert;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class RectangleTest {
    @Test
    public void testSetterAndGetter() {
        Rectangle rc = new Rectangle(20, 50);
        rc.setWidth(50);
        Assert.assertEquals(50, rc.getWidth());

        rc.setHeight(20);
        Assert.assertEquals(20, rc.getHeight());
    }

    @Test
    public void testSetterError() {
        final Rectangle rc = new Rectangle(20, 50);
        Assert.assertThrows(Exception.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                rc.setHeight(-50);
            }
        });
    }

    @Test
    public void testGetArea() {
        Rectangle rc = new Rectangle(20, 30);
        Assert.assertEquals(600d, rc.getArea(), 0.0001);
    }

    @Test
    public void testGetAreaZero() {
        Rectangle rc = new Rectangle(20, 50);
        rc.setHeight(0);
        rc.setWidth(20);
        Assert.assertEquals(0d, rc.getArea(), 0.0001);
    }
}
