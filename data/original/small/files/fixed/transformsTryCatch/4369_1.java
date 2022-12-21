public static void getFileTests() {
    Main.numberOfException = 0;
    Main.numberOfFiles = 0;
    try {
        Main.IsBuggy(Main.path);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Main.createTest(Main.path);
}
