package com.github.bfu4.stringparse.parser;

import org.jetbrains.annotations.Nullable;
import java.util.Optional;
import java.util.function.Function;

public final class ParserFlow<T> {

    /**
     * Empty flow.
     * @param <T>       type constraints.
     * @return          empty parser flow.
     */
    public static <T> ParserFlow<T> empty() {
        return new ParserFlow<>((string) -> Optional.empty());
    }


    /**
     * Parser instance.
     */
    private final Parser<T> parser;

    /**
     * Create a new parser flow with the specified parser.
     * @param parser        parser
     */
    public ParserFlow(@Nullable final Parser<T> parser) {
        this.parser = parser;
    }

    /**
     * Get the parser.
     * @return      parser
     */
    public Parser<T> getParser() {
        return parser;
    }

    /**
     * Complete the flow, into an optional with the specified function and string.
     * @param function      function
     * @param string        string
     * @return              parsed value
     */
    public Optional<T> flow(final Function<String, T> function, final String string) {
        try {
            return Optional.of(function.apply(string));
        } catch (Exception exception) {
            return Optional.empty();
        }
    }

}
