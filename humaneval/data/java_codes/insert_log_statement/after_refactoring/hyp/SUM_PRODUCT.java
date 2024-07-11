import java.util.List;

public class SUM_PRODUCT { public static java.lang.Integer [] sum_product ( java.lang.Integer [] numbers ) { java.lang.Integer [] result = new java.lang.Integer [ numbers.length ] ; for ( java.lang.Integer n : numbers ) { result[0] += n ; result[1] *= n ; } return result ; } }