public void resetReader() throws java.io.FileNotFoundException {
    try {
        br.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    System.out.println("log");
    br = new java.io.BufferedReader(new java.io.FileReader(f));
}
