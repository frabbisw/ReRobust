// Given a positive integer, obtain its roman numeral equivalent as a string,
// and return it in lowercase.
// Restrictions: 1 <= num <= 1000

// Examples:
// >>> int_to_mini_roman(19) == 'xix'
// >>> int_to_mini_roman(152) == 'clii'
// >>> int_to_mini_roman(426) == 'cdxxvi'

public class INT_TO_MINI_ROMAN { public static java.lang.String int_to_mini_roman ( int number ) { java.lang.String [] num = new java.lang.String [] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 }; java.lang.String [] sym = new java.lang.String [] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" }; int i = 12; java.lang.String result = new java.lang.String [ num.length ] ; while ( 0 < number ) { result += sym[i]; number %= num[i]; i -= 1; } return result.toLowerCase () ; } }