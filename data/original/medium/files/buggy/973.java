public int colContains ( int col , int num ) { int count = 0 ; for ( int o = 0 ; o < 9 ; o ++ ) { if ( ( this . grid [ o ] [ col ] . value ) == num ) count ++ ; } return count ; } 
