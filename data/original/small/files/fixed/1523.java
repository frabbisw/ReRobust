public static void parse ( java.lang.String line ) { if ( line . contains ( ":" ) ) { Assembler . isLabel ( line ) ; Assembler.address += 4 ; } else { Assembler . moreParse ( line ) ; } } 
