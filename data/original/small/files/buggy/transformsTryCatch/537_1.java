public void changeNumerator(int numerator) {
    try {
        if (numerator < 0) {
            java.lang.System.out.println("Fatal error:  Negative numerator.");
            java.lang.System.exit(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    numerator = numerator;
}
