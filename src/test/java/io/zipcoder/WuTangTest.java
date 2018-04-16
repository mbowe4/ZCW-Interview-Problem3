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

        String expected = "Wu";
        String actual = problem1.toWuTangString(9);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multipleOfThreeAndFiveTest() {
        Problem1 problem1 = new Problem1();

        String exptected = "WuTang";
        String actual = problem1.toWuTangString(45);

        Assert.assertEquals(exptected, actual);
    }

    @Test
    public void wuTangPrinterTest() {
        Problem1 problem1 = new Problem1();
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, " +
                "Wu, 13, 14, WuTang, 16, 17, Wu, 19, Tang, Wu, 22, 23, " +
                "Wu, Tang, 26, Wu, 28, 29, WuTang, 31, 32, Wu, 34, Tang, Wu, " +
                "37, 38, Wu, Tang, 41, Wu, 43, 44, WuTang, 46, 47, Wu, 49, Tang";
        String actual = problem1.wuTangPrinter(50);

        Assert.assertEquals(expected, actual);
    }


}
