import java.util.List;

public class HAS_CLOSE_ELEMENTS { public static boolean has_close_elements ( List<Double> numbers, double threshold ) { { int i = 0; while ( i < numbers.size () ) { for ( int j = i + 1; j < numbers.size () ; j += 1 ) { double distance = Math.abs ( numbers.get ( i ) - numbers.get ( j ) ) ; if ( distance < threshold ) return true; } i += 1; } } return false; }  }