/* You'll be given a string of words, and your task is to count the number
of boredoms. A boredom is a sentence that starts with the word "I".
Sentences are delimited by '.', '?' or '!'.

For example:
>>> is_bored("Hello world")
0
>>> is_bored("The sky is blue. The sun is shining. I love this weather")
1 */

public class IS_BORED {
    
public static int is_bored(String S ) { java.lang.String [] sentences = S.split("\\.|\\?|!"); int result = 0 ; for (String sentence : sentences) { <mask> result += sentence . length () ; } return result ; }

}
