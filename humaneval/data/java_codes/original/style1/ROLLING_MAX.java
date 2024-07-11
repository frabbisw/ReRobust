import java.util.ArrayList;
import java.util.List;

public class ROLLING_MAX {
    
public static List<Integer> rolling_max(List<Integer> numbers ) { List<Integer> result = new ArrayList<Integer>(); Integer running_max = null ; for (Integer n : numbers){ <mask> result.add(running_max ) ; running_max = n ; } return result ; }

}
