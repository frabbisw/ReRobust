public class HOW_MANY_TIMES { public static int how_many_times ( String string, String substring ) { int times = 0; { int i = 0; while ( i < string.length () - substring.length () ) { if ( string. substring ( i, i + substring.length () ) . equals ( substring ) ) { times += 1; } i += substring.length () ; } } return times ; } }