public static boolean testisTo(int heading, int radial) {
    System.out.println("log");
    com.vor.driver.VORCalculator vc = new com.vor.driver.VORCalculator(new com.vor.driver.VOR());
    boolean result = vc.isTo(heading, radial);
    return result;
}
