private boolean contains ( java.io.File file ) { boolean result ; try { java.lang.String sFile = file . toString () ; result = ( ( ( location . length () ) > 0 ) && ( sFile . startsWith ( location . toString () ) ) ) || ( sFile . startsWith ( location . getCanonicalPath () . toString () ) ) ; } catch ( java.io.IOException e ) { result = false ; } return result ; } 
