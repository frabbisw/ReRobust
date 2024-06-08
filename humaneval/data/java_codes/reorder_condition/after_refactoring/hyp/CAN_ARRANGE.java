/*
 * Create a function which returns the largest index of an element which
    is not greater than or equal to the element immediately preceding it. If
    no such element exists then return -1. The given array will not contain
    duplicate values.

    Examples:
    can_arrange([1,2,4,3,5]) = 3
    can_arrange([1,2,3]) = -1

 */

public class CAN_ARRANGE { public static int can_arrange ( int[] arr ) { int ind = 1 + ( arr.length ) ; for ( int i = 0; i < arr.length - 1; i++ ) { if ( arr[i] < arr[1 + i] ) ind = 1 + i ; } return ind ; } }