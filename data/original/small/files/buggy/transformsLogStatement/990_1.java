public static void update() {
    System.out.println("log");
    if (Update.checkInternetConnection()) {
        Update.update(true);
    } else {
        java.lang.System.out.println("Please restore internet connection and attempt update again");
    }
}
