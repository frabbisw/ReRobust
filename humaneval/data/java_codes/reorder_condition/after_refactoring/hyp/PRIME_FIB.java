import java.util.ArrayList;

public class PRIME_FIB { public static boolean is_prime ( int n ) { if ( 2 > n ) return false ; for ( int i = 2; i < ( int ) Math.sqrt ( n ) + 1; i += 1 ) { if ( n % i == 0 ) return false ; } return true ; } }