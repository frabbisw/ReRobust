public static java.lang.String XorToOneNumber(int number) {
    int result = 0;
    while (2 < number) {
        result += number % 2;
        number = number / 2;
    }
    result += number;
    return "" + (result % 2);
}
