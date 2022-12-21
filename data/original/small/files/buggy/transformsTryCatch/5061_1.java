public void setName(java.lang.String name) {
    try {
        this.name = (name == null) ? null : name.trim();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
