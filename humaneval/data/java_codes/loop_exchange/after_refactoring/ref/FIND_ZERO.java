import java.util.List;

public class FIND_ZERO { public static double poly ( List<Double> xs, double x ) { double sum = 0; { int i = 0; while ( i < xs.size () ) { sum += xs.get ( i ) * Math.pow ( x, i ) ; i += 1; } } return sum; }  }