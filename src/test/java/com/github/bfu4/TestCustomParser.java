package com.github.bfu4;

import com.github.bfu4.stringparse.StringParser;
import com.github.bfu4.stringparse.parser.ParserMethod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.function.Function;

/**
 * Test a custom parser.
 */
public class TestCustomParser {
    /**
     * Parser.
     */
    private StringParser parser;

    /**
     * Setup tasks.
     */
    @Before
    public void setup() {
        // Test function to count the occurrences of A.
        Function<String, Integer> countAOccurrences = (string) -> {
            int count = 0;
            for (char character : string.toCharArray()) {
                if (character == 'a') {
                    count++;
                }
            }
            return count;
        };

        ParserMethod method = new ParserMethod(Integer.class, countAOccurrences);
        parser = new StringParser(method);
    }

    /**
     * Test the custom parser, parses a value from the occurrences of
     * the character 'a' in a string.
     */
    @Test
    public void testCustomMethod() {
        String testString = "aaaaa"; // all a's
        int parsedValue = parser.parse(testString);
        Assert.assertEquals(testString.length(), parsedValue);

        testString = "ababab"; // Some a's, some b's
        parsedValue = parser.parse(testString);
        Assert.assertEquals(testString.length() / 2, parsedValue);
    }

}
