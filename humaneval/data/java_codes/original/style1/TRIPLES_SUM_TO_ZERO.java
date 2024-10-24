/* 
triples_sum_to_zero takes a list of integers as an input.
it returns True if there are three distinct elements in the list that
sum to zero, and False otherwise.

>>> triples_sum_to_zero([1, 3, 5, 0])
False
>>> triples_sum_to_zero([1, 3, -2, 1])
True
>>> triples_sum_to_zero([1, 2, 3, 7])
False
>>> triples_sum_to_zero([2, 4, -5, 3, 9, 7])
True
>>> triples_sum_to_zero([1])
False
*/

public class TRIPLES_SUM_TO_ZERO {
    
<s> public static boolean triples_sum_to_zero(int [] numbers) { for (int i = 0; i < numbers.length; i += 1) { <mask> if (numbers[i] + numbers[j] + numbers[k] == 0 ) return true; } return false; }

}