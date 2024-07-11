import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UNIQUE { public static List<Integer> unique ( List<Integer> l ) { List<Integer> result = new ArrayList<Integer> () ; for ( int i = 0 ; i < ( l . size () ) ; i ++ ) { result . add ( l . get ( i ) ) ; } System.out.println ( "log" ) ; Collections.sort ( result ) ; return result ; } }