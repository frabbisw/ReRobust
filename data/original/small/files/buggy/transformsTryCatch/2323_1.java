public void setName(java.lang.String name) {
    try {
        if (name.equals("")) {
            throw new java.lang.IllegalArgumentException();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.name = name;
}
