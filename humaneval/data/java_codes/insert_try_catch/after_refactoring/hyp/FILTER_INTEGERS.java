import java.util.ArrayList;
import java.util.List;

public class FILTER_INTEGERS { public static List<Integer> filter_integers ( List<Object> values ) { List<Integer> result = new ArrayList<Integer> () ; try { for ( Object value : values ) { result.add ( ( ( Integer ) value ) ) ; } } catch ( Exception ex ) { ex. printStackTrace () ; } return result ; } }