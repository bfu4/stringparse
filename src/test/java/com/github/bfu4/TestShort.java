package com.github.bfu4;

import com.github.bfu4.stringparse.StringParser;
import com.github.bfu4.stringparse.parser.ParserMethod;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the short parser.
 */
public class TestShort {

        /**
         * Parser.
         */
        private StringParser parser;

        /**
         * Setup tasks.
         */
        @Before
        public void setup() {
            parser = new StringParser(ParserMethod.SHORT);
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
            short value = parser.parse("5");
            Assert.assertEquals(value, (short) 5);
        }

        /**
         * Test invalid string.
         */
        @Test
        public void testInvalidString() {
            Assert.assertNull(parser.parse("eeee"));
        }

}
