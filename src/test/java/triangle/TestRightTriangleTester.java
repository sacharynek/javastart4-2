package triangle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRightTriangleTester {

    @Test
    public void defaultParameterTest() {
        Assert.assertFalse(RightTriangleTester.isRightTriangle(new Triangle()), "Triangle is  right");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void throwIfDimensionIsLessThanOne() throws IllegalArgumentException {
        RightTriangleTester.isRightTriangle(new Triangle(-1, -1, -1));
    }

    @Test
    public void rightTriangleTet() {
        Assert.assertTrue(RightTriangleTester.isRightTriangle(new Triangle(3, 4, 5)), "Triangle is not right");
    }

    @Test
    public void randomParamsTest() {
        Assert.assertFalse(RightTriangleTester.isRightTriangle(new Triangle(10, 9, 8)));
    }
}
