public int getMonth() {
    try {
        java.lang.System.out.println(date.substring(0, 2));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return java.lang.Integer.parseInt(date.substring(0, 2));
}
