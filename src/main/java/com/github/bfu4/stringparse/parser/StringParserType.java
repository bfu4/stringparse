package com.github.bfu4.stringparse.parser;

/**
 * Type of value the built-in parser supports.
 * @author bfu4
 * @since v1.0
 */
public enum StringParserType {

    /**
     * Integer type.
     */
    INTEGER(Integer.class),

    /**
     * Double type.
     */
    DOUBLE(Double.class),

    /**
     * Float type.
     */
    FLOAT(Float.class),

    /**
     * Short type.
     */
    SHORT(Short.class);

    /**
     * Type.
     */
    private final Class<?> type;

    /**
     * Create a string parser type with the specified class type.
     * @param type      type.
     */
    StringParserType(final Class<?> type) {
        this.type = type;
    }

    /**
     * Get type.
     * @return      type
     */
    public Class<?> getType() {
        return type;
    }

}
