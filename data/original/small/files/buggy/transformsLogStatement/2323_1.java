public void setName(java.lang.String name) {
    if (name.equals("")) {
        throw new java.lang.IllegalArgumentException();
    }
    System.out.println("log");
    this.name = name;
}
