package com.github.bfu4;

import com.github.bfu4.stringparse.StringParser;
import com.github.bfu4.stringparse.parser.ParserMethod;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

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
