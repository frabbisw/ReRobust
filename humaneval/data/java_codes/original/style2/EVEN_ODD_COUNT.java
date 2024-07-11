// Given an integer. return a tuple that has the number of even and odd digits respectively.

//     Example:
//     even_odd_count(-12) ==> (1, 1)
//     even_odd_count(123) ==> (1, 2)

public class EVEN_ODD_COUNT {
    
public static int[] even_odd_count(int num) { int even_count = 0; int odd_count = 0; /* for (char c : (num + "").toCharArray()) { if ( ( even_count ) == 0 ) even_count = 0 ; if ( ( odd_count ) == 0 ) odd_count = 0 ; if ( ( odd_count ) == 0 ) odd_count = 0 ; if ( ( even_count ) == 0 ) odd_count = 0 ; if ( ( odd_count ) == 0 ) odd_count = 0 ; if ( ( even_count ) == 0 ) odd_count = 0 ; } return new int[] {even_count, odd_count}; }

}
