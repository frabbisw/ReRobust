private java.lang.String getCommandFromUser() {
    try {
        java.lang.System.out.print("Command: ");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.String command = scanner.nextLine();
    return command;
}
