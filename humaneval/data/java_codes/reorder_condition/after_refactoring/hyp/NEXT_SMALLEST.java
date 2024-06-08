import java.util.*;

/* You are given a list of integers.
Write a function next_smallest() that returns the 2nd smallest element of the list.
Return None if there is no such element.

next_smallest([1, 2, 3, 4, 5]) == 2
next_smallest([5, 1, 4, 3, 2]) == 2
next_smallest([]) == None
next_smallest([1, 1]) == None */

public class NEXT_SMALLEST { public static Integer next_smallest ( int [] lst ) { List<Integer> numbers = new ArrayList<Integer> () ; for ( int i = 0 ; i < ( lst.length ) ; i ++ ) numbers.add ( i ) ; Integer [] no_duplicate = numbers.toArray ( new Integer[] {} ) ; Arrays.sort ( no_duplicate ) ; if ( 2 > no_duplicate.length ) return null ; return no_duplicate[1]; } }