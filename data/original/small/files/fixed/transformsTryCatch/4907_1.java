private java.lang.String serverOutput() throws java.io.IOException {
    java.lang.String input = "";
    input = bufferedReader.readLine();
    if (input == null) {
    }
    try {
        java.lang.System.out.println(input);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return input;
}
