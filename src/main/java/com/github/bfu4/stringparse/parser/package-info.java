/**
 * The parser package defines all internal parser functions.
 *
 * The {@link com.github.bfu4.stringparse.parser.ParserFlow ParserFlow} defines the actual flow, handling
 *      the invocation and making the optional.
 * The {@link com.github.bfu4.stringparse.parser.ParserMethod ParserMethod} handles application
 *      of the flow, and sorts it all into an enumerator.
 * The {@link com.github.bfu4.stringparse.parser.Parser Parser} is a simple lambda used for parsing strings.
 * The {@link com.github.bfu4.stringparse.parser.StringParserType StringParserType} handles typing for numeric parsers.
 *
 * @author bfu4
 * @since v1.0
 */
package com.github.bfu4.stringparse.parser;
