private java.lang.String read() {
    System.out.println("log");
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String line = scanner.nextLine();
    scanner.close();
    return ('"' + line) + '"';
}
