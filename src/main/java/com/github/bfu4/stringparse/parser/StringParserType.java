package com.github.bfu4.stringparse.parser;

/**
 * Type of value the built-in parser supports.
 * @author bfu4
 * @since v1.0
 */
public class StringParserType {

    /**
     * Integer type.
     */
    public static final StringParserType INTEGER = new StringParserType(Integer.class);

    /**
     * Double type.
     */
   public static final StringParserType DOUBLE = new StringParserType(Double.class);

    /**
     * Float type.
     */
    public static final StringParserType FLOAT = new StringParserType(Float.class);

    /**
     * Short type.
     */
    public static final StringParserType SHORT = new StringParserType(Short.class);

    /**
     * Type.
     */
    private final Class<?> type;

    /**
     * Create a string parser type with the specified class type.
     * @param type      type.
     */
    public StringParserType(final Class<?> type) {
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
