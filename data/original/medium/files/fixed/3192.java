@ java.lang.Override public void onClick ( android.view.View v ) { v . setOnClickListener ( null ) ; java.lang.String num = ev . getText () . toString () . trim () ; if ( ( num == null ) || ( "" . equals ( num ) ) ) return; double n = parseDouble ( num ) ; if ( n == 0 ) setText ( "Error: Divide by zero." ) ; else setText ( inIntTermsOfAny ( ( n / ( currentValue ) ) ) , ev ) ; v . setVisibility ( View.GONE ) ; } 
