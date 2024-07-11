import java.util.ArrayList;
import java.util.Collections;

/*
 * Create a function that takes a string as input which contains only square brackets.
    The function should return True if and only if there is a valid subsequence of brackets 
    where at least one bracket in the subsequence is nested.

    is_nested('[[]]') ➞ True
    is_nested('[]]]]]]][[[[[]') ➞ False
    is_nested('[][]') ➞ False
    is_nested('[]') ➞ False
    is_nested('[[][]]') ➞ True
    is_nested('[[]][[') ➞ True

 */

public class IS_NESTED {
    
<s> public static boolean is_nested(String brackets) { ArrayList<Integer> opening_brackets = new ArrayList<>(); ArrayList<Integer> closing_brackets = new ArrayList<>(); for(int i = 0; i < brackets.length(); i++) { if(brackets.charAt(i) == '[') opening_brackets.add(i); else closing_brackets.add(i); } return opening_brackets.length () > ( closing_brackets.length () ) ; }

}
