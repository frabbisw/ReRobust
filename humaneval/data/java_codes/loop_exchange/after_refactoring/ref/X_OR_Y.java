/* A simple program which should return the value of x if n is 
a prime number and should return the value of y otherwise.

Examples:
for x_or_y(7, 34, 12) == 34
for x_or_y(15, 8, 5) == 5 */

public class X_OR_Y { public static int x_or_y ( int n, int x, int y ) { if ( n == 1 ) return y; { int i = 2; while ( i < n ) { if ( n % i == 0 ) return y; i += 1; } } return x; }  }