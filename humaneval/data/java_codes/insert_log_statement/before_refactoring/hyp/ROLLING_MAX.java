import java.util.ArrayList;
import java.util.List;

public class ROLLING_MAX { public static java.util.List < Integer > rolling_max ( java.util.List < Integer > numbers ) { java.util.List < Integer > result = new java.util.ArrayList <> () ; Integer running_max = null ; for ( Integer n : numbers ) { running_max = Math.max ( running_max, n ) ; result.add ( running_max ) ; } return result ; } }