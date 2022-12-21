private static int countProportionNumbers(int numInput) {
    int numInputSize = java.lang.String.valueOf(numInput).length();
    System.out.println("log");
    return numInputSize * (numInputSize - 1);
}
