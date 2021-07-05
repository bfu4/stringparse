package com.github.bfu4.stringparse.parser;

import java.util.Optional;
import java.util.function.Function;

/**
 * Parser method enumerator.
 * @author bfu4
 * @since v1.0
 */
public final class ParserMethod {

    /**
     * Integer.
     */
    public static final ParserMethod INTEGER = new ParserMethod(Integer.class, Integer::parseInt);

    /**
     * Double.
     */
    public static final ParserMethod DOUBLE = new ParserMethod(Double.class, Double::parseDouble);

    /**
     * Float.
     */
    public static final ParserMethod FLOAT = new ParserMethod(Float.class, Float::parseFloat);

    /**
     * Short.
     */
    public static final ParserMethod SHORT = new ParserMethod(Short.class, Short::parseShort);

    /**
     * Parser type.
     */
    private final StringParserType type;

    /**
     * Parser flow.
     */
    private final ParserFlow<?> flow;

    /**
     * Create a new parser method for the parser type.
     * @param type          type
     * @param function      function
     * @param <T>           type constraint
     */
    public <T> ParserMethod(final Class<T> type, final Function<String, T> function) {
        this.type = new StringParserType(type);
        this.flow = new ParserFlow<>(function);
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
        final ParserFlow<T> pf = (ParserFlow<T>) flow;
        final Optional<T> opt = pf.flow(string);
        return opt.orElse(null);
    }

}
