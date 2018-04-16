package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class WuTangTest {

    @Test
    public void multipleOfFiveTest() {
        Problem1 problem1 = new Problem1();

        String expected = "Tang";
        String actual = problem1.toWuTangString(50);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void notMultipleOfThreeOrFiveTest() {
        Problem1 problem1 = new Problem1();

        String expected = "";
        String actual = problem1.toWuTangString(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multipleOfThreeTest() {
        Problem1 problem1 = new Problem1();

        String exptected = "Wu";
        String actual = problem1.toWuTangString(9);

        Assert.assertEquals(exptected, actual);
    }

    @Test
    public void multipleOfThreeAndFiveTest() {
        Problem1 problem1 = new Problem1();

        String exptected = "WuTang";
        String actual = problem1.toWuTangString(45);

        Assert.assertEquals(exptected, actual);
    }


}
