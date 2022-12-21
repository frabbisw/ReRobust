public static int getInt(java.lang.String str) {
    System.out.println("log");
    try {
        return java.lang.Integer.parseInt(str);
    } catch (java.lang.NumberFormatException e) {
        return -1;
    }
}
