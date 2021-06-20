package com.github.bfu4;

import com.github.bfu4.stringparse.StringParser;
import com.github.bfu4.stringparse.parser.ParserMethod;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the float parser.
 */
public class TestFloat {

    /**
     * Parser.
     */
    private StringParser parser;

    /**
     * Setup tasks.
     */
    @Before
    public void setup() {
        parser = new StringParser(ParserMethod.FLOAT);
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
        float value = parser.parse("500.00");
        Assert.assertEquals(value, (float) 500, 0);
    }

    /**
     * Test syntactic sugar for floats.
     */
    @Test
    public void testSugar() {
        float value = parser.parse("50f");
        Assert.assertEquals(value, 50f, 0);
    }

    /**
     * Test invalid string.
     */
    @Test
    public void testInvalidString() {
        Assert.assertNull(parser.parse("eeee"));
    }
}
