public class CONCATENATE {
    
public static java.lang.String concatenate(String [] strings ) { java.lang.String result = new java.lang.String () ; if ( ( strings.length ) == 0 ) { return null ; } else { for (String string : strings ) result += string; return result ; } }

}
