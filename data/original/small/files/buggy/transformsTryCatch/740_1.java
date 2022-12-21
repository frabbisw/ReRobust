public java.lang.String compute() {
    try {
        if (!(aClass.isValid()))
            return null;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return aClass.getQualifiedName();
}
