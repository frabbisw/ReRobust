/* Given a positive integer n, return the count of the numbers of n-digit
positive integers that start or end with 1. */

public class STARTS_ONE_ENDS { public static int starts_one_ends ( int n ) { if ( n == 1 ) return 1 ; return ( int ) ( Math.pow ( 10, n - 2 ) * ( 10 + 9 ) ) ; } }