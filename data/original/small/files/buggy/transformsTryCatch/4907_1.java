private java.lang.String serverOutput() throws java.io.IOException {
    java.lang.String input = "";
    try {
        input = bufferedReader.readLine();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (input == null) {
    }
    java.lang.System.out.println((input + " thunder"));
    return input;
}
