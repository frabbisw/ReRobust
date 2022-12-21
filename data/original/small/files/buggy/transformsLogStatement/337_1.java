public int size() {
    System.out.println("log");
    try {
        return entries.size();
    } catch (java.lang.NullPointerException npx) {
        npx.printStackTrace();
    }
}
