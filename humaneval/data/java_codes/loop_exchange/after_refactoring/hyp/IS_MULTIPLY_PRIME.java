// Write a function that returns true if the given number is the multiplication of 3 prime numbers
// and false otherwise.
// Knowing that (a) is less then 100. 
// Example:
// is_multiply_prime(30) == True
// 30 = 2 * 3 * 5

public class IS_MULTIPLY_PRIME { public static boolean is_prime ( int n ) { int i = 2; while ( i < n ) { if ( n % i == 0 ) return false; i += 1 ; } return true ; } }