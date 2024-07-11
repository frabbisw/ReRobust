public static String int_to_mini_roman(int number) {
    int[] num = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
    String[] sym = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
    int var = 12;
    String result = "";
    while (number > 0) {
        int div = (int) (number / num[var]);
        while (div > 0) {
            result += sym[var];
            div -= 1;
        }
        number %= num[var];
        var -= 1;
    }
    return result.toLowerCase();
}
