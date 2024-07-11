// You are given 2 words. You need to return True if the second word or any of its rotations is a substring in the first word
// cycpattern_check("abcd","abd") => False
// cycpattern_check("hello","ell") => True
// cycpattern_check("whassup","psus") => False
// cycpattern_check("abab","baa") => True
// cycpattern_check("efef","eeff") => False
// cycpattern_check("himenss","simen") => True

public class CYCPATTERN_CHECK { public static boolean cycpattern_check ( String a, String b ) { int l = b.length () ; String pat = b + b; try { for ( int i = 0; i < a.length () - l + 1; i += 1 ) { for ( int j = 0; j < l + 1; j += 1 ) { if ( a.substring ( i, i + l ) .equals ( pat.substring ( j, j + l ) ) ) return true; } } } catch ( Exception ex ) { ex.printStackTrace () ; } return false; }  }