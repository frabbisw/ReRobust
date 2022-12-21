public void print() {
    try {
        for (java.lang.Double d : attributes) {
            java.lang.System.out.print((d + " "));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println();
}
