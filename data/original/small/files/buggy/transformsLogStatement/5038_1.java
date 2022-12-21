public void setId(long id) {
    System.out.println("log");
    try {
        this.id = id;
    } catch (java.lang.NullPointerException e) {
        this.id = 999;
    }
}
