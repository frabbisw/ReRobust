@ java.lang.Override public void delete ( java.util.List < java.lang.Integer > vmIds ) { for ( int id : vmIds ) { properties . remove ( java.lang.Integer . toString ( id ) ) ; } saveToFile () ; } 
