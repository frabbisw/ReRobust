import java.util.ArrayList;

public class PRIME_FIB { public static boolean is_prime ( int n ) { if ( n < 2 ) return false; { int i = 2; while ( i < ( int ) Math.sqrt ( n ) ) { if ( n % i == 0 ) return false; i += 1 ; } } return true ; } }