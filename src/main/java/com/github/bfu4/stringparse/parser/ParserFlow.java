package com.github.bfu4.stringparse.parser;

import java.util.Optional;
import java.util.function.Function;

public final class ParserFlow<T> {

    /**
     * Empty flow.
     * @param <T>       type constraints.
     * @return          empty parser flow.
     */
    public static <T> ParserFlow<T> empty() {
        return new ParserFlow<T>((string) -> null);
    }


    /**
     * Parser instance.
     */
    private final Function<String, T> parser;

    /**
     * Create a new parser flow with the specified parser.
     * @param parser        parser
     */
    public ParserFlow(final Function<String, T> parser) {
        this.parser = parser;
    }

    /**
     * Get the parser.
     * @return      parser
     */
    public Function<String, T> getParser() {
        return parser;
    }

    /**
     * Complete the flow, into an optional with the specified function and string.
     * @param string        string
     * @return              parsed value
     */
    public Optional<T> flow(final String string) {
        try {
            return Optional.of(parser.apply(string));
        } catch (Exception exception) {
            return Optional.empty();
        }
    }

}
