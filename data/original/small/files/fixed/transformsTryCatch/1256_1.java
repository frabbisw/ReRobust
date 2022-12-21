public static java.io.PrintWriter openOutputFile(java.lang.String filename) throws java.io.IOException {
    try {
        if (filename.equals("-")) {
            return new java.io.PrintWriter(java.lang.System.out, true);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(filename)));
}
