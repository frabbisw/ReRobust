public void addType(java.lang.String type) {
    try {
        this.types.put(type, new java.lang.Integer(this.types.size()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
