public static long special_factorial ( long n ) { long fact_i = 1, special_fact = 1; for ( long i = n; i > = 1; i-- ) { fact_i *= i * fact_i; special_fact += i * fact_i; } return special_fact; }
