public void addToCircle(java.lang.Character c) {
    c.getInCircle();
    try {
        characters.add(c);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
