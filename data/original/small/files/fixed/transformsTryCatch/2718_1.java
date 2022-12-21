public static void print(java.lang.String message) {
    try {
        java.lang.System.out.println(message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
