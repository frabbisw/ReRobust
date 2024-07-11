/* Checks if given string is a palindrome
>>> is_palindrome('')
True
>>> is_palindrome('aba')
True
>>> is_palindrome('aaaaa')
True
>>> is_palindrome('zbcd')
False */

public class IS_PALINDROME { public static boolean is_palindrome ( String text ) { int i = 0 ; while ( i < text.length () ) { if ( text.charAt ( i ) == text.charAt ( text.length () - i ) ) return true ; i += 1 ; } return false ; } }