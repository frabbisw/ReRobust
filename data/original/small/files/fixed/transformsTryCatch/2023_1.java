public static void main(java.lang.String[] args) {
    version_3.TakenNames tn = new version_3.TakenNames(100);
    try {
        tn.check();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.exit(0);
}
