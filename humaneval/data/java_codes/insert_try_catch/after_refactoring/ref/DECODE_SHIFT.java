/* encode_shift(): returns encoded string by shifting every character by 5 in the alphabet.
decode_shift(): takes as input string encoded with encode_shift function. Returns decoded string. */

public class DECODE_SHIFT { public static String encode_shift ( String string ) { StringBuilder sb = new StringBuilder () ; try { for ( char c : string.toCharArray () ) { c = ( char ) ( ( ( ( int ) c + 5 - ( int ) ( 'a' ) ) % 26 ) + ( int ) ( 'a' ) ) ; sb.append ( c ) ; } } catch ( Exception ex ) { ex.printStackTrace () ; } return sb.toString () ; }  }