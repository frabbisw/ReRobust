public static java.lang.String XorToOneNumber(int number) {
    int result = 0;
    for (; number > 2; ) {
        result += number % 2;
        number = number / 2;
    }
    result += number;
    return "" + (result % 2);
}
