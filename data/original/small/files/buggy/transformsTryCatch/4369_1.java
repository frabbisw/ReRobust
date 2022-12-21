public static void getFileTests() {
    Main.numberOfException = 0;
    Main.numberOfFiles = 0;
    java.lang.String directoryName = Main.path;
    try {
        Main.IsBuggy(directoryName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Main.createTest(directoryName);
}
