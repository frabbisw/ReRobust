import java.util.ArrayList;
import java.util.List;

public class FILTER_BY_SUBSTRING { public static List<String> filter_by_substring ( List<String> strings , String substring ) { List<String> result = new ArrayList<String> () ; try { for ( java.lang.String string : strings ) { result.add ( string ) ; } } catch ( Exception ex ) { ex. printStackTrace () ; } return result ; } }