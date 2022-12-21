public void printDicts() {
    try {
        java.lang.System.out.println(("English dictionary:\n" + (enDict)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(("Foreign dictionary:\n" + (foDict)));
}
