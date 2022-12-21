private java.lang.String getCommandFromUser() {
    java.lang.System.out.print("Command: ");
    System.out.println("log");
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String command = scanner.nextLine();
    scanner.close();
    return command;
}
