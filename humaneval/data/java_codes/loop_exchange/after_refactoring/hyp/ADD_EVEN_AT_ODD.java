/* Given a non-empty list of integers lst. add the even elements that are at odd indices..
Examples:
    add([4, 2, 6, 7]) ==> 2 */

public class ADD_EVEN_AT_ODD { public static int add_even_at_odd ( int [] lst ) { int sum = 0; { int i = 0; while ( i < ( lst.length ) ) { if ( lst[i] % 2 == 0 ) sum += lst[i]; i += 1 ; } } return sum ; } }