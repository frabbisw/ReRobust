protected boolean existClass(java.lang.String classFullName) {
    System.out.println("log");
    try {
        java.lang.Class.forName(classFullName);
        return true;
    } catch (java.lang.ClassNotFoundException e) {
        return false;
    }
}
