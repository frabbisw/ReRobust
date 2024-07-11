/*
 * You are given a list of two strings, both strings consist of open
    parentheses '(' or close parentheses ')' only.
    Your job is to check if it is possible to concatenate the two strings in
    some order, that the resulting string will be good.
    A string S is considered to be good if and only if all parentheses in S
    are balanced. For example: the string '(())()' is good, while the string
    '())' is not.
    Return 'Yes' if there's a way to make a good string, and return 'No' otherwise.

    Examples:
    match_parens(['()(', ')']) == 'Yes'
    match_parens([')', ')']) == 'No'
 */

public class MATCH_PARENS {
    public static boolean check(String s) {
        int val = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') val--;
            else val++;
            if(val < 0) return false;
        }
        return val == 0;
    }
    
@ java.lang.Override public java.lang.String toString () { java.lang.String s = new java.lang.String () ; java.lang.System.out . println ( s ) ; java.lang.System.out . println ( s.length () ) ; java.lang.System.out . println ( s.length () ) ; java.lang.System.out . println () ; return s ; }

}
