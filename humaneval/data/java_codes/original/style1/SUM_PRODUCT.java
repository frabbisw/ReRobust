import java.util.List;

public class SUM_PRODUCT {
    
public static java.lang.Integer [] sum_product(List<Integer> numbers) { java.lang.Integer [] result = new java.lang.Integer [ numbers.length ] ; for (Integer n : numbers ) { result[0] += n; result[1] *= n; } return result ; }

}
