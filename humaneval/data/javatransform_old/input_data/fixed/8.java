public static int add_elements ( ArrayList < Integer > arr, int k ) { int result = 0; for ( int i = 0; i < k; i++ ) { if ( Integer.toString ( arr.get ( i ) ) .length ( ) < = 2 ) { result += arr.get ( i ) ; } } return result; }
