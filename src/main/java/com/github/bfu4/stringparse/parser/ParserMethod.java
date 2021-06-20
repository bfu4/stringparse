package com.github.bfu4.stringparse.parser;

import java.util.Optional;
import java.util.function.Function;

/**
 * Parser method enumerator.
 * @author bfu4
 * @since v1.0
 */
public enum ParserMethod {

    /**
     * Integer.
     */
    INTEGER(StringParserType.INTEGER, Integer::parseInt),

    /**
     * Double.
     */
    DOUBLE(StringParserType.DOUBLE, Double::parseDouble),

    /**
     * Float.
     */
    FLOAT(StringParserType.FLOAT, Float::parseFloat),

    /**
     * Short.
     */
    SHORT(StringParserType.SHORT, Short::parseShort);

    /**
     * Parser type.
     */
    private final StringParserType type;

    /**
     * Parser flow.
     */
    private final ParserFlow<?> flow;

    /**
     * Flow function.
     */
    private final Function<String, ?> function;

    /**
     * Create a new parser method for the parser type.
     * @param type          type
     * @param function      function
     * @param <T>           type constraint
     */
    <T> ParserMethod(final StringParserType type, final Function<String, T> function) {
        this.type = type;
        this.flow = ParserFlow.empty();
        this.function = function;
    }

    /**
     * Get the string parser type.
     * @return      parser type.
     */
    public StringParserType getType() {
        return type;
    }

    /**
     * Apply the parser method flow to the requested string.
     * @param string        string
     * @param <T>           type constraints
     * @return              parsed
     */
    public <T> T apply(final String string) {
        ParserFlow<T> pf = (ParserFlow<T>) flow;
        Optional<T> opt = pf.flow((Function<String, T>) function, string);
        return opt.orElse(null);
    }

}
