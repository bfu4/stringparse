# stringparse
Looking for useless bloat?
Here's a concept offering just that!

StringParse is a utility for parsing strings into objects.. particularly numbers.
It's formatted in a way to return either a number or null instead of throwing a number format exception.

## What does this showcase?
* Optionals.
* Method references.
* The lovely checkstyle!

## Usage
```java
StringParser parser = new StringParser(ParserMethod.INTEGER);

int value = parser.parse("5"); // 5
Object invalid = parser.parse("invalid"); // null
```