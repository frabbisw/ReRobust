private java.lang.String firstSet ( java.lang.String expression ) { int end = ( expression . indexOf ( Constants.CLOSE_SQUARE_BRACKET ) ) + 1 ; if ( ( expression . length () ) > end ) { java.lang.String quantifier = java.lang.String . valueOf ( expression . charAt ( end ) ) ; if ( isQuantifier ( quantifier ) ) { end ++ ; } } return expression . substring ( 0 , end ) ; } 
