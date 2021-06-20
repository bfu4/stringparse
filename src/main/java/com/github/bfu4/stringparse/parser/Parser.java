package com.github.bfu4.stringparse.parser;

import java.util.Optional;

/**
 * Parser interface used for parsing.
 * @param <T>   type to parse
 * @author bfu4
 * @since v1.0
 */
@FunctionalInterface
interface Parser<T> {

    /**
     * Parse a value from a specified string.
     * @param string        string to parse.
     * @return              parsed value.
     */
    Optional<T> from(String string);

}
