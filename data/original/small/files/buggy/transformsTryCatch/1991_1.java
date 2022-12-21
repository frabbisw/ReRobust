private java.lang.String read() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String line = scanner.nextLine();
    try {
        scanner.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ('"' + line) + '"';
}
