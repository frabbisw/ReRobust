import java.util.ArrayList;
import java.util.List;

public class FILTER_BY_PREFIX {
    
<s> public static List<String> filter_by_prefix(List<String> strings, String prefix ) { List<String> result = new ArrayList<String>(); for (String string : strings ) { <mask> result.add(string); } return result ; }

}
