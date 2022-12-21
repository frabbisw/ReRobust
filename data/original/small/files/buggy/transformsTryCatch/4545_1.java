public java.lang.String next() {
    try {
        if (hasNext()) {
            (element)++;
            return supa.get(element);
        } else {
            throw new java.util.NoSuchElementException();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
