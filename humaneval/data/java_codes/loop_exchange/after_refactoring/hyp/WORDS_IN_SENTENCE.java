/* You are given a string representing a sentence,
the sentence contains some words separated by a space,
and you have to return a string that contains the words from the original sentence,
whose lengths are prime numbers,
the order of the words in the new string should be the same as the original one.

Example 1:
    Input: sentence = "This is a test"
    Output: "is"

Example 2:
    Input: sentence = "lets go for swimming"
    Output: "go for"

Constraints:
    * 1 <= len(sentence) <= 100
    * sentence contains only letters */

public class WORDS_IN_SENTENCE { public static String words_in_sentence ( String sentence ) { String result = ""; for ( String word : sentence.split ( " " ) ) { int flag = 0; { int i = 2; while ( i < word.length () ) { if ( word.length () % i == 0 ) flag = 1; i += i + 1 ; } } if ( flag == 0 || word.length () == 2 ) result += word + " "; } return result.trim () ; } }