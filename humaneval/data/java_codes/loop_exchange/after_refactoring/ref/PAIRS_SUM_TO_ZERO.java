import java.util.List;

/* pairs_sum_to_zero takes a list of integers as an input.
it returns True if there are two distinct elements in the list that
sum to zero, and False otherwise. */

public class PAIRS_SUM_TO_ZERO { public static boolean pairs_sum_to_zero ( List<Integer> l ) { for ( int i = 0; i < l.size () ; i += 1 ) { { int j = i + 1; while ( j < l.size () ) { if ( l.get ( i ) + l.get ( j ) == 0 ) return true; j += 1; } } } return false; }  }