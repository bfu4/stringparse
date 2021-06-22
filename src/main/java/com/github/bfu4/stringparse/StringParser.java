package com.github.bfu4.stringparse;

import com.github.bfu4.stringparse.parser.ParserMethod;
import com.github.bfu4.stringparse.parser.StringParserType;
import org.jetbrains.annotations.NotNull;

/**
 * Main parser object.
 */
public class StringParser {

    /**
     * Method of parsing.
     */
    private final ParserMethod method;

    /**
     * Type of the parser.
     */
    private final StringParserType type;

    /**
     * Create a new StringParser from a given parser method.
     * @param method        parser method.
     */
    public StringParser(@NotNull final ParserMethod method) {
        this.method = method;
        this.type = method.getType();
    }

    /**
     * Get type.
     * @return      get the parser type
     */
    public StringParserType getType() {
        return type;
    }

    /**
     * Parse a string and return the value typed as specified via the parser type.
     * @param string        string
     * @param <T>           type constraints
     * @return              parsed value, or null
     */
    public <T> T parse(final String string) {
        return method.apply(string);
    }

}
