// Return the largest prime factor of n. Assume n > 1 and is not a prime.
// >>> largest_prime_factor(13195)
// 29
// >>> largest_prime_factor(2048)
// 2

public class LARGEST_PRIME_FACTOR { public static boolean is_prime ( int k ) { if ( k < 2 ) return false; { int i = 2; while ( i < k ) { if ( k % i == 0 ) return false; i += 1; } } return true; }  }