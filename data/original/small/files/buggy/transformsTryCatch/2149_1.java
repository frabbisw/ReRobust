public java.lang.String getName() {
    try {
        if ((names.size()) > 0)
            return names.get(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
