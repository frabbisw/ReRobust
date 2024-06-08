import java.util.ArrayList;

/*
 * Given a non-empty list of integers, return the sum of all of the odd elements
 * that are in even positions.
    
    Examples
    solution([5, 8, 7, 1]) ==> 12
    solution([3, 3, 3, 3, 3]) ==> 9
    solution([30, 13, 24, 321]) ==>0
 */

public class SOLUTION { public static int solution ( ArrayList<Integer> lst ) { int result = 0; try { for ( int i = 0; i < lst.size () ; i++ ) { if ( ( i % 2 ) == 1 ) { if ( lst.get ( i ) % 2 ) { result += lst.get ( i ) ; } } } } catch ( Exception ex ) { ex.printStackTrace () ; } return result ; } }