public class StringTraining {

    /**
     * @param firstname, ie : "Brandon"
     * @return a string that concatenates "Hello " and firstname, ie : "Hello Brandon"
     */
    public static String helloFirstname(String firstname) {

        return "Hello ";
    }

    /**
     * @param first  word, ie : "test"
     * @param second word, ie : "value"
     * @return a string with both word, ie : "testvalue"
     */
    public static String concatArgs(String first, String second) {

        return "";
    }

    /**
     * @param origin  string, ie: "test"
     * @param compare string, ie: "sample"
     * @return if origin string is equal to compare string
     */
    public static boolean equals(String origin, String compare) {

        return false;
    }

    /**
     * @param value character, ie: 't'
     * @return conversion of the character into String, ie: "t"
     */
    public static String charToString(char value) {

        return "";
    }

    /**
     * @param value integer, ie: 3
     * @return convertion of the integer into String, ie: "3"
     */
    public static String intToString(int value) {

        return "";
    }

    /**
     * @param string, ie: "test"
     * @return string length, ie: 4
     */
    public static int length(String string) {

        return 0;
    }

    /**
     * @param string, ie "test"
     * @return string in upper case, ie: "TEST"
     */
    public static String upper(String string) {

        return "";
    }

    /**
     * @param string, ie: "TEST"
     * @return string in lower case, ie: "test"
     */
    public static String lower(String string) {

        return "";
    }

    /**
     * @param string, ie: "test"
     * @return first character of the string, ie: 't'
     */
    public static char firstChar(String string) {

        return '*';
    }

    /**
     * @param string, ie: "value"
     * @return last character of the string, ie: 'e'
     */
    public static char lastChar(String string) {

        return '*';
    }

    /**
     * @param string, ie: "test"
     * @param begin   position (inclusive) of the substring, ie: 1
     * @param end     postion (exclusive) of the substring, ie: 3
     * @return the substring from begin position to end position, ie: "es"
     */
    public static String subString(String string, int begin, int end) {
        // https://howtodoinjava.com/java/string/java-string-substring-example/

        return "";
    }

    /**
     * @param string, ie: "test"
     * @return the string with the first character in upper case, ie: "Test"
     */
    public static String firstUpper(String string) {

        return "";
    }

    /**
     * @param string, ie: "test"
     * @param search  character, ie: 't'
     * @return the number of character occurrences in string, ie: 2
     */
    public static int occurrences(String string, char search) {

        return 0;
    }

    /**
     * @param string,  ie: "test"
     * @param search,  ie: 't'
     * @param replace, ie: 'w'
     * @return the string where searched characters are replaced, ie: "wesw"
     */
    public static String replaceChar(String string, char search, char replace) {

        return "";
    }

    /**
     * @param string,  ie: "test"
     * @param search,  ie: "e"
     * @param replace, ie: "oa"
     * @return the string where searched substring are replaced, ie: "toast"
     */
    public static String replaceString(String string, String search, String replace) {

        return "";
    }

    /**
     * @param string,    ie: "test|value"
     * @param delimiter, ie: "|"
     * @return string array that contains values splited on the delimiter, ie: {"test", "value"}
     */
    public static String[] split(String string, String delimiter) {
        // https://howtodoinjava.com/java/string/java-string-split-example/

        return null;
    }

    /**
     * @param strings    array, ie: {"test", "value"}
     * @param delimiter, ie: ";"
     * @return string of array values joined with the delimiter, ex: "test;value"
     */
    public static String join(String[] strings, String delimiter) {
        // https://howtodoinjava.com/java8/java-8-join-string-array-example/

        return "";
    }
}
