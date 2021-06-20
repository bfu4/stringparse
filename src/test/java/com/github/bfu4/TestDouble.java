package com.github.bfu4;

import com.github.bfu4.stringparse.StringParser;
import com.github.bfu4.stringparse.parser.ParserMethod;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDouble {

    /**
     * Parser.
     */
    private StringParser parser;

    /**
     * Setup tasks.
     */
    @Before
    public void setup() {
        parser = new StringParser(ParserMethod.DOUBLE);
    }

    /**
     * Breakdown tasks.
     */
    @After
    public void breakDown() {
        parser = null;
    }

    /**
     * Test valid string.
     */
    @Test
    public void testValid() {
        double value = parser.parse("50");
        Assert.assertEquals(value, 50, 0);
    }

    /**
     * Test syntactic sugar for doubles
     */
    @Test
    public void testSugar() {
        double value = parser.parse("50d");
        Assert.assertEquals(value, 50, 0);
    }

    /**
     * Test invalid string.
     */
    @Test
    public void testInvalidString() {
        Assert.assertNull(parser.parse("eeee"));
    }
}
