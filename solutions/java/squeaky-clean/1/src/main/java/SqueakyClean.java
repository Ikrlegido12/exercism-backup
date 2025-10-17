class SqueakyClean {
    static String clean(String identifier) {
        if (identifier == null) {
            return null;
        }

        // Step 1: Replace spaces with underscores
        identifier = identifier.replace(' ', '_');

        // Step 2: Convert kebab-case to camelCase
        StringBuilder result = new StringBuilder();
        boolean nextUpperCase = false;
        for (char c : identifier.toCharArray()) {
            if (c == '-') {
                nextUpperCase = true; // Next character should be uppercase
            } else {
                if (nextUpperCase) {
                    result.append(Character.toUpperCase(c));
                    nextUpperCase = false;
                } else {
                    result.append(c);
                }
            }
        }
        identifier = result.toString();

        // Step 3: Convert leetspeak to normal text
        identifier = identifier.replace('4', 'a')
                               .replace('3', 'e')
                               .replace('0', 'o')
                               .replace('1', 'l')
                               .replace('7', 't');

        // Step 4: Omit characters that are not letters or underscores
        StringBuilder finalResult = new StringBuilder();
        for (char c : identifier.toCharArray()) {
            if (Character.isLetter(c) || c == '_') {
                finalResult.append(c);
            }
        }

        return finalResult.toString();
    }
}

/*
Introduction
Chars
The Java char type represents the smallest addressable components of text. Multiple chars can comprise a string such as "word" or chars can be processed independently. Their literals have single quotes e.g. 'A'.

There are many builtin library methods to inspect and manipulate chars. These can be found as static methods of the java.lang.Character class.

chars are sometimes used in conjunction with a StringBuilder object. This object has methods that allow a string to be constructed character by character and manipulated. At the end of the process toString can be called on it to output a complete string.

Instructions
In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.

In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is comprised of zero or more letters and underscores.

In all cases the input string is guaranteed to be non-null. Note that the clean method should treat an empty string as valid.

1. Replace any spaces encountered with underscores
Implement the (static) SqueakyClean.clean() method to replace any spaces with underscores. This also applies to leading and trailing spaces.

SqueakyClean.clean("my   Id");
// => "my___Id"
2. Convert kebab-case to camelCase
Modify the (static) SqueakyClean.clean() method to convert kebab-case to camelCase.

SqueakyClean.clean("a-bc");
// => "aBc"
3. Convert leetspeak to normal text
Modify the (static) SqueakyClean.clean() method to convert leetspeak to normal text.

For simplicity we will only be replacing 4, 3, 0, 1 and 7 with a, e, o, l, and t, respectively.

SqueakyClean.clean("H3ll0 W0rld");
// => "Hello_World"
SqueakyClean.clean("4 73s7");
// => "a_test"
4. Omit characters that are not letters
Modify the (static) SqueakyClean.clean() method to omit any characters that are not letters.

SqueakyClean.clean("a$#.b");
// => "ab"
 */