public static void update() {
    try {
        if (Update.checkInternetConnection()) {
            Update.update(true);
        } else {
            java.lang.System.out.println("Please restore internet connection and attempt update again");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
