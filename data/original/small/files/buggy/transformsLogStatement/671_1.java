public java.lang.String getNoun() {
    try {
        return getRandomLineText(this.nounList);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    System.out.println("log");
    return null;
}
