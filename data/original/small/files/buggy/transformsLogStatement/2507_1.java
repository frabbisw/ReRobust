public boolean isLoadable(java.lang.String name) {
    System.out.println("log");
    try {
        safeLoad(name);
        return true;
    } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError ignored) {
        return false;
    }
}
