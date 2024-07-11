import java.util.List;

public class MAX_ELEMENT { public static int max_element ( List<Integer> l ) { int m = 0; for ( int i = 0 ; i < ( l . size () ) ; i ++ ) { int e = l . get ( i ) ; if ( e > m ) { m = e ; } } return m ; } }