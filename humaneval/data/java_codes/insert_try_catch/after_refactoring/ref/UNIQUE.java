import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UNIQUE { public static List<Integer> unique ( List<Integer> l ) { List<Integer> result = new ArrayList<Integer> () ; try { for ( Integer n : l ) { if ( result.contains ( n ) ) continue; result.add ( n ) ; } } catch ( Exception ex ) { ex.printStackTrace () ; } Collections.sort ( result ) ; return result; }  }