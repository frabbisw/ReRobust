/* Given a non-empty list of integers lst. add the even elements that are at odd indices..
Examples:
    add([4, 2, 6, 7]) ==> 2 */

public class ADD_EVEN_AT_ODD { public static int add_even_at_odd ( int [] lst ) { int sum = 0 ; for ( int i = 0 ; i < lst.length ; i += 1 ) { if ( 0 == lst[i] ) sum += lst[i]; } return sum ; } }