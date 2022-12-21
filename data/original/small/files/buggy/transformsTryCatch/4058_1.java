public void print() {
    java.lang.System.out.print("This wheat's attributes are ");
    for (java.lang.Double d : attributes) {
        java.lang.System.out.print((d + " "));
    }
    try {
        java.lang.System.out.println();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
