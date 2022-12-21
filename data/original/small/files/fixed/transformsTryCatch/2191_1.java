public static java.lang.String getInput() {
    try {
        java.lang.System.out.println("Please Enter An Input Below:");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Menu.scan = new java.util.Scanner(java.lang.System.in);
    java.lang.String input = Menu.scan.nextLine().replaceAll("\\s+", "");
    return input;
}
