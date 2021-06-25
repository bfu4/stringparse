package com.github.bfu4;

import com.github.bfu4.stringparse.StringParser;
import com.github.bfu4.stringparse.parser.ParserMethod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test a simple lambda as a parser.
 */
public class TestLambda {

    /**
     * Parser.
     */
    private StringParser parser;

    /**
     * Setup tasks.
     */
    @Before
    public void setup() {
        ParserMethod method = new ParserMethod(String.class, (string) -> string);
        parser = new StringParser(method);
    }

    /**
     * Test the lambda defined method.
     */
    @Test
    public void testLambda() {
        String valueToParse = "string";
        String string = parser.parse(valueToParse);
        Assert.assertEquals(string, valueToParse);
    }

    /**
     * Validate the return type.
     */
    @Test
    public void validateType() {
        String result = parser.parse("string");
        Assert.assertEquals(result.getClass().getCanonicalName(), "java.lang.String");
    }

}
