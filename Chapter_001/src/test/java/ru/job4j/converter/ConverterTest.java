package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void euroToRuble() {
        int in = 2000;
        int expected = 140000;
        int out = Converter.euroToRubles(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void dollarsToRubles() {
        int in = 300;
        int expected = 18000;
        int out = Converter.dollarToRubles(in);
        Assert.assertEquals(expected, out);
        
    }



}
