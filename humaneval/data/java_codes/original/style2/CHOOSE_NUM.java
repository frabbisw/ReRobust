/*
    This function takes two positive numbers x and y and returns the
    biggest even integer number that is in the range [x, y] inclusive. If 
    there's no such number, then the function should return -1.

    For example:
    choose_num(12, 15) = 14
    choose_num(13, 12) = -1
*/

public class CHOOSE_NUM {
    
public static int choose_num(int x, int y) { /* if(x < y) return -1; */ <mask> if((y % 2) == 0) return y; if(x == y) return -1; return y - 1 ; <s> java.lang.System.out . println () ; }

}
