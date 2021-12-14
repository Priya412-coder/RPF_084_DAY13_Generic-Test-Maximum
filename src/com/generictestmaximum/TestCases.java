package com.generictestmaximum;
import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void First_Position_TestCase() {
        MaxInteger maxInteger = new MaxInteger();
        int result = maxInteger.FindMaxNumber(40,20,15);
        Assert.assertEquals(40,result);
    }

    @Test
    public void Second_Position_TestCase() {
        MaxInteger maxInteger = new MaxInteger();
        int result = maxInteger.FindMaxNumber(10,20,15);
        Assert.assertEquals(20,result);
    }

    @Test
    public void Third_Position_TestCase() {
        MaxInteger maxInteger = new MaxInteger();
        int result = maxInteger.FindMaxNumber(40,20,75);
        Assert.assertEquals(75,result);
    }

    @Test
    public void First_Position_Double_TestCases() {
    	MaxFloat maxFloat = new MaxFloat();
        Double result = maxFloat.FindMaxNumber(4.2,2.5,3.1);
        Assert.assertEquals((Double) 4.2,result);
    }

    @Test
    public void Second_Position_Double_TestCases() {
    	MaxFloat maxFloat = new MaxFloat();
        Double result = maxFloat.FindMaxNumber(2.5,4.2,3.1);
        Assert.assertEquals((Double) 4.2,result);
    }

    @Test
    public void Third_Position_Double_TestCases() {
        MaxFloat maxFloat = new MaxFloat();
        Double result = maxFloat.FindMaxNumber(3.1,3.5,4.2);
        Assert.assertEquals((Double) 4.2,result);
    }

    @Test
    public void First_Position_String_TestCases() {
        MaxString maxString = new MaxString();
        String result = maxString.FindMaxString("Apple","Peach","Banana");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void Second_Position_String_TestCases() {
        MaxString maxString = new MaxString();
        String result = maxString.FindMaxString("Peach","Banana","Apple");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void Third_Position_String_TestCases() {
        MaxString maxString = new MaxString();
        String result = maxString.FindMaxString("Banana","Apple","Peach");
        Assert.assertEquals("Peach",result);
    }
}
