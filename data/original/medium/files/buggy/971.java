public void xor ( int mask ) { int res = ( value ) ^ ( mask & 8388607 ) ; if ( ( ( ( mask & 8388608 ) != 0 ) && ( ( ( value ) & -2147483648 ) == 0 ) ) || ( ( ( mask & 8388608 ) == 0 ) && ( ( ( value ) & -2147483648 ) != 0 ) ) ) { res = - res ; } value = res ; } 
