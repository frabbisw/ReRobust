import java.util.ArrayList;
import java.util.List;

public class GET_POSITIVE { public static List<Integer> get_positive ( List<Integer> numbers ) { List<Integer> result = new ArrayList<Integer> () ; try { for ( Integer number : numbers ) { if ( number > 0 ) { result.add ( number ) ; } } } catch ( Exception ex ) { ex.printStackTrace () ; } return result; }  }