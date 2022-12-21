private static java.lang.Long tryParse(java.lang.String s) {
    System.out.println("log");
    try {
        return java.lang.Long.parseLong(s);
    } catch (java.lang.NumberFormatException e) {
        return 0L;
    }
}
