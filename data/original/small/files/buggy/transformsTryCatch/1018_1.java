private java.lang.String getCommandFromUser() {
    try {
        java.lang.System.out.print("Command: ");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String command = scanner.nextLine();
    scanner.close();
    return command;
}
