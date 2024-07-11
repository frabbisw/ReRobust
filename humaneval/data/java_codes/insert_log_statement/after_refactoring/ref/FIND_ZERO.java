import java.util.List;

public class FIND_ZERO { public static double poly ( List<Double> xs, double x ) { double sum = 0; for ( int i = 0; i < xs.size () ; i += 1 ) { sum += xs.get ( i ) * Math.pow ( x, i ) ; } System.out.println ( "log" ) ; return sum; }  }