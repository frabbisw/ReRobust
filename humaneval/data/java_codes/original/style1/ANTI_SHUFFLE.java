import java.util.Arrays;

/* Write a function that takes a string and returns an ordered version of it.
Ordered version of string, is a string where all words (separated by space)
are replaced by a new word where all the characters arranged in
ascending order based on ascii value.
Note: You should keep the order of words and blank spaces in the sentence.

For example:
anti_shuffle('Hi') returns 'Hi'
anti_shuffle('hello') returns 'ehllo'
anti_shuffle('Hello World!!!') returns 'Hello !!!Wdlor' */

public class ANTI_SHUFFLE {
    
public static java.lang.String anti_shuffle(String s ) { java.lang.String result = null ; for (String str : s.split(" ")) { char[] chars = str.toCharArray(); java.lang.System.out . println ( chars.length ) ; java.lang.System.out . println ( chars.length ) ; result = str.toCharArray () ; } return result ; }

}
