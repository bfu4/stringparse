package com.github.bfu4;

import com.github.bfu4.stringparse.StringParser;
import com.github.bfu4.stringparse.parser.ParserMethod;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the integer parser.
 */
public class TestInteger {

    /**
     * Parser.
     */
    private StringParser parser;

    /**
     * Setup tasks.
     */
    @Before
    public void setup() {
        parser = new StringParser(ParserMethod.INTEGER);
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
        int value = parser.parse("1000");
        Assert.assertEquals(value, 1000);
    }

    /**
     * Test invalid string.
     */
    @Test
    public void testInvalidString() {
        Assert.assertNull(parser.parse("eeee"));
    }

    /**
     * Test hex value, should fail.
     */
    @Test
    public void testHexFail() {
        Assert.assertNull(parser.parse("0x01"));
    }

}
