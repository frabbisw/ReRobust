public static int digit_sum ( String s ) { int result = 0; for ( char c : s.toCharArray ( ) ) { if ( c == ' ' ) break; if ( 'A' < = c && c < = 'Z' ) result += ( int ) c; } return result; }
