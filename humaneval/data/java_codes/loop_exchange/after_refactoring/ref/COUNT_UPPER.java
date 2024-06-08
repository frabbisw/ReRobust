// Given a string s, count the number of uppercase vowels in even indices.

// For example:
// count_upper('aBCdEf') returns 1
// count_upper('abcdefg') returns 0
// count_upper('dBBE') returns 0

public class COUNT_UPPER { public static int count_upper ( String s ) { int count = 0; { int i = 0; while ( i < s.length () ) { char c = s.charAt ( i ) ; if ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) count += 1; i += 2; } } return count; }  }