/* remove_vowels is a function that takes string and returns string without vowels.
>>> remove_vowels('')
''
>>> remove_vowels("abcdef\nghijklm")
'bcdf\nghjklm'
>>> remove_vowels('abcdef')
'bcdf'
>>> remove_vowels('aaaaa')
''
>>> remove_vowels('aaBAA')
'B'
>>> remove_vowels('zbcd')
'zbcd' */

public class REMOVE_VOWELS {
    
public static java.lang.String remove_vowels(String string ) { java.lang.StringBuilder sb = new java.lang.StringBuilder () ; for (char c : string.toCharArray () ) { <mask> continue; sb.append(c); } return sb. toString () ; }

}
